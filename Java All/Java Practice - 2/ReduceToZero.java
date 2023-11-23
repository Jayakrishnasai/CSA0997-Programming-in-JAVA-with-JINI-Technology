public class ReduceToZero {
    public static void main(String[] args) {
        int num = 15;
        int steps = numberofSteps(num);
        System.err.println("Number of Steps to Reduce "+num+"to zero: "+steps);
    }
    public static int  numberofSteps(int num) {
        int steps = 0;
        while(num > 0 ) {
            if(num % 2 == 0) {
                num /=2;
                System.err.println(num);
            }else{
                num -= 1;
                System.err.println(num);
            }
            steps++;
        }
        return steps;
    }
}
