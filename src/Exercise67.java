/*
* Write a java program to insert a word in the middle of the another string
* */

public class Exercise67 {

    private final static String str = "Jest ok z tym wszystkim";
    private static String insertWordInTheMiddleString() {

        StringBuilder builder = new StringBuilder(str);
        String word = "nie ";
        builder.insert(10, word);
        return builder.toString();
        }

        private static String insertWordInMiddleString2() {
            String word = "prawie";
            return (str.substring(0,10) + word + " " + str.substring(10));
        }

    public static void main(String[] args) {
        String insertWord = insertWordInTheMiddleString();
        System.out.println(insertWord);

        String insertWord2 = insertWordInMiddleString2();
        System.out.println(insertWord2);
    }
}
