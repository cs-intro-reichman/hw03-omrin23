/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        if (args.length > 0) {
            String str = args[0];
            System.out.println(uniqueChars(str));
        }
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String noDuplicates = "";
        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (noDuplicates.length() > 0) {
                    if (s.charAt(i) != ' ') {
                        if (noDuplicates.indexOf(s.charAt(i)) == -1) {
                            noDuplicates += s.charAt(i);
                        }
                    }
                    else {
                        noDuplicates += s.charAt(i);
                    }
                }
                else {
                    noDuplicates += s.charAt(i);
                }
            }
        }
        return noDuplicates;
    }
}
