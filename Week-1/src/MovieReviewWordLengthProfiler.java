public class MovieReviewWordLengthProfiler {
    public static void classifyWordLengths(String review) {
        String[] words = review.trim().split("\\s+");
        int shortWords = 0, mediumWords = 0, longWords = 0;

        for (String word: words) {
            if (word.length() >= 1 && word.length() <= 4) {
                shortWords++;
            } else if  (word.length() >= 5 && word.length() <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }
        System.out.println("Short: " + shortWords + " | Medium: " + mediumWords + " | Long: " + longWords);
    }

    public static void main(String[] args) {
        String review = "This movie was absolutely fantastic and thrilling";
        classifyWordLengths(review);
    }
}
