
package praktikum1;


public class Bola extends BangunRuang {
    double jari2;
    
     public void namabangun(){
        System.out.println("nama bangun : "+namabangun);
    }
     public void rumusvolumee(){
        System.out.println("rumus       : "+rumusvolume);
    }
    double volumeBangun(){
        return 4*Math.PI*jari2*jari2*jari2/3;
    }
}
