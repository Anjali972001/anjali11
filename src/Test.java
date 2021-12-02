import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        String s = "AnjaliAmanAkashAnamikaAayaAman";
        Pattern p = Pattern.compile("Aman");
        Matcher m = p.matcher(s);
        while(m.find())
        {
            count++;
            System.out.println(m.start()+" "+m.end());
        }
        System.out.println(count);
    }
}
