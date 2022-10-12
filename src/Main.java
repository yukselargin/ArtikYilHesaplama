import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int year,mod100,mod400,mod4;
        Scanner input= new Scanner(System.in);
        String sonuc= "";

        System.out.print("Yıl giriniz: ");
        year= input.nextInt();
        mod100 = year%100;
        mod400 = year%400;
        mod4= year%4;

        if(mod4==0){
            if (mod100==0){
                if(mod400==0){
                    sonuc=" bir artık yıldır";
                }else{
                    sonuc=" bir artık yıl değildir";
                }
            }else{
                sonuc=" bir artık yıldır";
            }
        }else{
            sonuc=" bir artık yıl değildir";
        }
        System.out.print(+year+sonuc);
    }
}