package JAVA101;
import java.util.Scanner;
public class besinci_ornek {
    public static void main(String[] args) {
        int r , merkezaci;
        double alan ;
        Scanner input = new Scanner(System.in);
        System.out.println("yaricap degeri giriniz: ");
        r = input.nextInt();
        System.out.println("merkezaci degerini giriniz");
        merkezaci = input.nextInt();
        alan = (3.14 * (r*r) * merkezaci)/360;
        System.out.println("daire diliminin alani: "+alan);
    }
}
