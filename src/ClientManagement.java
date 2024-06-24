import java.util.Scanner;

public class ClientManagement {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] myClientsArray = new String[10];
        int[] myClientNumbers = new int[10];

        // Populate the arrays with initial values
        myClientsArray[0] = "Butler";
        myClientsArray[1] = "Samuels";
        myClientsArray[2] = "Townsend";
        myClientsArray[3] = "Chang";
        myClientsArray[4] = "Baker";
        myClientsArray[5] = "Davis";
        myClientsArray[6] = "Zheng";
        myClientsArray[7] = "Joe";
        myClientsArray[8] = "Adams";
        myClientsArray[9] = "Clarke";

        myClientNumbers[0] = 108;
        myClientNumbers[1] = 121;
        myClientNumbers[2] = 188;
        myClientNumbers[3] = 107;
        myClientNumbers[4] = 122;
        myClientNumbers[5] = 111;
        myClientNumbers[6] = 203;
        myClientNumbers[7] = 135;
        myClientNumbers[8] = 145;
        myClientNumbers[9] = 169;

        // Perform linear search on client names
        System.out.print("Enter the client name to search: ");
        String clientName = sc.nextLine();
        linSearchString(myClientsArray, clientName);

        // Perform linear search on client numbers
        System.out.print("Enter the client number to search: ");
        int clientNumber = sc.nextInt();
        linSearchInt(myClientNumbers, clientNumber);

        // Update some elements in the arrays
        myClientsArray[3] = "Smith";
        myClientNumbers[3] = 199;

        // Display the updated arrays
        System.out.println("Updated client names and numbers:");
        displayArrays(myClientsArray, myClientNumbers);

        // Sort the arrays
        bubbleSort(myClientsArray, myClientNumbers);
        System.out.println("Sorted client names and numbers (Bubble Sort):");
        displayArrays(myClientsArray, myClientNumbers);

        // Repopulate the arrays to original state
        myClientsArray[3] = "Chang";
        myClientNumbers[3] = 107;

        insertionSort(myClientsArray, myClientNumbers);
        System.out.println("Sorted client names and numbers (Insertion Sort):");
        displayArrays(myClientsArray, myClientNumbers);
    }

    public static void linSearchString(String[] strArray, String search) {
        int i;
        boolean found = false;
        for (i = 0; i < strArray.length; i++) {
            if (search.equals(strArray[i])) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Item found at position " + (i + 1));
        else
            System.out.println("Item not found");
    }

    public static void linSearchInt(int[] intArray, int search) {
        int i;
        boolean found = false;
        for (i = 0; i < intArray.length; i++) {
            if (search == intArray[i]) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Item found at position " + (i + 1));
        else
            System.out.println("Item not found");
    }

    public static void displayArrays(String[] strArray, int[] intArray) {
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i] + ": " + intArray[i]);
        }
    }

    public static void bubbleSort(String[] strArray, int[] intArray) {
        int n = strArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (strArray[j].compareTo(strArray[j + 1]) > 0) {
                    // Swap names
                    String tempStr = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = tempStr;
                    // Swap numbers
                    int tempInt = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tempInt;
                }
            }
        }
    }

    public static void insertionSort(String[] strArray, int[] intArray) {
        int n = strArray.length;
        for (int i = 1; i < n; ++i) {
            String keyStr = strArray[i];
            int keyInt = intArray[i];
            int j = i - 1;

            while (j >= 0 && strArray[j].compareTo(keyStr) > 0) {
                strArray[j + 1] = strArray[j];
                intArray[j + 1] = intArray[j];
                j = j - 1;
            }
            strArray[j + 1] = keyStr;
            intArray[j + 1] = keyInt;
        }
    }
}
