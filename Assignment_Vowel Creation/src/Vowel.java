import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        int vowelCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

// outer for: go through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            // inner for: check against vowel list
            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    vowelCount++;
                    break; // stop checking once matched
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

    }
}
