import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern p =Pattern.compile("anjali");
        Matcher m = p.matcher("Anjaliccc");
        Matcher m1 = p.matcher("anjali");
        boolean c=m1.matches();
        boolean b = m.matches();
        System.out.println(b);//false
        System.out.println(c);//true
    }

}
