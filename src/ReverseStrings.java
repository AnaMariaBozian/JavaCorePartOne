public class ReverseStrings {
    public static void reverseStringForLoopStartToEnd(String txt){
        String result = "";
        char ch;

        for (int i = 0; i < txt.length(); i++){
            ch = txt.charAt(i);
            result = ch + result;
        }

        System.out.println(result);
    }

    public static void reverseStringForLoopEndToStart(String txt){
        String result = "";

        for (int i = txt.length() -1; i >= 0; i--){
            result += txt.charAt(i);
        }

        System.out.println(result);
    }

    public static void reverseStringBuilder(String txt){
        StringBuilder newTxt = new StringBuilder();
        newTxt.append(txt);
        newTxt.reverse();

        System.out.println(newTxt);
    }

    public static void reverseStringCharArray(String txt){
        char[] result = txt.toCharArray();
        for (int i = result.length - 1; i >= 0; i--){
            System.out.print(result[i]);
        }
        System.out.print("\n");
    }

    public static void reverseStringBuffer(String txt){
        StringBuffer bufTxt = new StringBuffer(txt);
        bufTxt.reverse();
        System.out.println(bufTxt);
    }

    public static void main(String[] args) {
        String text = "victor";
        reverseStringForLoopStartToEnd(text);

        reverseStringForLoopEndToStart(text);

        reverseStringBuilder(text);

        reverseStringCharArray(text);

        reverseStringBuffer(text);
    }
}
