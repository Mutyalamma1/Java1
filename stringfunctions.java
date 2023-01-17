import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class stringfunctions {
    public static void main(String[] args) {
        String str=" RaHul";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.charAt(2));
        System.out.println(Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(str.concat("lokesh" ));
        String str1="thiruvananthapuram";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.length());
        System.out.println(str1.replace('r','y'));
        System.out.println(str1.substring(13));

    }
}
