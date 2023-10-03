public class StringCharacters {
    public static void main(String[] args)
    {
        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";
        int spaces = 0, vowels = 0, letters = 0, consonants = 0;

        // Iterate through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i)); // Convert character to lowercase for case-insensitive comparison
            if (ch == ' ') {
                spaces++;
            } else if (ch >= 'a' && ch <= 'z') {
                // Check if it's a vowel (a, e, i, o, u)
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
                letters++;
            }
        }

        System.out.println("The text contained vowels: " + vowels + "\n" +
                "consonants: " + consonants + "\n" +
                "letters: " + letters + "\n" +
                "spaces: " + spaces);
    }
}

