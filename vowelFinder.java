public class VowelFinder {
    
    // Simple method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);  // Convert to lowercase for comparison
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static void main(String[] args) {
        // The text we want to check
        String text = "Hello World";
        
        // Array to store the vowels we find
        char[] foundVowels = new char[text.length()];
        int count = 0;
        
        // Print the original text
        System.out.println("Text: " + text);
        System.out.println("\nVowels found: ");
        
        // Go through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            
            // If it's a vowel, add it to our array
            if (isVowel(letter)) {
                foundVowels[count] = letter;
                count++;
                System.out.print(letter + " ");
            }
        }
        
        // Print results
        System.out.println("\n\nTotal vowels: " + count);
        System.out.println("All vowels in array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(foundVowels[i] + " ");
        }
    }
}
