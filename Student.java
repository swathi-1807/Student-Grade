import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] marks =new int[5];
        int total=0;

        for(int i=0;i<5;i++){
            System.out.println("Enter your Subject "+(i+1)+"mark : ");
            marks[i]=sc.nextInt();
            total +=marks[i];
        }

        double average=total/5.0;
         System.out.println("Your Total is "+(total));
        System.out.println("Your Average  is "+(average)+"%");
        

        if(average<=100){
            System.out.println("Your Grade is E");
        }
           else if(average<=200){
             System.out.println("Your Grade is D");
        }
           else if(average<=300){
             System.out.println("Your Grade is C");
        }
           else if(average<=400){
            System.out.println("Your Grade is B");
        }
           else if(average<=500){
             System.out.println("Your Grade is A");
        }

       
        
        sc.close();

        
    }
}