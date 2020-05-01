import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DataTypes extends Base {
    public static void primitiveTypes(){
        int i = 0;
        char c = 0;
        boolean isture;
        float f = 0;
        double d = 0;
        byte b = 0;
        short s = 0;

        System.out.println("PRIMITIVE TYPES");
        System.out.println(i);
        System.out.println(c);
        System.out.println(true);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);
    }
    public static void referenceTypes(){
        //Wrapper - non_array_types
        Boolean b;
        Integer i = null;
        Float f = null;
        Double d = null;
        Character c = null;
        Byte b1 = null;
        Short s = null;

        System.out.println("NON PRIMITIVE TYPES");
        System.out.println(true);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b1);
        System.out.println(s);

        //non-wrapper types  non_array_types
        String string = "practice code";
        Date date = new Date(); //research
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy:HH:mm:ss");
        System.out.println(string);
        System.out.println(date.getTime());
        System.out.println(dateFormat.format(date));

        //Array Types
        int[] i1 = new int[]{1,2,3,4,5};
        String[] strings = new String[] {"non", "primitive", "type"};
        float[] f1 = new float[] {1.1f,1.2f,1.3f};
        Integer[] i2 = new Integer[]{1,2,3,4,5};
        Float[] f2 = new Float[0]; //figureOut on your own

        System.out.println(Arrays.toString(i1));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(f1));
        System.out.println(Arrays.toString(i2));
        System.out.println(Arrays.toString(f2));
    }
}
