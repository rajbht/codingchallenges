import java.util.Scanner;

/**
 Complete this function which takes an integer N, the height of the staircase as its argument and prints a staircase as shown in the example.
 Constraints:
 1 <= N <= 100

 Sample Input :
 N = 6

 Sample output :

         #
        ##
       ###
      ####
     #####
    ######

 Note: There are no leading spaces in the last line of the output
 */

public class StairCase {

    static void StairCase(int n) {
        StringBuilder sb = new StringBuilder(n);
        String fmt = "%"+n+"s\n";
        for (int i=1;i<=n;i++){
            sb.append('#');
            System.out.printf(fmt, sb);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StairCase(sc.nextInt());
    }
}
