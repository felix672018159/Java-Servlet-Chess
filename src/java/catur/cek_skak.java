package catur;

import javax.servlet.http.HttpSession;


public class cek_skak {
    public String[][][] semuaposisi = new String[8][8][3];
    public int[] posisiakhir= new int[2];
    public String warna = ""; //p atau b
    public Boolean cek_skak = false;
    public Boolean cek_skak_mati = false;
    public Boolean bisa_melangkah = false;
    public String teks = "";
    
    cek_skak(String[][][] posisi,String warna){
        this.semuaposisi = posisi;
        int x,y,z;
        int ketemu = 0;
      
        for (y = 0; y <= 7; y++) {
            for ( x = 0; x <= 7; x++) {
                if(this.semuaposisi[y][x][0].equals(warna)&&
                   this.semuaposisi[y][x][1].equals("raja")){
                    this.posisiakhir[0] = y;
                    this.posisiakhir[1] = x;
                    ketemu = 1;
                    break;
                }
            }
            if(ketemu==1){
                break;
            }
        }
        telusur_ancaman ancaman = new telusur_ancaman(this.semuaposisi,this.posisiakhir,warna);
        
        if(ancaman.cek_aman==false){
            this.cek_skak = true;
            
        }
        
        //telusur langkah skak mati
        if(this.cek_skak==true){
            int posy,posx;
            int[] posisiawal = new int[2];
            posisiawal[0] = posisiakhir[0];
            posisiawal[1] = posisiakhir[1];
            
            
            
            //cek langkah atas kiri
            posy = posisiawal[0] + (-1);
            posx = posisiawal[1] + (-1);
            
            if(posy<0||posy>7||posx<0||posx>7){
            }else{
                if(!this.semuaposisi[posy][posx][0].equals("")){
                    if(!this.semuaposisi[posy][posx][0].equals(warna)){
                        //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                            int[] pass = new int[2];
                            pass[0] = posy;
                            pass[1] = posx;
                            telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                            if(g.cek_aman==true){
                                bisa_melangkah = true;
                            }
                        //}
                    }
                }else{
                    //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(g.cek_aman==true){
                            bisa_melangkah = true;
                        }
                    //}
                }
            }


            //cek langkah atas tengah
            posy = posisiawal[0] + (-1);
            posx = posisiawal[1] + (0);
            if(posy<0||posy>7||posx<0||posx>7){
            }else{
                if(!this.semuaposisi[posy][posx][0].equals("")){
                    if(!this.semuaposisi[posy][posx][0].equals(warna)){
                        //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                            int[] pass = new int[2];
                            pass[0] = posy;
                            pass[1] = posx;
                            telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                            if(g.cek_aman==true){
                                bisa_melangkah = true;
                            }
                        //}
                    }
                }else{
                    //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(g.cek_aman==true){
                            bisa_melangkah = true;
                        }
                    //}
                }
            }

