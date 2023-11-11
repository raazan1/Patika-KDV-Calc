import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdv  = 0.18,kdv1 = 0.8;
        System.out.printf("Fiyat Giriniz: ");
        int Price = input.nextInt();

        if(Price>1000){
            Small(Price,kdv1);

        }
        else {
            Big(Price,kdv);
        }


    }
    public static void Small(int Price,double kdv1){
        double KDV = (Price*kdv1);
        double Total = KDV+Price;
        System.out.printf("Kdv oranı: " +KDV+"\n"
                +"Kdv dahil fiyat: "+Total+"\n"+
                "Sade Fiyat: "+Price);
    }
    public static void Big(int Price,double kdv){
        double KDV = (Price*kdv);
        double Total = KDV+Price;
        System.out.printf("Kdv oranı: " +KDV+"\n"
                +"Kdv dahil fiyat: "+Total+"\n"+
                "Sade Fiyat: "+Price);
    }
}