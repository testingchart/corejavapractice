import java.util.*;

public class DataStructures extends Base {

    public static void map() {
        Map<String, List<String>> list = new HashMap<>();

        ArrayList<String> maharashtraList = new ArrayList<>();
        maharashtraList.add("Mumbai");
        maharashtraList.add("Pune");
        maharashtraList.add("Nagpur");
        maharashtraList.add("Satara");

        ArrayList<String> mumbaiList = new ArrayList<>();
        mumbaiList.add("CST");
        mumbaiList.add("Wadala");
        mumbaiList.add("Chembur");
        mumbaiList.add("Bandra");

        list.put("Maharashtra", maharashtraList);
        list.put("Mumbai", mumbaiList);

        System.out.println(list.get("Maharashtra"));
        System.out.println(list.get("Mumbai"));
    }

    public static void arrayList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("add");
        arrayList.add("sub");
        arrayList.add("mul");
        arrayList.add("div");

        for (String s :
                arrayList) {
            System.out.println(s + " at index: " + s.indexOf("mul"));
        }

    }

    public static void array() {
        System.out.println("From array >");
        char[] charArray = new char[5];
        charArray[0] = 'h';
        charArray[1] = 'e';
        charArray[2] = 'l';
        charArray[3] = 'l';
        charArray[4] = '0';

        Arrays.sort(charArray);
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
