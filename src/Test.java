import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
       //  3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
        int k, counter=0,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz.");
        k=input.nextInt();
        for(int i=1; i<=k;i++){
            if((i%3==0)&&(i%4==0)){
                toplam+=i;
                counter++;
            }
        }
        double average = toplam/counter;
        System.out.println("3 ve 4'e bölünen sayıların ortalaması: "+average);
    }
}
