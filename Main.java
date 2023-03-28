
package praktikum1;
public class Main {
    public static void main(String[] args) {
        BangunRuang bgn = new BangunRuang();
        bgn.namabangun="KUBUS";
        bgn.rumusvolume="sisi*sisi*sisi";
        Kubus kubus = new Kubus();
        kubus.sisi=8;
        System.out.println("volume      : "+kubus.volumeBangun());
        kubus.namabangunn();
        kubus.rumusvolumee();
        
        
        bgn.namabangun="BALOK";
        bgn.rumusvolume="panjang*lebar*tinggi";
        Balok balok = new Balok();
        balok.panjang=10;
        balok.lebar=8;
        balok.tinggi=9;
        balok.namabangun();
        balok.rumusvolumee();
        System.out.println("volume       : "+balok.volumeBangun());
        
        
        bgn.namabangun="TABUNG";
        bgn.rumusvolume="phi*jari-jari*tinggi";
        Tabung tabung =  new Tabung();
        tabung.namabangun();
        tabung.rumusvolumee();
        tabung.jari2=3;
        tabung.tinggi=8;
        System.out.println("volume       : "+tabung.volumeBangun());
        
        
        
        bgn.namabangun="KERUCUT";
        bgn.rumusvolume="1/3*phi*r2*t";
        Kerucut kct = new Kerucut();
        kct.namabangun();
        kct.rumusvolumee();
        kct.jari2=5;
        kct.tinggi=10;
        System.out.println("volume      : "+kct.volumeBangun());
        
        
        bgn.namabangun="LIMAS";
        bgn.rumusvolume="1/3*luas*tinggi";
        Limas lms = new Limas();
        lms.namabangun();
        lms.rumusvolumee();
        lms.luasAlas=20;
        lms.tinggi=10;
        System.out.println("volume     : "+kct.volumeBangun());
    }
}
