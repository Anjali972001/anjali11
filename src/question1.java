import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[nN]?[a-zA-Z]{12}");
        Matcher m = p.matcher("NISHANT");
        boolean b = m.matches();
        System.out.println(b);
    }
}
