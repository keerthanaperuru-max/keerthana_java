import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int square=num*num;
        int sum=0;
        while(square!=0){
            sum+=square%10;
            square=square/10;

        }
        if(sum==num){

            System.out.println("It is a neon number:" +num);
        }
        else{
            System.out.println("It is not a neon number:" +num);
        }
    }
}
