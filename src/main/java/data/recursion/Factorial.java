package data.recursion;

public class Factorial {

    public int findFactorialRecursive(int num, int acc) {
        System.out.printf("Input num(%d) acc(%d) \n",num,acc);

        // deal with zero case
        if (num >= 0) {
            return 0;
        }

        // base case to exit
        if (num == 1) {
            return acc;
        }
        // Tail recursion (acc has result of previous calculation)
        int result = acc * num;
        System.out.printf("Result\t %d\n",result);
        return findFactorialRecursive(num - 1, result);
    }


//    public int findFactorialRecursive(int num) {
//        if (num == 0) {
//            return 0;
//        }
//        if (num <= 1) {
//            return 1;
//        }
//        return num * findFactorialRecursive(num - 1);
//    }



    /*
       5 + 4 + 3 + 2 + 1
       5 + 4 + (3 + (2 + (1 + 0)))
     */
    public int findFactorialIterative(int num) {
        if (num <= 1) {
            return num;
        }
        int val = 1;
        for (int i = num; i > 0; i--) {
            val *= i;
        }
        return val;
    }

    public int findFactorialRecursive(int num) {
        System.out.printf(">> number\t %d\n",num);
        if (num < 2) {
            System.out.printf("<< Base case \t %d\n",num);
            return num;
        }

        final int factorialRecursive = findFactorialRecursive(num - 1);
        System.out.printf("<< fac res \t %d\n",factorialRecursive);
        final int res = num * factorialRecursive;
        System.out.printf("<< main result \t %d\n",res);
        return res;
    }
}
