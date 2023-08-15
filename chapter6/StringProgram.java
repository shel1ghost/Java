public class StringProgram{
    public static void main(String[]args){
        //converting uppercase to lowercase
        String str = "ASTRA";
        String lwr = str.toLowerCase();
        System.out.println(lwr);

        //converting lower to uppercase
        String str2 = "astra";
        String upr = str.toUpperCase();
        System.out.println(upr);

        //finding substring of word "Reminder" from index 2-5
        String str3 = "Reminder";
        String sub = str3.substring(2, 5);
        System.out.println(sub); //min

        //finding character at position 5 in above string
        char chr = str3.charAt(5);
        System.out.println(chr);

        //appending integer at the end of string
        StringBuffer str4 = new StringBuffer("Paradox");
        int num = 123;
        str4.append(num);
        System.out.println(str4); //Paradox123
    }
}
