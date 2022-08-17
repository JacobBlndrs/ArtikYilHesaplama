import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;

        Scanner inp =new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        yil=inp.nextInt();

        if (yil%4==0 && !(yil % 100 == 0) || (yil % 400 == 0) ){
            System.out.println(yil+"\s"+"Bu artik bir yildir");
        }else {
            System.out.println(yil+"\s"+"Bu artik bir yil degildir");
        }

    }
}
