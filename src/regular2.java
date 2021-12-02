import java.util.regex.Pattern;

public class regular2 {
    public static void main(String[] args) {
        boolean b = Pattern.compile("as").matcher("ass").matches();
        boolean b1= Pattern.matches("aas","as");
        System.out.println(b);
        System.out.println(b1);
    }
}
