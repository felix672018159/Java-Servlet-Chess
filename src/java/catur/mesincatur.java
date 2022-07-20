package catur;

import java.util.ArrayList;

public class mesincatur  {
    public ArrayList<String> posisi = new ArrayList<String>();
    public String[][][] semuaposisi = new String[8][8][3];
    public String posisistring = "";
    public String hasilpindah = "";
    public Boolean cek_langkah_valid = true;
    public Boolean game_berakhir = false;
    public String warna_yang_melangkah = "";
    private int[] posisiawal = {-1,-1}; //[0]baris - [1]kolom
    private int[] posisiakhir = {-1,-1}; //[0]baris - [1]kolom
    public String teks = "";
    
    
    public void mesincatur_init(ArrayList<String> pass){
        this.posisi = (ArrayList<String>)pass;
        this.arraylist_ke_array_3d();
    }
    
    public void pindah(String pindah_awal_posisi,String pindah_ke_posisi){
        String[] a = pindah_awal_posisi.split(""); //ubah string menjadi array string
        String[] b = pindah_ke_posisi.split("");   //ubah string menjadi array string
        this.posisiawal[0] = Integer.parseInt(a[0]); 
        this.posisiawal[1] = Integer.parseInt(a[1]);
        this.posisiakhir[0] = Integer.parseInt(b[0]);
        this.posisiakhir[1] = Integer.parseInt(b[1]);
        
        String bidak = this.semuaposisi[posisiawal[0]][posisiawal[1]][1];
        String warna = this.semuaposisi[posisiawal[0]][posisiawal[1]][0];
        langkah_ster ster = new langkah_ster(this.semuaposisi,this.posisiawal, this.posisiakhir,warna);
        langkah_pion pion = new langkah_pion(this.semuaposisi,this.posisiawal,this.posisiakhir,warna);
        langkah_kuda kuda = new langkah_kuda(this.semuaposisi,this.posisiawal,this.posisiakhir,warna);
        langkah_banteng banteng = new langkah_banteng(this.semuaposisi,this.posisiawal,this.posisiakhir,warna);
        langkah_mentri mentri   = new langkah_mentri(this.semuaposisi,this.posisiawal,this.posisiakhir,warna);
        langkah_raja raja = new langkah_raja(this.semuaposisi,this.posisiawal,this.posisiakhir,warna);
    
        
        this.cek_langkah_valid = false;
        
        if(bidak.equals("ster")){
            if(ster.cek_valid==true){
                this.cek_langkah_valid = true;
            }
        }else if(bidak.equals("banteng")){
            if(banteng.cek_valid==true){
                this.cek_langkah_valid = true;
            }
        }else if(bidak.equals("kuda")){
            if(kuda.cek_valid==true){
                this.cek_langkah_valid = true;
            }
        }else if(bidak.equals("mentri")){
            if(mentri.cek_valid==true){
                this.cek_langkah_valid = true;
            }
        }else if(bidak.equals("pion")){
            if(pion.cek_valid==true){
                this.cek_langkah_valid = true;
                this.semuaposisi[posisiawal[0]][posisiawal[1]][2]="0";
                if(pion.langkah_ganda==true){
                    int kiri,kanan ;
                    String c;
                    kiri  = this.posisiakhir[1] -1;
                    kanan = this.posisiakhir[1] +1;
                    c     = this.warna_yang_melangkah;
                    if(kiri>=0&&kiri<=7){
                        if(!this.semuaposisi[posisiakhir[0]][kiri][0].equals(c)){
                            if(this.semuaposisi[posisiakhir[0]][kiri][1].equals("pion")){
                                if(this.semuaposisi[posisiakhir[0]][kiri][2].equals("1")){
                                    this.semuaposisi[posisiakhir[0]][kiri][2] = "3";
                                }else{
                                    this.semuaposisi[posisiakhir[0]][kiri][2] = "2";
                                }
                            }
                        }
                    }
                    if(kanan>=0&&kanan<=7){
                        if(!this.semuaposisi[posisiakhir[0]][kanan][0].equals(c)){
                            if(this.semuaposisi[posisiakhir[0]][kanan][1].equals("pion")){
                                if(this.semuaposisi[posisiakhir[0]][kanan][2].equals("2")){
                                    this.semuaposisi[posisiakhir[0]][kanan][2] = "3";
                                }else{
                                    this.semuaposisi[posisiakhir[0]][kanan][2] = "1";
                                }
                                
                            }
                        }
                    }
                }else{
                    int kiri,kanan ;
                    String c;
                    kiri  = this.posisiawal[1] -1;
                    kanan = this.posisiawal[1] +1;
                    c     = this.warna_yang_melangkah;
                    if(kiri>=0&&kiri<=7){
                        if(!this.semuaposisi[posisiawal[0]][kiri][0].equals(c)){
                            if(this.semuaposisi[posisiawal[0]][kiri][1].equals("pion")){
                                if(this.semuaposisi[posisiawal[0]][kiri][2].equals("3")){
                                    this.semuaposisi[posisiawal[0]][kiri][2]="1";
                                }else{
                                    this.semuaposisi[posisiawal[0]][kiri][2]="0";
                                }
                            }
                        }
                    }
                    if(kanan>=0&&kanan<=7){
                        if(!this.semuaposisi[posisiawal[0]][kanan][0].equals(c)){
                            if(this.semuaposisi[posisiawal[0]][kanan][1].equals("pion")){
                                if(this.semuaposisi[posisiawal[0]][kanan][2].equals("3")){
                                    this.semuaposisi[posisiawal[0]][kanan][2]="2";
                                }else{
                                    this.semuaposisi[posisiawal[0]][kanan][2] = "0";
                                }
                            }
                        }
                    }
                }
            }
        }else if(bidak.equals("raja")){
            if(raja.cek_valid==true){
                this.cek_langkah_valid = true;
            }
        }else{
        }
        

        String[] sementara = new String[3];
        sementara[0] = this.semuaposisi[posisiawal[0]][posisiawal[1]][0];
        sementara[1] = this.semuaposisi[posisiawal[0]][posisiawal[1]][1];
        if(!sementara[1].equals("pion")){
            sementara[2] = "1";//this.semuaposisi[posisiawal[0]][posisiawal[1]][2];
        }else{
            sementara[2] = this.semuaposisi[posisiawal[0]][posisiawal[1]][2];
        }
        this.semuaposisi[posisiawal[0]][posisiawal[1]][0] = "";
        this.semuaposisi[posisiawal[0]][posisiawal[1]][1] = "";
        this.semuaposisi[posisiawal[0]][posisiawal[1]][2] = "";
        this.semuaposisi[posisiakhir[0]][posisiakhir[1]][0] = sementara[0];
        this.semuaposisi[posisiakhir[0]][posisiakhir[1]][1] = sementara[1];
        this.semuaposisi[posisiakhir[0]][posisiakhir[1]][2] = sementara[2];
        
        //setelahmelangkah harus di check apakah langkah tersebut menyebabkan rajanya sendiri terskak !
        cek_skak skaksendiri = new cek_skak(this.semuaposisi,this.warna_yang_melangkah);
        //this.teks = this.warna_yang_melangkah + skaksendiri.cek_skak+"eey";
        if(skaksendiri.cek_skak==true){
            this.cek_langkah_valid =false;
        }else{
            //cek skak mati
            cek_skak skakmati_putih = new cek_skak(this.semuaposisi,"p");
            cek_skak skakmati_hitam = new cek_skak(this.semuaposisi,"b");
            this.teks+="halo bandung<br>";
            this.teks += "bidak hitam bisa melangkah ?: "+Boolean.toString(skakmati_hitam.bisa_melangkah)+"<br>";
            this.teks+= "apakah terskak?"+skakmati_hitam.teks;
            if((skakmati_hitam.cek_skak_mati==true)||(skakmati_putih.cek_skak_mati==true)){
                this.game_berakhir = true;
                this.cek_langkah_valid = true;
            }
            //
        }
        //peringatan langkah developer mode untuk melangkah kesegala arah
        //this.cek_langkah_valid=true;
        //---------------------------------
        if(!this.warna_yang_melangkah.equals(warna)){
            this.cek_langkah_valid = false;
        }
        
        
        this.hasilpindah = array_3d_ke_string();
    }
    
    
    public String array_3d_ke_string(){
        String setting = "";
        int x,y;
        for(x=0;x<semuaposisi.length;x++){
            setting+= "baris";
            for(y=0;y<semuaposisi[x].length;y++){
                setting+= "kolom";
                setting+= semuaposisi[x][y][0]+"pos"+semuaposisi[x][y][1]+"pos"+semuaposisi[x][y][2];
            }
        }
        return setting;
    }
                    
        
    public void arraylist_ke_array_3d(){
        int x,y,z;
        int kondisi =  this.posisi.size()-1;
        if(this.posisi.size()%2==1){
            this.warna_yang_melangkah = "p";
        }else{
            this.warna_yang_melangkah = "b";
        };
        String bidak="";
        String[] parse = this.posisi.get(kondisi).split("baris");
        for (x = 1; x < parse.length; x++) {//parse.length; x++) {
            String[] kolom = parse[x].split("kolom");
            for (y = 1; y < kolom.length; y++) {
                if(kolom[y].split("pos").length>0){
                    String[] item = kolom[y].split("pos");
                    semuaposisi[x-1][y-1][0]= item[0];
                    semuaposisi[x-1][y-1][1]= item[1];
                    semuaposisi[x-1][y-1][2]= item[2];
                }else{
                    semuaposisi[x-1][y-1][0]= "";
                    semuaposisi[x-1][y-1][1]= "";
                    semuaposisi[x-1][y-1][2]= "";
                };
                bidak += semuaposisi[x-1][y-1][0]+semuaposisi[x-1][y-1][1]+semuaposisi[x-1][y-1][2];
            }
            bidak+="<br>";
        }
        
        this.posisistring = bidak;
    }
    
}
