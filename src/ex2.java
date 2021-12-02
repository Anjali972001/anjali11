import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s","as"));
        System.out.println(Pattern.matches("..s","ass"));
        System.out.println(Pattern.matches("..s","mmm"));
    }
}
