
public class Duplicates {
    public static void main(String args[]) {
        int[] array = new int[]{1,1,2,3,4,5,6,4,3};
//        String[] array = new String[] {"abc", "def", "hij", "abc", "def","hij"};

        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                System.out.println(i + "," + j);
                if (array[i] == (array[j])) {
                    System.out.println(array[i] + " is a duplicate");
                }
            }
        }

    }
}
