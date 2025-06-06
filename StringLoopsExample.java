public class StringLoopsExample {
    public static void main(String[] args) {
        String sentence = "I am proud vitian";
        String[] words = sentence.split(" ");

        // 1. For loop - print each word
        System.out.println("Using for loop:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // 2. For-each loop - print each word
        System.out.println("\nUsing for-each loop:");
        for (String word : words) {
            System.out.println(word);
        }

        // 3. While loop - print each word
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < words.length) {
            System.out.println(words[i]);
            i++;
        }

        // 4. Do-while loop - print each word
        System.out.println("\nUsing do-while loop:");
        int j = 0;
        do {
            System.out.println(words[j]);
            j++;
        } while (j < words.length);
    }
}
