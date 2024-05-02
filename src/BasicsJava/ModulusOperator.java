package BasicsJava;

public class ModulusOperator {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        System.out.println(a%b);
        System.out.println(3%23);// a%b = a  [ a < b]
        System.out.println(5%(2));// a%(-b) = a%b
        System.out.println((-5)%2);// (-a)%b = -[a%b]
        System.out.println((-5)%(-2));// (-a)%(-)b = -[a%b]
    }
}
