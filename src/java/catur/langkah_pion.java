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
public class langkah_pion{
    //langkah memakan
    public String[][][] semuaposisi = new String[8][8][3];
    public int[] posisiawal = new int[2];
    public int[] posisiakhir= new int[2];
    public String warna = ""; //p atau b
    public Boolean cek_valid = false;
    public Boolean langkah_ganda = false;
    public String teks = "";
    
    public langkah_pion(String[][][] posisi,int[] posisiawal, int[] posisiakhir,String warna){
        this.semuaposisi = posisi;
        this.posisiawal[0] = posisiawal[0];
        this.posisiawal[1] = posisiawal[1];
        this.posisiakhir[0] = posisiakhir[0];
        this.posisiakhir[1] = posisiakhir[1];
        int x,y,z,go;
        
        //langkah pion putih
        if(warna.equals("p")){
            //langkah maju dua langkah
            if(this.posisiawal[0]==6){
                if(this.posisiakhir[0]==4&&this.posisiawal[1]==this.posisiakhir[1]){
                    if(this.semuaposisi[posisiakhir[0]][posisiakhir[1]][0].equals("")){
                        this.langkah_ganda = true;
                        this.cek_valid = true;
                    }
                }
            }
            //langkah maju satu langkah
            if(this.posisiawal[0]-1==this.posisiakhir[0]&&this.posisiawal[1]==this.posisiakhir[1]){
                if(this.semuaposisi[posisiakhir[0]][posisiakhir[1]][0].equals("")){
                    this.cek_valid = true;
                }
            }
            
            //langkah pion putih makan kiri
            if(this.posisiawal[0]-1==this.posisiakhir[0]&&this.posisiawal[1]-1==this.posisiakhir[1]){
                if(this.semuaposisi[posisiakhir[0]][posisiakhir[1]][0].equals("b")){
                    this.cek_valid = true;
                }
            }
            
            
            //langkah pion putih makan kanan
            if(this.posisiawal[0]-1==this.posisiakhir[0]&&this.posisiawal[1]+1==this.posisiakhir[1]){
                if(this.semuaposisi[posisiakhir[0]][posisiakhir[1]][0].equals("b")){
                    this.cek_valid = true;
                }
            }
            
            //langkah pion putih potong kiri
            if(this.posisiawal[0]-1==this.posisiakhir[0]&&this.posisiawal[1]-1==this.posisiakhir[1]){
                if(this.semuaposisi[posisiawal[0]][posisiawal[1]][2].equals("1")||
                   this.semuaposisi[posisiawal[0]][posisiawal[1]][2].equals("3")){
                        this.cek_valid = true;
                }
            }
            
            //langkah pion potong kanan
            if(this.posisiawal[0]-1==this.posisiakhir[0]&&this.posisiawal[1]+1==this.posisiakhir[1]){
                if(this.semuaposisi[posisiawal[0]][posisiawal[1]][2].equals("2")||
                   this.semuaposisi[posisiawal[0]][posisiawal[1]][2].equals("3")){
                        this.cek_valid = true;
                }
            }
        }
        
        if(warna.equals("b")){
            //langkah maju dua langkah
            if(this.posisiawal[0]==1){
                if(this.posisiakhir[0]==3&&this.posisiawal[1]==this.posisiakhir[1]){
                    if(this.semuaposisi[posisiakhir[0]][posisiakhir[1]][0].equals("")){
                        this.langkah_ganda = true;
                        this.cek_valid = true;
                    }
                }
            }
            //langkah maju satu langkah
            if(this.posisiawal[0]+1==this.posisiakhir[0]&&this.posisiawal[1]==this.posisiakhir[1]){
                if(this.semuaposisi[posisiakhir[0]][posisiakhir[1]][0].equals("")){
                    this.cek_valid = true;
                }
            }
            
            //langkah pion hitam makan kiri
            if(this.posisiawal[0]+1==this.posisiakhir[0]&&this.posisiawal[1]-1==this.posisiakhir[1]){
                if(this.semuaposisi[posisiakhir[0]][posisiakhir[1]][0].equals("p")){
                    this.cek_valid = true;
                }
            }
            
            
            //langkah pion hitam makan kanan
            if(this.posisiawal[0]+1==this.posisiakhir[0]&&this.posisiawal[1]+1==this.posisiakhir[1]){
                if(this.semuaposisi[posisiakhir[0]][posisiakhir[1]][0].equals("p")){
                    this.cek_valid = true;
                }
            }
            
            //langkah pion hitam potong kiri
            if(this.posisiawal[0]+1==this.posisiakhir[0]&&this.posisiawal[1]-1==this.posisiakhir[1]){
                if(this.semuaposisi[posisiawal[0]][posisiawal[1]][2].equals("1")||
                   this.semuaposisi[posisiawal[0]][posisiawal[1]][2].equals("3")){
                    this.cek_valid = true;
                }
            }
            //langkah pion hitam potong kanan
            if(this.posisiawal[0]+1==this.posisiakhir[0]&&this.posisiawal[1]+1==this.posisiakhir[1]){
                if(this.semuaposisi[posisiawal[0]][posisiawal[1]][2].equals("2")||
                   this.semuaposisi[posisiawal[0]][posisiawal[1]][2].equals("3")){
                    this.cek_valid = true;
                }
            }
        }
    }
}
