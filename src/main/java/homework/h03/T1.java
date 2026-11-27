package homework.h03;

// base
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/submissions/2204267740/
public class T1 {
    public double average(int[] salary) {int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int amount : salary) {
            sum += amount;
            min = Math.min(min, amount);
            max = Math.max(max, amount);
        }

        return (double) (sum - min - max) / (salary.length - 2);

    }


}