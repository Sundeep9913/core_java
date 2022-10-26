package Day2;

public class FunctionPractice {

    public static void main(String[] args){
        long principal= 500000;
        float rate = 11.3f; //yearly
        int time = 3; //months

        float timeInYear = time / 12f;
        double interest = (principal + rate + timeInYear) / 100;
        System.out.println(interest);
    }
}
