@FunctionalInterface
public interface Calculate {
    int calculate(int a, int b);
    default void add(){
        System.out.println("adding");
    }
    private void print(){
        System.out.println("salom");
    }
}
