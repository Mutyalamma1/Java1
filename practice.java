import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice {
    public static void main(String[] args) throws IOException {
        int a,b,c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of a");
        a = Integer.parseInt(br.readLine());
        System.out.println("enter the value of b");
        b = Integer.parseInt(br.readLine());
        System.out.println("enter the value of c");
        c = Integer.parseInt(br.readLine());
        int avg= (a+b+c)/3;
        if (a>=35&&b>=35&&c>=35&&avg>40)
        {
            System.out.println("pass");

        }
        else
       {
           System.out.println("fail");
}
    }}
