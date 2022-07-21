/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catur;

/**
 *
 * @author user
 */
public class langkah_banteng {
    
    public String[][][] semuaposisi = new String[8][8][3];
    public int[] posisiawal = new int[2];
    public int[] posisiakhir= new int[2];
    public String warna = ""; //p atau b
    public Boolean cek_valid = false;
    public String teks = "";
    
    public langkah_banteng(String[][][] posisi,int[] posisiawal, int[] posisiakhir,String warna){
        this.semuaposisi = posisi;
        this.posisiawal[0] = posisiawal[0];
        this.posisiawal[1] = posisiawal[1];
        this.posisiakhir[0] = posisiakhir[0];
        this.posisiakhir[1] = posisiakhir[1];
        int x,y,z,go;
        
        //cekatas
        for (go = posisiawal[0]-1; go >= 0; go--) {
            int posy = go;
            int posx = posisiawal[1];
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
                break;
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        //cek bawah
        for (go = posisiawal[0]+1; go <= 7; go++) {
            int posy = go;
            int posx = posisiawal[1];
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
                break;
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        //cek kiri
        for (go = posisiawal[1]-1; go >= 0; go--) {
            int posy = posisiawal[0];
            int posx = go;
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
                break;
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        //cek kanan
        for (go = posisiawal[1]+1; go <= 7; go++) {
            int posy = posisiawal[0];
            int posx = go;
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
                break;
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
    }
}
