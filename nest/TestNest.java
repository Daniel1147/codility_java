package codility.nest;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class TestNest {
    public static void main(String args[]) {
        List<String> inputList = new ArrayList<String>();

        // input 1
        inputList.add("(()(())())");

        // input 2
        inputList.add("())");

        // input 3
        inputList.add("(())");

        // input 4
        inputList.add("(");

        // input 5
        inputList.add(")");

        Solution solution = new Solution();

        for (int i = 0; i < inputList.size(); i++) {
            final String input = inputList.get(i);

            System.out.printf(
                "input: %s\nans: %d\n",
                input,
                solution.solution(input)
            );
        }
    }
}
