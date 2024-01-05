/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        if (args.length > 0) {
            String str = args[0];
            System.out.println(lowerCase(str));
        }
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String lowerCaseStr = "";
        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    lowerCaseStr += (char) ((int) s.charAt(i) + 32);
                }
                else {
                    lowerCaseStr += s.charAt(i);
                }
            }  
        }
        return lowerCaseStr;
    }
}
