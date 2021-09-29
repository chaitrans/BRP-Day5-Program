import java.util.Scanner;
public class PowerOfTwo
{
    public static void main(String[] args)
    {
        System.out.printf("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 1;

        if (n>=0 && n<31)
        {
            for (int i=1; i<=n; i++)
            {
                power = power * 2;
                System.out.println("power: " + power);
            }
        } else
        {
            System.out.println("It exceeds the int datatype limit");
        }
    }
}