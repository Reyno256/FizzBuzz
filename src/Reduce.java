public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int numSteps = 0;
        while (i>0) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i - 1;
            }
            numSteps++;
        }
        System.out.println(numSteps);
    }
}
