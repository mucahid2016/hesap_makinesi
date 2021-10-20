import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler Oluşturulur
     double a,b;
     int islemTuru;

     //kullanıcıdan Girdi Alınır

        Scanner input =new Scanner((System.in));

        System.out.print("1. Değeri Giriniz: ");
        a=input.nextDouble();

        System.out.print("2. Değeri Giriniz:");
        b=input.nextDouble();


        System.out.print("Toplamak İçin 1'i, Çıkarmak İçin 2'yi, Çarpmak İçin 3'ü Bölmek İçin 4'ü Giriniz: ");
        islemTuru=input.nextInt();

        //Sonuçlar Yazdırılır

        switch (islemTuru){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if (b != 0){
                    System.out.println(a/b);
                }else {
                    System.out.println("Bir Sayı 0'a Bölünemez");
                }

                break;
            default:
                System.out.println("Yanlış işlem türü girdiniz");
                break;

        }

    }
}
