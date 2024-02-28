import java.util.concurrent.Callable;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println(add(1,3));

//        run(new Addition(), 2, 4);
//        run(new Subtraction(), 2, 4);

        Calculate sub = (a, b) -> a - b;


        Supplier<Integer> getRand = Addition::getInt;
        Supplier<Integer> getOne = () -> 1;
        Consumer<Integer> consumer = Addition::print;

        Consumer<Integer> consumer1 = (a) -> System.out.println(a * 2);

//        consumer.andThen(consumer1).accept(12);

        Predicate<Integer> isOver18 = Addition::check;
        Predicate<Integer> isLower27 = (a) -> a < 27;

//        System.out.println(isOver18.test(15));
//        System.out.println(isOver18.negate().test(15));
        System.out.println(isOver18.and(isLower27).test(30));

        System.out.println(isOver18.or((a) -> a > 50).test(60));


        Function<Integer, Boolean> checker = i -> i > 18;
        checker.andThen((a) -> {
            if (a) {
                System.out.println("18 dan katta");
            } else {
                System.out.println("18 dan katta emas");
            }
            return a;
        });


        BinaryOperator<Integer> op = (integer, integer2) -> integer * 2;

        int sum = 2;

//        System.out.println(op.apply(10,sum));

        UnaryOperator<Integer> uno = integer -> integer + 3;

//        System.out.println(uno.apply(5));

        BiFunction<Integer, Integer, Integer> bif = (son, text) -> son + text;

        System.out.println(bif.apply(12, 45));


//        for (int i = 0; i < 100; i++) {
//            int son = getRand.get();
////            if (isOver18.test(son)) {
////                consumer.accept(son);
////            }
//            if(checker.apply(son)) {
//                consumer.accept(son);
//            }
//
//        }


//        () -> {}


        /**
         * () -> { }
         * metod reference
         * supplier: gets nothing, returns something
         * consumer: gets something, returns nothing
         * predicate: gets something, returns boolean
         * function: gets 1 smth, retruns one result
         * bifunction: gets 2 smth, returns one result
         * unaryOperator: gets smth, makes changes and returns
         * binaryOperator: gets 2 smth, makes changes and returns
         */

    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static void run(Calculate calculate, int a, int b) {
        System.out.println(calculate.calculate(a, b));
    }
}