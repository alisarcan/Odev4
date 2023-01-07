import java.util.Scanner;
public class Main {
    public static  void main(String[] args){

        int r;
        double pi = 3.14, alan,a;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        a = input.nextDouble();

        alan = ((r*r) * pi * a)/360;

        System.out.println("Daire Diliminin Alanı : " + alan);

    }
}
