package homework.h04;

// advanced
// https://leetcode.com/problems/number-complement/submissions/2204782115/
public class T2 {
    public int findComplement(int num) {
        int mask = 0;
        int temp = num;

        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return num ^ mask;
    }
}
