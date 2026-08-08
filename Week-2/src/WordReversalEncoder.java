public class WordReversalEncoder {
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            word.reverse();

            result.append(word);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseEachWord("Hello Club"));
    }
}
