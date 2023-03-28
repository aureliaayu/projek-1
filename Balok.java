
package praktikum1;


public class Balok extends BangunRuang {
    double panjang;
    double lebar;
    double tinggi;
    
    public void namabangun(){
        System.out.println("nama bangun : "+namabangun);
    }
    public void rumusvolumee(){
        System.out.println("rumus       : "+rumusvolume);
    }
    double volumeBangun(){
        return panjang*lebar*tinggi;
    }
}
