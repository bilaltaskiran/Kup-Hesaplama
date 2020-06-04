
package kup01;


public class Kup01 {

            static int uzunluk;
            //küp'ün uzunluğu
            static int genişlik;
            //küp'ün genişliği
            static int yükseklik;
            //küp'ün yüksekliği
            
           
public static   int hacimBul (int u, int g, int y) {
                         uzunluk = u;
                         genişlik = g;
                         yükseklik = y;
                         return uzunluk * genişlik * yükseklik;
                         // burada kup'ün uzunluğunu, genişliğini, yüksekliğini çarpıyoruz.
                   }
 

    public static void main(String[] args) {
       int h =  hacimBul(10,20,30);
 
                   System.out.println("Küp01 ‘in Hacmi : " + h);
                   // yazdırma işlemi

    }
    
}
