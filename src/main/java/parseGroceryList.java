import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class parseGroceryList {
    Integer errors;

    public parseGroceryList() {
        this.errors = 0;
    }
        public static String remSpChar(String list) {
        //replace unnecessary special characters with a blank space
            Pattern pattern1 = Pattern.compile("[^%*@!]");
            Matcher match1 = pattern1.matcher(list);
            match1.find ();
            return match1.replaceAll ( "" );
        }

        public static String findBreaks(String list) {
        Integer counter = 0;
        //uses item breaks of ## in JerkSon to see how many items are in grocery list and separate
            Pattern pattern2 = Pattern.compile ( "##" );
            Matcher match2 = pattern2.matcher ( list );
            match2.find ();
            while (match2.find ()) {counter++;}
            return match2.replaceAll ( "\n" );
        }

        public static String fixMilk (String list) {
        //looks for all forms of milk and converts it to "milk"
        Pattern pattern3 = Pattern.compile ("^(?i)milk" );
        Matcher match3 = pattern3.matcher ( list );
        match3.find ();
        return match3.replaceAll ( "Milk" );
        }

        public static String fixCookies(String list) {
        //looks for all froms of cookies (including 0 for o) and converts to "cookies"
        Pattern pattern4 = Pattern.compile ( "(?i)c[o0][o0]kies" );
        Matcher match4 = pattern4.matcher ( list );
        match4.find ();
        return match4.replaceAll ( "Cookies" );
        }

        public static String fixBread(String list) {
        //looks for all forms of bread and converts to "bread"
            Pattern pattern5 = Pattern.compile ( "(?i)bread" );
            Matcher match5 = pattern5.matcher ( list );
            match5.find ();
            return match5.replaceAll ( "Bread" );
        }

        public static String fixApples(String list) {
        //looks for all forms of apples and converts to "apples"
            Pattern pattern6 = Pattern.compile("(?i)apples");
            Matcher match6 = pattern6.matcher ( list );
            match6.find ();
            return match6.replaceAll ( "Apples" );
        }


}
