
package praktikum1;
public class Kerucut extends BangunRuang{
    double jari2;
    double tinggi;
    
     public void namabangun(){
        System.out.println("nama bangun : "+namabangun);
    }
     public void rumusvolumee(){
        System.out.println("rumus       : "+rumusvolume);
    }
    double volumeBangun(){
        return (Math.PI*jari2*jari2*tinggi)/3;
    }
}
