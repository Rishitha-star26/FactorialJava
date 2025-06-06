public class StringArrayExample {
    public static void main(String[] args) {
        String sentence = "I am proud vitian";

        // 1. Split into array of words
        String[] words = sentence.split(" ");

        // 2. Print array contents
        System.out.println("Words in the array:");
        for (String word : words) {
            System.out.println(word);
        }

        // 3. Convert each word to uppercase
        System.out.println("\nWords in uppercase:");
        for (String word : words) {
            System.out.println(word.toUpperCase());
        }

        // 4. Reverse each word
        System.out.println("\nReversed words:");
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
        }

        // 5. Print length of each word
        System.out.println("\nLength of each word:");
        for (String word : words) {
            System.out.println(word + ": " + word.length());
        }
    }
}
