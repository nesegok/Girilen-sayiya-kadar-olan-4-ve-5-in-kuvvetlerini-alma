import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        int n = input.nextInt();
        System.out.println("Dördün kuvvetleri");
        for (int i = 1; i<=n; i*=4){
            System.out.println(i);
        }
        System.out.println("\nBeşin kuvvetleri");
        for (int i = 1; i<=n; i*=5){
            System.out.println(i);
        }
    }
}
