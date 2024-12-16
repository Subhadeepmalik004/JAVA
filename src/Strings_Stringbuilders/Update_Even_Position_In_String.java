package Strings_Stringbuilders;

public class Update_Even_Position_In_String {
    public static void main(String[] args) {
        String s = "Subhadeep Malik";
        String str = "";
        for(int i=0; i<s.length();i++) {
            if(i%2 == 0) {
                str += 'a';
            }
            else {
                str += s.charAt(i);
            }
        }
        System.out.println(str);
    }
}
