package codility.nest;

class Solution {
    final char LEFT_PAREN = '(';
    final char RIGHT_PAREN = ')';

    final int PROPER_NESTED_TRUE = 1;
    final int PROPER_NESTED_FALSE = 0;

    public int solution(String S) {
        int leftParenCount = 0;
        for (int i = 0; i < S.length(); i++) {
            final char currentChar = S.charAt(i);

            if (currentChar == LEFT_PAREN) {
                leftParenCount++;

                continue;
            }

            if (currentChar == RIGHT_PAREN) {
                leftParenCount--;

                if (leftParenCount < 0) {
                    return PROPER_NESTED_FALSE;
                }
            }
        }

        if (leftParenCount != 0) {
            return PROPER_NESTED_FALSE;
        }

        return PROPER_NESTED_TRUE;
    }
}
