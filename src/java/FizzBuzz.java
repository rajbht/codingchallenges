package java;

public class FizzBuzz {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                sb = sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb = sb.append("Buzz");
            }
            System.out.println(sb.length() == 0 ? i : sb);
            sb.setLength(0);
        }
    }

}
