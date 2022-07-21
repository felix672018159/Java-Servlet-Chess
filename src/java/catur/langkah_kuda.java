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
public class langkah_kuda {
    public String[][][] semuaposisi = new String[8][8][3];
    public int[] posisiawal = new int[2];
    public int[] posisiakhir= new int[2];
    public String warna = ""; //p atau b
    public Boolean cek_valid = false;
    public String teks = "";
    
    public langkah_kuda(String[][][] posisi,int[] posisiawal, int[] posisiakhir,String warna){
        this.semuaposisi = posisi;
        this.posisiawal[0] = posisiawal[0];
        this.posisiawal[1] = posisiawal[1];
        this.posisiakhir[0] = posisiakhir[0];
        this.posisiakhir[1] = posisiakhir[1];
        int x,y,z,go;
        
        //cek kuda atas kiri
        y = posisiawal[0] + (-2);
        x = posisiawal[1] + (-1);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(!this.semuaposisi[y][x][0].equals(warna)){
                    if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
            }else{
                if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        
        //cek kuda atas kanan
        y = posisiawal[0] + (-2);
        x = posisiawal[1] + (1);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(!this.semuaposisi[y][x][0].equals(warna)){
                    if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
            }else{
                if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        
        //cek kuda bawah kiri
        y = posisiawal[0] + (2);
        x = posisiawal[1] + (-1);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(!this.semuaposisi[y][x][0].equals(warna)){
                    if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
            }else{
                if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        
        //cek kuda bawah kanan
        y = posisiawal[0] + (2);
        x = posisiawal[1] + (1);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(!this.semuaposisi[y][x][0].equals(warna)){
                    if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
            }else{
                if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        
        //cek kuda kanan atas
        y = posisiawal[0] + (-1);
        x = posisiawal[1] + (2);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(!this.semuaposisi[y][x][0].equals(warna)){
                    if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
            }else{
                if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        
        //cek kuda kanan bawah
        y = posisiawal[0] + (1);
        x = posisiawal[1] + (2);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(!this.semuaposisi[y][x][0].equals(warna)){
                    if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
            }else{
                if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        
        //cek kuda kiri atas
        y = posisiawal[0] + (-1);
        x = posisiawal[1] + (-2);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(!this.semuaposisi[y][x][0].equals(warna)){
                    if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
            }else{
                if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
        
        //cek kuda kiri bawah
        y = posisiawal[0] + (1);
        x = posisiawal[1] + (-2);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(!this.semuaposisi[y][x][0].equals(warna)){
                    if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                        this.cek_valid= true;
                    }
                }
            }else{
                if(y==this.posisiakhir[0]&&x==this.posisiakhir[1]){
                    this.cek_valid= true;
                }
            }
        }
    
    }
}
