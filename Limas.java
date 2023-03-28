
package praktikum1;
public class Limas extends BangunRuang {
    double luasAlas;
    double tinggi;
    
     public void namabangun(){
        System.out.println("nama bangun : "+namabangun);
    }
     public void rumusvolumee(){
        System.out.println("rumus       : "+rumusvolume);
    }
    double volumeBangun(){
        return luasAlas*tinggi/3;
    }
}
