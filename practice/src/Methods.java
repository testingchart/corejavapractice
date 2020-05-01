public class Methods extends Base {
    public static void voids(){
        int x =1; int y=2;
        int z = x+y;
        System.out.println("From void "+z);
    }
    public static boolean booleans(){
        System.out.println("From boolean");
        return true;
    }
    public static int integers(){
        System.out.println("From int");
        return 12;
    }
    public static String strings(){
        System.out.println("From string");
        return "Hell0!";
    }
    public static double doubles(){
        System.out.println("From double");
        return 1.234;
    }
    public static String parameterizedMethod(String name){
        System.out.println("Parameterized Method");
        return name;
    }
    public static String userLogin(String userName, int pwd){
        System.out.println("More about Methods");
        return userName+" "+pwd ;
    }

}
