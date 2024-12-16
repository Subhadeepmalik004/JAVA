package Strings_Stringbuilders;

public class modifyCharacterInString {
    public static void main(String[] args) {
        String s ="Hello";
        // change -> Heylo
        // 2nd index change to y
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);

        // String can not change
    }
}
