import java.util.*;


public class DuplicatesUsingSort {
    public static void main(String args[]) {
        int[] array = new int[]{1,2,3,4,5,6,4,3};
//        String[] array = new String[] {"abc", "def", "hij", "abc", "def","hij"};
        Arrays.sort(array);

        for(int i=0; i<array.length-1; i++) {
            System.out.println(i);
            if(array[i] == (array[i+1])) {
                System.out.println(array[i+1] + " is a duplicate");
            }
        }

    }
}
