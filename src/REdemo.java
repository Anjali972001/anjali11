import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REdemo {
    public static void main(String[] args) {

      String str ="the quick999999jdbc abc@gmail.com brown787878 foxx ju234523mps jdbc";//target  string
       String str1 = "b%#@abcdbbb9887 &";
       //Pattern p = Pattern.compile("[b]?");
      Pattern p = Pattern.compile("\\W");// \w --- alpha numeric character.
        Matcher m = p.matcher(str);
      int ctr =0;

        while (m.find())//overloaded method
        {
            System.out.println(m.start()+ "-----------"+ m.end()+ "-----" + m.group());
            ctr++;
        }
        System.out.println("no of counts = " +ctr);

    }
}
