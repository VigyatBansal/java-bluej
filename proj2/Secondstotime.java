import java.util.*;
 public class Secondstotime {
 public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input seconds: ");
		int seconds = sc.nextInt(); 
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.println( p2 + ":" + p3 + ":" + p1);
		System.out.println("\n");
    }    
 }