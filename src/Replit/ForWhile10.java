package Replit;

public class ForWhile10 {
    /*1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

OutPut:

Sayilarin Toplami : 5050

*/
    public static void main(String[] args) {
        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println("Sayilarin toplami: "+toplam);
    }
}
