import java.util.*;

public class Main {

    public static void main(String[] args) {
        int [] arr = {2,3,1};
        System.out.println("Hello World!");
        Arrays.sort(arr);
        String str ="abcde";
        str = str.substring(2, str.length());
        System.out.println(str);

    }
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }


    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < res.length; i++) {
            while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                int n = stack.peek();
                res[stack.pop()] = i - n;
            }
            stack.push(i);
        }
        return res;
    }

}

