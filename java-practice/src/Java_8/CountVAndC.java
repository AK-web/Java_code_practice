package Java_8;

public class CountVAndC {
    public static void main(String[] args) {
        String str = "hello";

        long vowels = str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1).count();
        long consonants = str.replaceAll("[^a-zA-Z]", "").length()-vowels;

        System.out.println("Vowels: " + vowels);
        System.out.println("consonants: " + consonants);

    }
}
