package catur;

public class telusur_proteksi {
    public String[][][] semuaposisi = new String[8][8][3];
    public int[] posisiawal = new int[2];
    public int[] posisiakhir= new int[2];
    public String warna = ""; //p atau b
    public Boolean cek_ada_proteksi = false;
    public String teks = "";
    
    public telusur_proteksi(String[][][] posisi, int[] posisiakhir,String warna){
        this.semuaposisi = posisi;
        this.posisiakhir[0] = posisiakhir[0];
        this.posisiakhir[1] = posisiakhir[1];
        int x,y,z,go;
        
        //cek atas
        for (go = posisiakhir[0]-1; go >= 0; go--) {
            int posy = go;
            int posx = posisiakhir[1];
            if(posy<0||posy>7||posx<0||posx>7){
                break;
            }
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(this.semuaposisi[posy][posx][0].equals(warna)){
                    if(this.semuaposisi[posy][posx][1].equals("banteng")||
                       this.semuaposisi[posy][posx][1].equals("ster")){
                           this.cek_ada_proteksi = true;
                    }
                }
                break;
            }else{
            }
        }
        
        //cek bawah
        
        for (go = posisiakhir[0]+1; go <= 7; go++) {
            //this.teks +="owaeloh";
            int posy = go;
            int posx = posisiakhir[1];
            
            if(posy<0||posy>7||posx<0||posx>7){
                break;
            }
            
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(this.semuaposisi[posy][posx][0].equals(warna)){
                    
                    if(this.semuaposisi[posy][posx][1].equals("banteng")||
                       this.semuaposisi[posy][posx][1].equals("ster")){
                           this.cek_ada_proteksi = true;
                    }
                }
                break;
            }else{
            }
        }
        
        //cek kiri
        for (go = posisiakhir[1]-1; go >= 0; go--) {
            int posy = posisiakhir[0];
            int posx = go;
            if(posy<0||posy>7||posx<0||posx>7){
                break;
            }
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(this.semuaposisi[posy][posx][0].equals(warna)){
                    if(this.semuaposisi[posy][posx][1].equals("banteng")||
                       this.semuaposisi[posy][posx][1].equals("ster")){
                           this.cek_ada_proteksi = true;
                    }
                }
                break;
            }else{
            }
        }
        
        //cek kanan
        for (go = posisiakhir[1]+1; go <= 7; go++) {
            int posy = posisiakhir[0];
            int posx = go;
            if(posy<0||posy>7||posx<0||posx>7){
                break;
            }
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(this.semuaposisi[posy][posx][0].equals(warna)){
                    if(this.semuaposisi[posy][posx][1].equals("banteng")||
                       this.semuaposisi[posy][posx][1].equals("ster")){
                           this.cek_ada_proteksi = true;
                    }
                }
                break;
            }else{
            }
        }
        
        //cek kanan bawah
        for (go = posisiakhir[1]+1; go <= 7; go++) {
            int posy = posisiakhir[0]+(go-posisiakhir[1]);
            int posx = go;
            if(posy<0||posy>7||posx<0||posx>7){
                break;
            }
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(this.semuaposisi[posy][posx][0].equals(warna)){
                    if(this.semuaposisi[posy][posx][1].equals("mentri")||
                       this.semuaposisi[posy][posx][1].equals("ster")){
                           this.cek_ada_proteksi = true;
                    }
                }
                break;
            }else{
            }
        }
        
        //cek kanan atas
        for (go = posisiakhir[1]+1; go <= 7; go++) {
            int posy = posisiakhir[0]+(posisiakhir[1]-go);
            int posx = go;
            if(posy<0||posy>7||posx<0||posx>7){
                break;
            }
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(this.semuaposisi[posy][posx][0].equals(warna)){
                    if(this.semuaposisi[posy][posx][1].equals("mentri")||
                       this.semuaposisi[posy][posx][1].equals("ster")){
                           this.cek_ada_proteksi = true;
                    }
                }
                break;
            }else{
            }
        }
        
        //cek kiri bawah
        for (go = posisiakhir[1]-1; go >= 0; go--) {
            int posy = posisiakhir[0]+(posisiakhir[1]-go);
            int posx = go;
            if(posy<0||posy>7||posx<0||posx>7){
                break;
            }
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(this.semuaposisi[posy][posx][0].equals(warna)){
                    if(this.semuaposisi[posy][posx][1].equals("mentri")||
                       this.semuaposisi[posy][posx][1].equals("ster")){
                           this.cek_ada_proteksi = true;
                    }
                }
                break;
            }else{
            }
        }
        
        //cek kiri atas
        for (go = posisiakhir[1]-1; go >= 0; go--) {
            int posy = posisiakhir[0]+(go-posisiakhir[1]);
            int posx = go;
            if(posy<0||posy>7||posx<0||posx>7){
                break;
            }
            if(!this.semuaposisi[posy][posx][0].equals("")){
                if(this.semuaposisi[posy][posx][0].equals(warna)){
                    if(this.semuaposisi[posy][posx][1].equals("mentri")||
                       this.semuaposisi[posy][posx][1].equals("ster")){
                           this.cek_ada_proteksi = true;
                    }
                }
                break;
            }else{
            }
        }
        
        
        
        //langkah kuda
        //cek kuda atas kiri
        y = posisiakhir[0] + (-2);
        x = posisiakhir[1] + (-1);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)){
                    if(this.semuaposisi[y][x][1].equals("kuda")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        
        //cek kuda atas kanan
        y = posisiakhir[0] + (-2);
        x = posisiakhir[1] + (1);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)){
                    if(this.semuaposisi[y][x][1].equals("kuda")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        
        
        //cek kuda bawah kiri
        y = posisiakhir[0] + (2);
        x = posisiakhir[1] + (-1);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)){
                    if(this.semuaposisi[y][x][1].equals("kuda")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        
        //cek kuda bawah kanan
        y = posisiakhir[0] + (2);
        x = posisiakhir[1] + (1);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)){
                    if(this.semuaposisi[y][x][1].equals("kuda")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        
        //cek kuda kanan atas
        y = posisiakhir[0] + (-1);
        x = posisiakhir[1] + (2);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)){
                    if(this.semuaposisi[y][x][1].equals("kuda")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        
        //cek kuda kanan bawah
        y = posisiakhir[0] + (1);
        x = posisiakhir[1] + (2);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)){
                    if(this.semuaposisi[y][x][1].equals("kuda")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        
        //cek kuda kiri atas
        y = posisiakhir[0] + (-1);
        x = posisiakhir[1] + (-2);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)){
                    if(this.semuaposisi[y][x][1].equals("kuda")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        
        //cek kuda kiri bawah
        y = posisiakhir[0] + (1);
        x = posisiakhir[1] + (-2);
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)){
                    if(this.semuaposisi[y][x][1].equals("kuda")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        
        //cek pion
        //pion putih maju satu langkah
        y = posisiakhir[0]+1;
        x = posisiakhir[1];
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)&&this.semuaposisi[y][x][0].equals("p")){
                    if(this.semuaposisi[y][x][1].equals("pion")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        //pion putih maju dua langkah
        y = posisiakhir[0]+2;
        x = posisiakhir[1];
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(y==6&&this.semuaposisi[y-1][x][0].equals("")){
                    if(this.semuaposisi[y][x][0].equals(warna)&&this.semuaposisi[y][x][0].equals("p")){
                        if(this.semuaposisi[y][x][1].equals("pion")){
                               this.cek_ada_proteksi = true;
                        }
                    }
                }
            }else{}
        }
        
        
        /////////////////////////////////////////////
        //pion hitam maju satu langkah
        y = posisiakhir[0]-1;
        x = posisiakhir[1];
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(this.semuaposisi[y][x][0].equals(warna)&&this.semuaposisi[y][x][0].equals("b")){
                    if(this.semuaposisi[y][x][1].equals("pion")){
                           this.cek_ada_proteksi = true;
                    }
                }
            }else{}
        }
        //pion hitam maju dua langkah
        y = posisiakhir[0]-2;
        x = posisiakhir[1];
        if(y<0||y>7||x<0||x>7){
        }else{
            if(!this.semuaposisi[y][x][0].equals("")){
                if(y==1&&this.semuaposisi[y+1][x][0].equals("")){
                    if(this.semuaposisi[y][x][0].equals(warna)&&this.semuaposisi[y][x][0].equals("b")){
                        if(this.semuaposisi[y][x][1].equals("pion")){
                               this.cek_ada_proteksi = true;
                        }
                    }
                }
            }else{}
        }
    }
}
