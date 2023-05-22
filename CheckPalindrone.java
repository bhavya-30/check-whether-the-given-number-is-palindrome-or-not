package checkpalindrone;
import java.util.Scanner;
public class CheckPalindrone {
    public static void main(String[] args) {
        int num,r,n,rev=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        num=s.nextInt();
        n=num;
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
            
        }
        if(n==rev)
            System.out.println(n+" is a palindrome");
        else 
            System.out.println(n+"is not a palindrome");
    }
    
}
