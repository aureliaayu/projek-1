/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;
public class Kubus extends BangunRuang {
    double sisi;
    
    public void namabangunn(){
        System.out.println("nama bangun : "+namabangun);
    }
    public void rumusvolumee(){
        System.out.println("rumus       : "+rumusvolume);
    }
    double volumeBangun(){
        return sisi*sisi*sisi;
    }

   
    
}
