package Strings_Stringbuilders;

public class DeleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);  // abcdef
        sb.deleteCharAt(3);
        System.out.println(sb);  // abcef
        sb.append("xyz");
        System.out.println(sb);  // abcefxyz

        // delete -> cefx  ->  idx= (2,6)
            // in .delete() -> index = current index to last index + 1
            // if x -> current index
            // n -> last index (which index was delet)
            // .delete() = (x, n+1)
        sb.delete(2,6);
        System.out.println(sb);  // abyz
        // insert 'g' without remove y
        sb.insert(2, "g"); // there was insert string / char / int / boolean / etc.
        System.out.println(sb);  // abgyz
    }
}

/*
* insert() -> insert a char / int / string / ... at a particular index & shifts the rest of elements
* deleteCharAt() -> you give index, that particular char is remove from the string */