            //cek langkah atas kanan
            posy = posisiawal[0] + (-1);
            posx = posisiawal[1] + (1);
            if(posy<0||posy>7||posx<0||posx>7){
            }else{
                if(!this.semuaposisi[posy][posx][0].equals("")){
                    if(!this.semuaposisi[posy][posx][0].equals(warna)){
                        //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                            int[] pass = new int[2];
                            pass[0] = posy;
                            pass[1] = posx;
                            telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                            if(g.cek_aman==true){
                                bisa_melangkah = true;
                            }
                        //}
                    }
                }else{
                    //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(g.cek_aman==true){
                            bisa_melangkah = true;
                        }
                    //}
                }
            }

            //cek langkah bawah kiri
            posy = posisiawal[0] + (1);
            posx = posisiawal[1] + (-1);
            if(posy<0||posy>7||posx<0||posx>7){
            }else{
                if(!this.semuaposisi[posy][posx][0].equals("")){
                    if(!this.semuaposisi[posy][posx][0].equals(warna)){
                        //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                            int[] pass = new int[2];
                            pass[0] = posy;
                            pass[1] = posx;
                            telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                            if(g.cek_aman==true){
                                bisa_melangkah = true;
                            }
                        //}
                    }
                }else{
                    //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(g.cek_aman==true){
                            bisa_melangkah = true;
                        }
                    //}
                }
            }


            //cek langkah bawah tengah
            posy = posisiawal[0] + (1);
            posx = posisiawal[1] + (0);
            if(posy<0||posy>7||posx<0||posx>7){
            }else{
                if(!this.semuaposisi[posy][posx][0].equals("")){
                    if(!this.semuaposisi[posy][posx][0].equals(warna)){
                        //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                            int[] pass = new int[2];
                            pass[0] = posy;
                            pass[1] = posx;
                            telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                            if(g.cek_aman==true){
                                bisa_melangkah = true;
                            }
                        //}
                    }
                }else{
                    //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(g.cek_aman==true){
                            bisa_melangkah = true;
                        }
                    //}
                }
            }

            //cek langkah bawah kanan
            posy = posisiawal[0] + (1);
            posx = posisiawal[1] + (1);
            if(posy<0||posy>7||posx<0||posx>7){
            }else{
                if(!this.semuaposisi[posy][posx][0].equals("")){
                    if(!this.semuaposisi[posy][posx][0].equals(warna)){
                        //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                            int[] pass = new int[2];
                            pass[0] = posy;
                            pass[1] = posx;
                            telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                            if(g.cek_aman==true){
                                bisa_melangkah = true;
                            }
                        //}
                    }
                }else{
                    //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(g.cek_aman==true){
                            bisa_melangkah = true;
                        }
                    //}
                }
            }

            //cek langkah tengah kanan
            posy = posisiawal[0] + (0);
            posx = posisiawal[1] + (1);
            if(posy<0||posy>7||posx<0||posx>7){
            }else{
                if(!this.semuaposisi[posy][posx][0].equals("")){
                    if(!this.semuaposisi[posy][posx][0].equals(warna)){
                        //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                            int[] pass = new int[2];
                            pass[0] = posy;
                            pass[1] = posx;
                            telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                            if(g.cek_aman==true){
                                bisa_melangkah = true;
                            }
                        //}
                    }
                }else{
                    //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(g.cek_aman==true){
                            bisa_melangkah = true;
                        }
                    //}
                }
            }

            //cek langkah tengah kiri
            posy = posisiawal[0] + (0);
            posx = posisiawal[1] + (-1);
            if(posy<0||posy>7||posx<0||posx>7){
            }else{
                if(!this.semuaposisi[posy][posx][0].equals("")){
                    if(!this.semuaposisi[posy][posx][0].equals(warna)){
                        //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                            int[] pass = new int[2];
                            pass[0] = posy;
                            pass[1] = posx;
                            telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                            if(g.cek_aman==true){
                                bisa_melangkah = true;
                            }
                        //}
                    }
                }else{
                    //if(posy==this.posisiakhir[0]&&posx==this.posisiakhir[1]){
                        int[] pass = new int[2];
                        pass[0] = posy;
                        pass[1] = posx;
                        telusur_ancaman g = new telusur_ancaman(this.semuaposisi,pass,warna);
                        if(g.cek_aman==true){
                            bisa_melangkah = true;
                        }
                    //}
                }
            }
            //this.cek_skak_mati = true;
            
            if(bisa_melangkah == false){
                
                int go;
                int[] passkan = new int[2];
                Boolean aman = false,cek =false;
                                                
                //cek bawah //paten
                aman = false;
                cek = false;
                for (go = posisiakhir[0]+1; go <= 7; go++) {
                    posy = go;
                    posx = posisiakhir[1];
                    passkan[0] = posy;
                    passkan[1] = posx;
                    
                    if(posy<0||posy>7||posx<0||posx>7){
                        break;
                    }
                    cek = true;
                    if(!this.semuaposisi[posy][posx][0].equals("")){
                        if(!this.semuaposisi[posy][posx][0].equals(warna)){
                            String warna_oposit = "";
                            if(warna.equals("p")){
                                warna_oposit = "b";
                            }else{
                                warna_oposit = "p";
                            }
                            telusur_ancaman w = new telusur_ancaman(this.semuaposisi,passkan,warna_oposit);
                            telusur_ancaman backup = new telusur_ancaman(this.semuaposisi,passkan,warna);
                            telusur_proteksi r = new telusur_proteksi(this.semuaposisi,passkan,warna_oposit);
                            if(w.cek_aman==false&&backup.cek_aman==true&&w.bukan_karena_raja==false){
                                aman = true;
                            }else if(w.cek_aman==false&&w.bukan_karena_raja==true){
                                aman = true;
                            } 
                        }else{
                            aman = true;  
                        }
                        break;
                    }else{
                        telusur_proteksi s = new telusur_proteksi(this.semuaposisi,passkan,warna);
                        if(s.cek_ada_proteksi==true){
                            aman = true;
                        }
                    }
                    
                }
                if(aman==false&&cek == true){
                    this.cek_skak_mati = true;
                    this.teks+="bunuh bawah";
                }
                
                //cek atas //paten
                aman = false;
                cek = false;
                for (go = posisiakhir[0]-1; go >= 0; go--) {
                    posy = go;
                    posx = posisiakhir[1];
                    passkan[0] = posy;
                    passkan[1] = posx;
                    
                    if(posy<0||posy>7||posx<0||posx>7){
                        break;
                    }
                    cek = true;
                    if(!this.semuaposisi[posy][posx][0].equals("")){
                        if(!this.semuaposisi[posy][posx][0].equals(warna)){
                            String warna_oposit = "";
                            if(warna.equals("p")){
                                warna_oposit = "b";
                            }else{
                                warna_oposit = "p";
                            }
                            telusur_ancaman w = new telusur_ancaman(this.semuaposisi,passkan,warna_oposit);
                            telusur_ancaman backup = new telusur_ancaman(this.semuaposisi,passkan,warna);
                            telusur_proteksi r = new telusur_proteksi(this.semuaposisi,passkan,warna_oposit);
                            if(w.cek_aman==false&&backup.cek_aman==true&&w.bukan_karena_raja==false){
                                aman = true;
                            }else if(w.cek_aman==false&&w.bukan_karena_raja==true){
                                aman = true;
                            } 
                        }else{
                            aman = true;  
                        }
                        break;
                    }else{
                        telusur_proteksi s = new telusur_proteksi(this.semuaposisi,passkan,warna);
                        if(s.cek_ada_proteksi==true){
                            aman = true;
                        }
                    }
                    
                }
                if(aman==false&&cek == true){
                    this.cek_skak_mati = true;
                    this.teks+="bunuh atas";
                }
                
                //cek kiri //paten
                aman = false;
                cek = false;
                
                for (go = posisiakhir[1]-1; go >= 0; go--) {
                    posy = posisiakhir[0];
                    posx = go;
                    passkan[0] = posy;
                    passkan[1] = posx;
                    
                    if(posy<0||posy>7||posx<0||posx>7){
                        break;
                    }
                    cek = true;
                    if(!this.semuaposisi[posy][posx][0].equals("")){
                        if(!this.semuaposisi[posy][posx][0].equals(warna)){
                            String warna_oposit = "";
                            if(warna.equals("p")){
                                warna_oposit = "b";
                            }else{
                                warna_oposit = "p";
                            }
                            
                            telusur_ancaman w = new telusur_ancaman(this.semuaposisi,passkan,warna_oposit);
                            telusur_ancaman backup = new telusur_ancaman(this.semuaposisi,passkan,warna);
                            telusur_proteksi r = new telusur_proteksi(this.semuaposisi,passkan,warna_oposit);
                            if(w.cek_aman==false&&backup.cek_aman==true&&w.bukan_karena_raja==false){
                                aman = true;
                            }else if(w.cek_aman==false&&w.bukan_karena_raja==true){
                                aman = true;
                            } 
                        }else{
                            aman = true;  
                        }
                        break;
                    }else{
                        telusur_proteksi s = new telusur_proteksi(this.semuaposisi,passkan,warna);
                        if(s.cek_ada_proteksi==true){
                            aman = true;
                        }
                    }
                    
                }
                if(aman==false&&cek == true){
                    this.cek_skak_mati = true;
                    this.teks+="bunuh kiri";
                }
                
                //cek kanan //paten
                aman = false;
                cek = false;
                for (go = posisiakhir[1]+1; go <= 7; go++) {
                    posy = posisiakhir[0];
                    posx = go;
                    passkan[0] = posy;
                    passkan[1] = posx;
                    
                    if(posy<0||posy>7||posx<0||posx>7){
                        break;
                    }
                    cek = true;
                    if(!this.semuaposisi[posy][posx][0].equals("")){
                        if(!this.semuaposisi[posy][posx][0].equals(warna)){
                            String warna_oposit = "";
                            if(warna.equals("p")){
                                warna_oposit = "b";
                            }else{
                                warna_oposit = "p";
                            }
                            telusur_ancaman w = new telusur_ancaman(this.semuaposisi,passkan,warna_oposit);
                            telusur_ancaman backup = new telusur_ancaman(this.semuaposisi,passkan,warna);
                            telusur_proteksi r = new telusur_proteksi(this.semuaposisi,passkan,warna_oposit);
                            if(w.cek_aman==false&&backup.cek_aman==true&&w.bukan_karena_raja==false){
                                aman = true;
                            }else if(w.cek_aman==false&&w.bukan_karena_raja==true){
                                aman = true;
                            } 
                        }else{
                            aman = true;  
                        }
                        break;
                    }else{
                        telusur_proteksi s = new telusur_proteksi(this.semuaposisi,passkan,warna);
                        if(s.cek_ada_proteksi==true){
                            aman = true;
                        }
                    }
                    
                }
                if(aman==false&&cek == true){
                    this.cek_skak_mati = true;
                    this.teks+="bunuh kanan";
                }
                
                //cek kanan bawah //paten
                aman = false;
                cek = false;
                for (go = posisiakhir[1]+1; go <= 7; go++) {
                    posy = posisiakhir[0]+(go-posisiakhir[1]);
                    posx = go;
                    passkan[0] = posy;
                    passkan[1] = posx;
                    
                    if(posy<0||posy>7||posx<0||posx>7){
                        break;
                    }
                    cek = true;
                    if(!this.semuaposisi[posy][posx][0].equals("")){
                        if(!this.semuaposisi[posy][posx][0].equals(warna)){
                            String warna_oposit = "";
                            if(warna.equals("p")){
                                warna_oposit = "b";
                            }else{
                                warna_oposit = "p";
                            }
                            telusur_ancaman w = new telusur_ancaman(this.semuaposisi,passkan,warna_oposit);
                            telusur_ancaman backup = new telusur_ancaman(this.semuaposisi,passkan,warna);
                            telusur_proteksi r = new telusur_proteksi(this.semuaposisi,passkan,warna_oposit);
                            if(w.cek_aman==false&&backup.cek_aman==true&&w.bukan_karena_raja==false){
                                aman = true;
                            }else if(w.cek_aman==false&&w.bukan_karena_raja==true){
                                aman = true;
                            } 
                        }else{
                            aman = true;  
                        }
                        break;
                    }else{
                        telusur_proteksi s = new telusur_proteksi(this.semuaposisi,passkan,warna);
                        if(s.cek_ada_proteksi==true){
                            aman = true;
                        }
                    }
                    
                }
                if(aman==false&&cek == true){
                    this.cek_skak_mati = true;
                    this.teks+="bunuh kanan bawah";
                }
                
                //cek kanan atas //paten
                aman = false;
                cek = false;
                for (go = posisiakhir[1]+1; go <= 7; go++) {
                    posy = posisiakhir[0]+(posisiakhir[1]-go);
                    posx = go;
                    passkan[0] = posy;
                    passkan[1] = posx;
                    
                    if(posy<0||posy>7||posx<0||posx>7){
                        break;
                    }
                    cek = true;
                    if(!this.semuaposisi[posy][posx][0].equals("")){
                        if(!this.semuaposisi[posy][posx][0].equals(warna)){
                            String warna_oposit = "";
                            if(warna.equals("p")){
                                warna_oposit = "b";
                            }else{
                                warna_oposit = "p";
                            }
                            telusur_ancaman w = new telusur_ancaman(this.semuaposisi,passkan,warna_oposit);
                            telusur_ancaman backup = new telusur_ancaman(this.semuaposisi,passkan,warna);
                            telusur_proteksi r = new telusur_proteksi(this.semuaposisi,passkan,warna_oposit);
                            if(w.cek_aman==false&&backup.cek_aman==true&&w.bukan_karena_raja==false){
                                aman = true;
                            }else if(w.cek_aman==false&&w.bukan_karena_raja==true){
                                aman = true;
                            } 
                        }else{
                            aman = true;  
                        }
                        break;
                    }else{
                        telusur_proteksi s = new telusur_proteksi(this.semuaposisi,passkan,warna);
                        if(s.cek_ada_proteksi==true){
                            aman = true;
                        }
                    }
                    
                }
                if(aman==false&&cek == true){
                    this.cek_skak_mati = true;
                    this.teks+="bunuh kanan atas";
                }
                
                //cek kiri bawah //paten
                aman = false;
                cek = false;
                for (go = posisiakhir[1]-1; go >= 0; go--) {
                    posy = posisiakhir[0]+(posisiakhir[1]-go);
                    posx = go;
                    passkan[0] = posy;
                    passkan[1] = posx;
                    
                    if(posy<0||posy>7||posx<0||posx>7){
                        break;
                    }
                    cek = true;
                    if(!this.semuaposisi[posy][posx][0].equals("")){
                        if(!this.semuaposisi[posy][posx][0].equals(warna)){
                            String warna_oposit = "";
                            if(warna.equals("p")){
                                warna_oposit = "b";
                            }else{
                                warna_oposit = "p";
                            }
                            telusur_ancaman w = new telusur_ancaman(this.semuaposisi,passkan,warna_oposit);
                            telusur_ancaman backup = new telusur_ancaman(this.semuaposisi,passkan,warna);
                            telusur_proteksi r = new telusur_proteksi(this.semuaposisi,passkan,warna_oposit);
                            if(w.cek_aman==false&&backup.cek_aman==true&&w.bukan_karena_raja==false){
                                aman = true;
                            }else if(w.cek_aman==false&&w.bukan_karena_raja==true){
                                aman = true;
                            } 
                        }else{
                            aman = true;  
                        }
                        break;
                    }else{
                        telusur_proteksi s = new telusur_proteksi(this.semuaposisi,passkan,warna);
                        if(s.cek_ada_proteksi==true){
                            aman = true;
                        }
                    }
                    
                }
                if(aman==false&&cek == true){
                    this.cek_skak_mati = true;
                    this.teks+="bunuh kiri bawah";
                }
                
                
                //cek kiri atas //paten
                aman = false;
                cek = false;
                for (go = posisiakhir[1]-1; go >= 0; go--) {
                    posy = posisiakhir[0]+(go - posisiakhir[1]);
                    posx = go;
                    passkan[0] = posy;
                    passkan[1] = posx;
                    
                    if(posy<0||posy>7||posx<0||posx>7){
                        break;
                    }
                    cek = true;
                    if(!this.semuaposisi[posy][posx][0].equals("")){
                        if(!this.semuaposisi[posy][posx][0].equals(warna)){
                            String warna_oposit = "";
                            if(warna.equals("p")){
                                warna_oposit = "b";
                            }else{
                                warna_oposit = "p";
                            }
                            telusur_ancaman w = new telusur_ancaman(this.semuaposisi,passkan,warna_oposit);
                            telusur_ancaman backup = new telusur_ancaman(this.semuaposisi,passkan,warna);
                            telusur_proteksi r = new telusur_proteksi(this.semuaposisi,passkan,warna_oposit);
                            if(w.cek_aman==false&&backup.cek_aman==true&&w.bukan_karena_raja==false){
                                aman = true;
                            }else if(w.cek_aman==false&&w.bukan_karena_raja==true){
                                aman = true;
                            } 
                        }else{
                            aman = true;  
                        }
                        break;
                    }else{
                        telusur_proteksi s = new telusur_proteksi(this.semuaposisi,passkan,warna);
                        if(s.cek_ada_proteksi==true){
                            aman = true;
                        }
                    }
                    
                }
                if(aman==false&&cek == true){
                    this.cek_skak_mati = true;
                    this.teks+="bunuh kiri atas";
                }
                
            }
        }
    }
}
