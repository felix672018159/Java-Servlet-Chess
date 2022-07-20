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
public class langkah_raja {
    public String[][][] semuaposisi = new String[8][8][3];
    public int[] posisiawal = new int[2];
    public int[] posisiakhir= new int[2];
    public String warna = ""; //p atau b
    public Boolean cek_valid = false;
    public String teks = "";
    
    public langkah_raja(String[][][] posisi,int[] posisiawal, int[] posisiakhir,String warna){
        this.semuaposisi = posisi;
        this.posisiawal[0] = posisiawal[0];
        this.posisiawal[1] = posisiawal[1];
        this.posisiakhir[0] = posisiakhir[0];
        this.posisiakhir[1] = posisiakhir[1];
        int x,y,z,go;
        int posy;
        int posx;
        

        //cek langkah atas kiri
        posy = posisiawal[0] + (-1);
        posx = posisiawal[1] + (-1);
        if(posy<0||posy>7||posx<0||posx>7){
        }else{
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(ancaman.cek_aman==true){
                            this.cek_valid= true;
                        }
                    }
                }
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    int[] pass = new int[2];
                    pass[0] = posy;
                    pass[1] = posx;
                    telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                    if(ancaman.cek_aman==true){
                        this.cek_valid= true;
                    }
                }
            }
        }
        
        
        //cek langkah atas tengah
        posy = posisiawal[0] + (-1);
        posx = posisiawal[1] + (0);
        if(posy<0||posy>7||posx<0||posx>7){
        }else{
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(ancaman.cek_aman==true){
                            this.cek_valid= true;
                        }
                    }
                }
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    int[] pass = new int[2];
                    pass[0] = posy;
                    pass[1] = posx;
                    telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                    if(ancaman.cek_aman==true){
                        this.cek_valid= true;
                    }
                }
            }
        }
        
        //cek langkah atas kanan
        posy = posisiawal[0] + (-1);
        posx = posisiawal[1] + (1);
        if(posy<0||posy>7||posx<0||posx>7){
        }else{
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(ancaman.cek_aman==true){
                            this.cek_valid= true;
                        }
                    }
                }
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    int[] pass = new int[2];
                    pass[0] = posy;
                    pass[1] = posx;
                    telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                    if(ancaman.cek_aman==true){
                        this.cek_valid= true;
                    }
                }
            }
        }
        
        //cek langkah bawah kiri
        posy = posisiawal[0] + (1);
        posx = posisiawal[1] + (-1);
        if(posy<0||posy>7||posx<0||posx>7){
        }else{
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(ancaman.cek_aman==true){
                            this.cek_valid= true;
                        }
                    }
                }
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    int[] pass = new int[2];
                    pass[0] = posy;
                    pass[1] = posx;
                    telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                    if(ancaman.cek_aman==true){
                        this.cek_valid= true;
                    }
                }
            }
        }
        
        
        //cek langkah bawah tengah
        posy = posisiawal[0] + (1);
        posx = posisiawal[1] + (0);
        if(posy<0||posy>7||posx<0||posx>7){
        }else{
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(ancaman.cek_aman==true){
                            this.cek_valid= true;
                        }
                    }
                }
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    int[] pass = new int[2];
                    pass[0] = posy;
                    pass[1] = posx;
                    telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                    if(ancaman.cek_aman==true){
                        this.cek_valid= true;
                    }
                }
            }
        }
        
        //cek langkah bawah kanan
        posy = posisiawal[0] + (1);
        posx = posisiawal[1] + (1);
        if(posy<0||posy>7||posx<0||posx>7){
        }else{
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(ancaman.cek_aman==true){
                            this.cek_valid= true;
                        }
                    }
                }
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    int[] pass = new int[2];
                    pass[0] = posy;
                    pass[1] = posx;
                    telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                    if(ancaman.cek_aman==true){
                        this.cek_valid= true;
                    }
                }
            }
        }

        //cek langkah tengah kanan
        posy = posisiawal[0] + (0);
        posx = posisiawal[1] + (1);
        if(posy<0||posy>7||posx<0||posx>7){
        }else{
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(ancaman.cek_aman==true){
                            this.cek_valid= true;
                        }
                    }
                }
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    int[] pass = new int[2];
                    pass[0] = posy;
                    pass[1] = posx;
                    telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                    if(ancaman.cek_aman==true){
                        this.cek_valid= true;
                    }
                }
            }
        }

        //cek langkah tengah kiri
        posy = posisiawal[0] + (0);
        posx = posisiawal[1] + (-1);
        if(posy<0||posy>7||posx<0||posx>7){
        }else{
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(!this.semuaposisi[posy][posx][0].equals(warna)){
                    if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(ancaman.cek_aman==true){
                            this.cek_valid= true;
                        }
                    }
                }
            }else{
                if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                    int[] pass = new int[2];
                    pass[0] = posy;
                    pass[1] = posx;
                    telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,pass,warna);
                    if(ancaman.cek_aman==true){
                        this.cek_valid= true;
                    }
                }
            }
        }
        /////////////////////////////////
    }
}
