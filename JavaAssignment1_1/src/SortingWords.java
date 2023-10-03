public class SortingWords {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Step 1: Extract words from the text
        String[] words = text.split("[\\s.,;`]+"); // Split text using spaces, punctuation, and backticks as delimiters

        // Convert words to lowercase
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        // Sort the array using the bubble sort algorithm
        bubbleSort(words);

        // Print the sorted words
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Bubble sort algorithm for sorting an array of strings
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped = true;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}


