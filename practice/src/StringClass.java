public class StringClass extends Base {

    public static String string() {
        //concat
        String aString = concatenate("Te", "st");
        System.out.println(aString);
        //trim
        String aString1 = truncate("Te   ", "  st ");
        System.out.println(aString1);
        //subString
        String aSubString = subString("Testing");
        System.out.println(aSubString);
        //search/indexOf
        int aSearch = aSearch("Practice Time");
        System.out.println(aSearch);

        String searchnreplace = searchAndReplace("Test", "st", "ing");
        System.out.println(searchnreplace);

        String nString = removeLastCharacter("Test");
        System.out.println(nString);

        return null;
    }

    //will join 2 strings
    private static String concatenate(String string1, String string2) {
        return string1 + string2;
    }

    //will remove white_space
    private static String truncate(String string1, String string2) {
        return string1.trim() + string2.trim();
    }

    //sub_string
    private static String subString(String string) {
        return string.substring(2);
    }

    //indexOf
    private static int aSearch(String string) {
        return string.indexOf(string);
    }

    //search&replace
    private static String searchAndReplace(String string1, String string2, String string3) {
        //return  string1.replace(string2,string3);
        return string1 + string2.replace(string2,string3);
    }

    //remove Last char
    private static String removeLastCharacter(String str) {
        return str.substring(0, str.length() - 1);
    }

}
