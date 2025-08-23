import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with mixed formatting:");
        String input = scanner.nextLine();

        System.out.println("\n--- Basic Processing ---");
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Trimmed: \"" + input.trim() + "\"");
        System.out.println("Replace spaces with underscores: " + input.replace(' ', '_'));
        System.out.println("Remove all digits: " + input.replaceAll("\\d", ""));
        String[] words = input.trim().split("\\s+");
        System.out.println("Words array: " + Arrays.toString(words));
        System.out.println("Joined with | : " + String.join(" | ", words));

        System.out.println("\n--- Additional Processing ---");
        String noPunct = removePunctuation(input);
        System.out.println("Without punctuation: " + noPunct);
        System.out.println("Capitalized words: " + capitalizeWords(noPunct));
        System.out.println("Reversed word order: " + reverseWordOrder(noPunct));
        System.out.println("Word frequency: ");
        countWordFrequency(noPunct);

        scanner.close();
    }

    public static String removePunctuation(String text) {
        return text.replaceAll("\\p{Punct}", "");
    }

    public static String capitalizeWords(String text) {
        String[] words = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.length() > 0) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1).toLowerCase())
                  .append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static String reverseWordOrder(String text) {
        String[] words = text.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void countWordFrequency(String text) {
        String[] words = text.trim().toLowerCase().split("\\s+");
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        for (String w : words) {
            freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
