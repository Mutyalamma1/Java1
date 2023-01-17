import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchpractice {
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the day of the week");
        a= Integer.parseInt(br.readLine());
        switch (a){
            case 0:
                System.out.println(" sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invaild number");


        }
    }
}
