import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uservariable {
    public static void main(String[] args) throws IOException {
        int c,d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of c");
        c=Integer.parseInt(br.readLine());
        System.out.println("enter the value of d");
        d=Integer.parseInt(br.readLine());
        System.out.println((c+d)/2);
        //System.out.println(c*d);
        System.out.println(c-d);

    }
}
