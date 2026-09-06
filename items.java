import java.util.*;
public class items {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println(total);

        float gst = 0.18f * total;
        float newtotal = total + gst;
        System.out.println(newtotal);
    }
}