
package praktikum1;


public class Prisma extends BangunRuang {
    double luasAlas;
    double tinggi;
    
    double volumeBangun(){
        return luasAlas*tinggi;
    }
    public void rumusvolumee(){
        System.out.println("rumus       : "+rumusvolume);
    }
     public void namabangun(){
        System.out.println("nama bangun : "+namabangun);
    }
}
