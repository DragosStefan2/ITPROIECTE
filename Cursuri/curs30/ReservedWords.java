package Cursuri.curs30;

public class ReservedWords {

    /** Given a sentence, reverse the order of the words in the sentence, but not the order of the letters in each word.
     * For example, "Java is fun" should become "fun is Java". */
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
            reversedSentence.append(" ");
        }
    }
        return reversedSentence.toString();
    }
}
