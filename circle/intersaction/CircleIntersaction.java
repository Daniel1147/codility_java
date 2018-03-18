package circle.intersaction;

import java.util.Arrays;

class CircleIntersaction {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        long[] startP = new long[len];
        long[] endP = new long[len];

        printA(A);

        for (int i = 0; i < len; i++) {
            startP[i] = (long)i - (long)A[i];
            endP[i] = (long)i + (long)A[i];
        }


        Arrays.sort(startP);
        Arrays.sort(endP);

        // printA(startP);
        // printA(endP);

        int i, j;
        int currentIn = 0;
        int sum = 0;

        i = 0;
        for (j = 0; j < len;) {
            // System.out.println(currentIn);
            if (i < len && startP[i] <= endP[j]) {
                // touchStart(startP[i]);
                currentIn++;
                i++;
                continue;
            }

            // touchEnd(endP[j]);
            currentIn--;
            sum += currentIn;

            if (sum > 10000000) {
                return -1;
            }

            j++;
        }

        return sum;
    }

    public static void main(String[] args) {
        CircleIntersaction s = new CircleIntersaction();

        int[] input;
        // int[] input = new int[]{1, 5, 2, 1, 4, 0};
        input = new int[]{1, 5, 1};
        s.test(input, 3);

        input = new int[]{1, 5, 2, 1, 4, 0};
        s.test(input, 11);

        input = new int[]{0, 0};
        s.test(input, 0);

        input = new int[]{0, 0, 0};
        s.test(input, 0);
    }

    public void test (int[] input, int expected) {
        int ans = solution(input);

        System.out.println(ans);
        System.out.println(expected);

        return;
    }

    private void printA(long[] a) {
        System.out.println(Arrays.toString(a));
    }

    private void printA(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    private void touchStart(long num) {
        System.out.println("touchStart " + num);
    }

    private void touchEnd(long num) {
        System.out.println("touchEnd " + num);
    }
}
