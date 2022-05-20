package test;
import java.util.*;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 212:");
        int myNum = scanner.nextInt();
        System.out.println(checkWaterTemp(myNum));
    }
    public static String checkWaterTemp(int myNum){
        if (myNum>212){
                return "Water is boiling";
             } else{
                return "Water is not boiling";
                   }
    }

}