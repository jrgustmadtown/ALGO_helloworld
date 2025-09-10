import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        
        for (int i = 0; i < n; i++) 
        {
            String output = s.nextLine()
            System.out.println("Hello, " + output + "!");
        }
    }
}