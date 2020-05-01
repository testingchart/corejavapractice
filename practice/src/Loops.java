public class Loops extends Base {
    public static void forLoops(){
        System.out.println("From forLoops >");
        for (int i = 1; i <= 10; i++){
            for (int j = 0; j <= 10;j++){
                System.out.println(j);
            }
            System.out.println(i);
        }
    }
    public static void whileLoops(){
        int i =0;
        System.out.println("From whileLoops >");
        while (i <= 17){
            System.out.println(i);
            i++;
        }
    }
}
