import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println(true);
                    scn.close();
                    return;
                } else {
                    while (!st.isEmpty() && st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }

            else {
                st.push(ch);
            }
        }
        
        System.out.println(false);
        scn.close();
    }
}
