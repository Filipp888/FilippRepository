import org.graalvm.compiler.core.common.type.ArithmeticOpTable;


public class Test {
    public static void main(String[] args){
        int a = 70;
        int b = 10;
        System.out.println(sum(a,b));
        System.out.println(div(a,b));
    }
    public static int sum(int a, int b){
        return a + b;
    }

    public static int div(int a, int b){
        return a - b;
    }
}
