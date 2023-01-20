import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n;
        int total = 0;
        Scanner scan= new Scanner(System.in);

        do{
            System.out.println("Sayı giriniz : ");
            n= scan.nextInt();
            if(n%4==0){
                total+=n;

            }
        }while(0<n && n%2==0);
        System.out.println(total);

    }

}
