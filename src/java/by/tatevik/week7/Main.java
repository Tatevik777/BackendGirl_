package by.tatevik.week7;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Main {
    private static final Set<Character> firstBrackets= Set.of('(','[','{');
    private static final Map<Character,Character> accBrackets= Map.of(')','(','}','{',']','[');

    public static void main(String[] args) {
        int[]nums={0,0,1,1,2,2,3,4,4};
        int[] expectedNums={0,1,2,3,4};
        int[] result= removeDuplicates(nums);
        System.out.println(Arrays.equals(result,expectedNums));
        System.out.println(Arrays.toString(result));


        String brackets= "{[()]}";
        String brackets2= "([{)]}";
        System.out.println(isValid(brackets));
        System.out.println(isValid(brackets2));

    }

    public static int[] removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return Arrays.copyOf(nums, k);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int length=s.length();
        boolean isCorrect=Boolean.TRUE;
        for(int i=0;i < length && isCorrect;i++) {
            char ch=s.charAt(i);
            if(firstBrackets.contains(ch)){
                stack.push(ch);
            } else if(!stack.isEmpty() && accBrackets.get(ch)!=stack.pop()){
                isCorrect=Boolean.FALSE;

            }
            }
        return  isCorrect;
        }


}
