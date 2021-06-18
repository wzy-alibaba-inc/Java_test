package homework;

public class ProgramOptimization {


    public static void main(String[] args) {
        int[] classA = {65, 44, 66, 80, 90, 200, 45, 59};
        int[] classB = {60, 40, 68, 80, 95, 38, 45, 59};
        int[] classC = {60, 30, 68, 58, 93, 28, 45, 59};
        num(classA);
        num(classB);
        num(classC);
    }

    private static void num(int[] array) {
        int sum=0;
        for(int i=0; i< array.length; i++){
            int score=array[i];
            if(score>=60){
                sum++;
            }
        }
        System.out.println("及格人数为："+sum);
    }
}