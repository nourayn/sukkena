import java.util.Scanner;
public class Score{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student score:");
        double score = scanner.nextDouble();
        System.out.println("Enter student number:");
        int number = scanner.nextInt();
       
            int i=1,count=0;
            do{
                count +=i;
                count++;
                if(count<10) break;
            }while (i <=5);
            System.out.println("count:"+count);
        

    }
}