/*import java.util.Scanner;
public class Timetable{
    public Static void main(String[]args){
        Scanner y = new Scanner (System.in);
        System.out.print( please enter number:);
        double number = y.nextDouble();
        for(int i = 1; 1 <= 10; i++){
            System.out.println(number + "x" + i + "=" +(number *i));
        }


    }
}
*/


import java.util.Scanner;

public class Timetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
