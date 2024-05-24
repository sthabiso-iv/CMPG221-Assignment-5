/**
  *
  * @author (32465092 MSM Dhlamini)
  * @version (15 September 2023)
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        for (char c : str.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }

        return stack.isEmpty() && queue.isEmpty();
    }

    public static void main(String[] args) {
        String[] strings = {"peep", "car", "rat", "otto", "mthokozisi", "omo", "level", "orange", "grape", "rotor"};

        boolean[] results = new boolean[strings.length];

        for (int i = 0; i < strings.length; i++) {
            results[i] = isPalindrome(strings[i]);
        }

        System.out.println(java.util.Arrays.toString(results));
    }
}

