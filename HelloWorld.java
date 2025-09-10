import java.util.BufferedReader;

public class HelloWorld {
    public static void main(String[] args) {

        BufferedReader b = new BufferedReader(System.in);
        int n = Integer.parseInt(b.readLine());
       
        for (int i = 0; i < n; i++) 
        {
            String output = b.nextLine();
            System.out.println("Hello, " + output + "!");
        }
    }
}