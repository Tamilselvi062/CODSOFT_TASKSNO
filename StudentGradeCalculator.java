
import java.util.*;
public class StudentGradeCalculator{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no of subjects");
        int subjects = in.nextInt();
        
        int total =0;
        int marks=0;
        
            for(int i=1;i<=subjects;i++){

            System.out.println("enter each subjects mark "+ i);
             marks = in.nextInt();
             while(marks<0 || marks>100){
                System.out.println("invalid marks");
                System.out.println("enter the mark again");
                marks = in.nextInt();
            } 
            
        
            total = total+marks;
           
        }
         System.out.println( "total is " +total);
        
            double average = (double)total/subjects;
            System.out.printf( "average: %.2f%%\n" ,average);

            if(95<=average ){
                System.out.println("A grade");
            }
            else if(85<=average){
                System.out.println("B grade");
            }else if(75<= average){
                System.out.println("C grade");
            }else if(65<= average){
                System.out.println("D grade");
            }else if(55<= average){
                System.out.println("E  grade");
            }else{
                System.out.println("F grade");
            }
           
    }
}

