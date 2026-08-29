public class stringMethods {
    public static void main(String[] args) {
        String name = "Ekta Sahu";
        String name1 = "ekta sahu";

        //Length of string
        int length = name.length();
        System.out.println(length);

        //charAt method
        char ch = name.charAt(length - 1);
        System.out.println(ch);

        // Equality of strings
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));

        // compareTo $ compareTo method
        String a = "remote";
        String b = "rimote";
        String c = "REMOTE";
        System.out.println('e' + 0);
        System.out.println('a' + 0); //101-97=4
        int i = a.compareTo(b);
        System.out.println(i);
        int j = a.compareToIgnoreCase(b);
        System.out.println(j);

        //substring and subsequence method
        String name2 = "Harry Potter";
        String substring = name2.substring(6); // returns string
        String substring1 = name2.substring(6, 9); // end-1
        System.out.println(substring);
        System.out.println(substring1);
        System.out.println(name2.subSequence(6,9)); // returns charSequence

        //other methods   (string is immutable/returns a new string)
        System.out.println(name2.toLowerCase());
        System.out.println(name2.toUpperCase());
        System.out.println(name2.trim());
        System.out.println(name2.replace("Potter", "Puttar").toUpperCase());
        System.out.println(name2.contains("Pot"));
        System.out.println(name2.startsWith("Har"));
        System.out.println(name2.endsWith("er"));
        String d = " ";
        System.out.println(d.isEmpty());
        System.out.println(d.isBlank());
        System.out.println(name2.indexOf('a'));
        System.out.println(name2.lastIndexOf('P',9));
        System.out.println(name2.indexOf('r',6));

        //string conversion
        int x = 10;
        String s = String.valueOf(x);
        System.out.println(s);

        //string format
        String batman = String.format("My name is %s and i am %d years old.", "Batman", 35);
        System.out.println(batman);

        char y = 'a';
        char z = 'b';
        System.out.println('a' +0);
        System.out.println('b' +0);
        System.out.println(y < z);

        String _a = "Pool";
        String _b = "Pool";
        String _c = new String("Pool");
        System.out.println( _a == _b);
        System.out.println( _c == _b);

    }
}
