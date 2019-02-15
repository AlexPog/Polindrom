import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetStrings {
    private static String text;
    private static String reverseText;

    public GetStrings(String s) {

    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        text = reader.readLine ();
        String reverse = new StringBuffer(text).reverse().toString();
        for (int i = 0; i < text.length (); i++) {
            if (text.indexOf ('o') != -1) {
                String rep = text.replace ('o', 'a');
                System.out.println (rep);
                if (text.equals (null))
                    throw new NullPointerException ("NullPointerException");
                if (reverse.equals (text))// replace all string letters ferst replace all...
                    throw new Exception ("Polindrone");
                } else
                System.out.println (reverse);
            }
        }
    }


