public class TrafficSignalStreakAnalyzer {
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) return;

        int maxStreak = 0;
        char maxChar = ' ';
        int currentStreak = 1;
        char currentChar = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentStreak++;
            } else {
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    maxChar = currentChar;
                }
                currentChar = signalLog.charAt(i);
                currentStreak = 1;
            }
        }
        // Final check in case the longest streak is at the very end of the string
        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
            maxChar = currentChar;
        }
        System.out.println("Longest Streak: '" + maxChar + "' repeated " + maxStreak + " times");
    }

    public static void main(String[] args) {

        String signalLog1 = "RRGGGYRR";
        String signalLog2 = "RRRRYYGG";

        System.out.println("Test Case 1:");
        findLongestStreak(signalLog1);

        System.out.println();

        System.out.println("Test Case 2:");
        findLongestStreak(signalLog2);
    }
}

