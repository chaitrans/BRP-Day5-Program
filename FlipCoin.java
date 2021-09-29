import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input : ");
        int toss = sc.nextInt();
        int i = 1;
        int headCount = 0;
        while(i<=toss)
        {
            double random = Math.random();
            if(random<0.5)
            {
                System.out.println("Tails");
            }
            else
            {
                System.out.println("Heads");
                headCount++;
            }
            i++;
        }
        System.out.println("HeadCount : " + headCount );
        double headPercentage = (headCount/(double)toss) * 100;
        System.out.println("Heads = " + headPercentage + "%");
        double tailPercentage = 100 - headPercentage;
        System.out.println("Tails = " + tailPercentage + "%");
    }
}