package Java_8;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "Anand".toLowerCase();

        Character chr = str.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst()
                .orElse(null);
        System.out.println(chr);
    }
}
