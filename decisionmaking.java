import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decisionmaking {
    public static void main(String[] args) throws IOException {
        int i, j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of c");
        i = Integer.parseInt(br.readLine());
        System.out.println("enter the value of d");
        j = Integer.parseInt(br.readLine());
        if (i > j) {
            System.out.println(i - j);

        } else if(i==j){
            System.out.println("both are equal");
        }
        else {
        System.out.println(j - i);
    }}}