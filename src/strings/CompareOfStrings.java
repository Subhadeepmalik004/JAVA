package strings;

public class CompareOfStrings {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        System.out.println(a.compareTo(b)); // a.charAt(i) - b.charAt(i)
    }
}

// a or b are same then output ==>> 0
// a = "abc"
// b = "abc"
// output = 0

// not same count only extra string
// a = "abcgggg"
// b = "abc"
// output = 4

// or a ka 1st index or b ka 2nd index are
// same
// a = "a"
// b = "a"
// output = 0

// not same
// a = "a"          {a -> 97}
// b = "b"          {b -> 98}
// output = -1      {97 - 98 = -1}
