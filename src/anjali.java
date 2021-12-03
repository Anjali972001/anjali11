import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class anjali {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.]a-zA-Z)+");
        Matcher m  = p.matcher("abc@gla.ac.in");
        boolean b = m.matches();
        System.out.println(b);
    }//output---> false
}
