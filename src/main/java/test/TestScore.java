package test;
import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) throws Exception {
        Scanner test = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100");
        int number = Integer.valueOf(test.nextLine());
        System.out.println(testScore(number));
    }
        public static char testScore(int number) throws IllegalAccessException {
            if (number <0){
                throw new IllegalAccessException("Number canot be less than 0");
            }
            if (number < 60) {
                return 'F';
        } 
        else if (number < 70){
            return 'D';
         }
        else if (number < 80){
            return 'C';
        }
        else if (number < 90){
            return 'B';
        }else{
            return 'A';  
        }


}
}