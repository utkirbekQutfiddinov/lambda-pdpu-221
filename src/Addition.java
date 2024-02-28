public class Addition implements Calculate{

    @Override
    public int calculate(int a, int b) {
        return a+b;
    }

    public static void print(Integer integer) {
        System.out.println(integer);
    }

    public static int getInt(){
        return 0;
    }

    public static boolean check(Integer a){
        return a>18;
    }
}
