import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(b.readLine());  // Read number of inputs
        
        for (int i = 0; i < n; i++) {
            String output = b.readLine();  // Correct method to read line
            System.out.println("Hello, " + output + "!");
        }
    }
}
