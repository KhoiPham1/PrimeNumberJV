import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scn.nextInt();
        if (number<2){
            System.out.print("Number is not prime number");
        }else{
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if (number%i==0){
                    check = false;
                    break;
                }
                i++;
                }
                if (check){
                    System.out.print(number+ " is prime number");
                }
                else {
                    System.out.print(number+ " is not prime number");
                }
            }
        }
    }

