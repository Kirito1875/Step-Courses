public class DuplicateSeatChecker {
    public static void checkDuplicateSeats(int[] seatnos) {
        boolean duplicateFound = false;
        for (int i = 0; i < seatnos.length; i++) {
            for (int j = 1 + i; j < seatnos.length; j++) {
                if (seatnos[i] == seatnos[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatnos[i]);
                    duplicateFound = true;

                }
            }
        }
        if (!duplicateFound) {
            System.out.println("No Duplicate Seat Number Found");
        }
    }

    public static void main(String[] args) {
        int[] s1 = {101, 102, 103, 102, 105, 103};
        int[] s2 = {101, 102, 103, 104, 105, 106};

        System.out.println("Test Case 1: ");
        checkDuplicateSeats(s1);
        System.out.println("Test Case 2: ");
        checkDuplicateSeats(s2);

    }
}
