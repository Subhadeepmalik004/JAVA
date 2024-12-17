package Strings_Stringbuilders;

public class StringBuilderInJava {
    public static void main(String[] args) {
        String s = new String("Subha");
        StringBuilder sb = new StringBuilder("Subhadeep");
        System.out.println(sb);
        System.out.println(sb.length());  // 9
        System.out.println(sb.capacity());  // 16 + 9 = 25
        System.out.println();

        System.out.println("Empty String");
//        StringBuilder x = new StringBuilder("");
        StringBuilder x = new StringBuilder();
        System.out.println(x);
        System.out.println(x.length());
        System.out.println();

        System.out.println("Capacity");
        StringBuilder a = new StringBuilder(10);
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.capacity());
        System.out.println();

        System.out.println("Empty capacity");
        StringBuilder c = new StringBuilder();  // 16
        System.out.println(c.length());
        System.out.println(c.capacity());
    }
}
