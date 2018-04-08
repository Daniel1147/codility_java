package codility.fish;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class TestFish {
    public static void main(String[] args) {
        List<int[]> inputAList = new ArrayList<int[]>();
        List<int[]> inputBList = new ArrayList<int[]>();

        int[] inputA, inputB;

        // input 1
        inputAList.add(new int[]{4, 3, 2, 1, 5});
        inputBList.add(new int[]{0, 1, 0, 0, 0});

        // input 2
        inputAList.add(new int[]{4, 3, 2, 1, 5});
        inputBList.add(new int[]{0, 1, 1, 0, 0});

        // input 3
        inputAList.add(new int[]{4, 3, 2, 1, 5});
        inputBList.add(new int[]{1, 1, 1, 1, 1});

        // input 4
        inputAList.add(new int[]{4, 3, 2, 1, 5});
        inputBList.add(new int[]{0, 0, 0, 0, 0});

        // input 5
        inputAList.add(new int[]{4, 3, 2, 1, 5});
        inputBList.add(new int[]{1, 1, 1, 1, 0});

        Solution solution = new Solution();

        for (int i = 0; i < inputAList.size(); i++) {
            inputA = inputAList.get(i);
            inputB = inputBList.get(i);

            System.out.printf(
                "A: %s\nB: %s\nans: %d\n",
                Arrays.toString(inputA),
                Arrays.toString(inputB),
                solution.solution(inputA, inputB)
            );
        }
    }
}
