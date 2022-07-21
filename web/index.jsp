<%-- 
    Document   : main
    Created on : Nov 30, 2020, 9:46:31 AM
    Author     : user
--%>

<%@page import = "java.io.*,java.util.*,catur.mesincatur" contentType="text/html" pageEncoding="UTF-8"%>
<%//initial 
    ArrayList<ArrayList<ArrayList<String>>> posisi = new ArrayList<ArrayList<ArrayList<String>>>();
    String map[][][] = { //baris[],kolom[][],isi[][][]
                            {{"b","banteng","0"}, {"b","kuda","0"} ,{"b","mentri","0"}, {"b","ster","0"}, {"b","raja","0"}, {"b","mentri","0"}, {"b","kuda","0"}, {"b","banteng","0"}},
                            {{"b","pion","0"}   , {"b","pion","0"} ,{"b","pion","0"}  , {"b","pion","0"}, {"b","pion","0"}, {"b","pion","0"}  , {"b","pion","0"}, {"b","pion","0"}},
                            {{"","",""}, {"","",""} ,{"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}},
                            {{"","",""}, {"","",""} ,{"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}},
                            {{"","",""}, {"","",""} ,{"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}},
                            {{"","",""}, {"","",""} ,{"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}},
                            {{"p","pion","0"}   , {"p","pion","0"} ,{"p","pion","0"}  , {"p","pion","0"}, {"p","pion","0"}, {"p","pion","0"}  , {"p","pion","0"}, {"p","pion","0"}   },
                            {{"p","banteng","0"}, {"p","kuda","0"} ,{"p","mentri","0"}, {"p","ster","0"}, {"p","raja","0"}, {"p","mentri","0"}, {"p","kuda","0"}, {"p","banteng","0"}},
                        };
%>
<%out.print("<!DOCTYPE html>"
        + "<html>"
        + "<head>"
	+ "	<style>"
	+ "		*{"
	+ "			margin:0;"
	+ "			padding:0;"
	+ "		}"
	+ "		table{"
	+ "			border:1px solid #000;"
	+ "		}"
	+ "		td{"
	+ "			width:40px;"
	+ "			height:40px;"
	+ "		}"
	+ "		td.w {"
	+ "			background-color:#fff;"
	+ "		}"
	+ "		td.c{"
	+ "			background-color:#c7a320;"
	+ "		}"
	+ "		td:hover{"
	+ "			background-color:blue;"
	+ "			cursor:pointer;"
	+ "		}"
	+ "	</style>"
	+ "	<script src='./js/jquery3.5.1.min.js'></script>"
	+ "	<script src='./js/script.js'></script>"
	+ "</head>"
	+ "<body>"
        + "     <div style='position:relative;'>"
	+ "	<table style='position:relative;float:left;'>"
	+ "		<thead></thead>"
	+ "		<tbody>");%>
        
        
<%
                int x,y,z; //inisialisasi variabel untuk melakukan iterasi
                String setting = ""; //inisialisasi variabel setting
                int banyakstep = 0; //inisialisasi banyak langkah yang sudah dimainkan
                for(x=0;x<map.length;x++){ //iterasi yang digunakan untuk menyusun array menjadi 
                                           //sebuah kalimat agar data yang disimpan lebih mudah
                    setting+= "baris";
                    for(y=0;y<map[x].length;y++){
                        setting+= "kolom";
                        setting+= map[x][y][0]+"pos"+map[x][y][1]+"pos"+map[x][y][2];
                    }
                }
                ArrayList<String> posisisemua = new ArrayList<String>(); //inisialisasi variabel
                String cek_gameberakhir = ""; //variabel yang digunakan untuk menandai apakah 
                                              //game sudah berakhir atau belum
                posisisemua.add(setting); //menambahkan variabel setting ke arraylist posisisemua
                
                
                if(session.isNew()){ //check apakah session tersebut baru
                    session.setMaxInactiveInterval(60*60*24); //seting agar sesi tetap aktif selama 1 hari
                    session.setAttribute("posisi", posisisemua); //menambahkan variabel posisi pada session untuk diisi arraylist posisi semua
                    session.setAttribute("gameberakhir","0"); //inisialisasi variabel session gameberakhir = 0
                    ArrayList<String> semuaposisi = new ArrayList<String>(); //inisialisasi arraylist string semuaposisi
                    semuaposisi = (ArrayList<String>)session.getAttribute("posisi"); //variable semua posisi di passing dengan arraylist berupa string
                                                                                     //yang diambil dari session dengan variable posisi
                    banyakstep = semuaposisi.size(); //mengisi banyakstep(int) dengan banyak data pada semua posisi
                
                }else{ //jika session tersebut tidak baru
                    ArrayList<String> semuaposisi = new ArrayList<String>(); //inisialisasi arraylist semua posisi
                    semuaposisi = (ArrayList<String>)session.getAttribute("posisi"); //variable semua posisi di passing dengan arraylist berupa string
                                                                                     //yang diambil dari session dengan variable posisi
                    setting = semuaposisi.get(semuaposisi.size()-1); //init variabel setting mengambil data terakhir dari semuaposisi
                    String[] parse = setting.split("baris");
                    for (x = 1; x < parse.length; x++) {// program untuk mengubah string menjadi bentuk array 3d
                        String[] kolom = parse[x].split("kolom");
                        for (y = 1; y < kolom.length; y++) {
                            if(kolom[y].split("pos").length>0){
                                String[] item = kolom[y].split("pos");
                                map[x-1][y-1][0]= item[0];
                                map[x-1][y-1][1]= item[1];
                                map[x-1][y-1][2]= item[2];
                            }else{
                                map[x-1][y-1][0]= "";
                                map[x-1][y-1][1]= "";
                                map[x-1][y-1][2]= "";
                            };
                        }
                    }                   
                    banyakstep = semuaposisi.size(); //mengisi banyakstep(int) dengan banyak data pada semuaposisi
                    posisisemua = semuaposisi; // mengisi arraylist string posisi semua dengan arraylist semuaposisi
                }
                
                
                
                String maker="";
                for (int i = 0; i < map.length; i++) {//menyususn row / baris dari atas ke bawah
                    maker+= "<tr posy='"+(8-i)+"'>"; //berisi table row
                    for (int j = 0; j < map[i].length; j++) { //menyusun kolom dari kiri ka kanan
                        String pad = ""; //inisialisasi jenis warna petak catur
                        if(i%2==0){ //jika baris petak catur genap
                            if(j%2==0){ //jika kolom petak catur genap
                                pad = "w"; 
                            }else{      //jika kolom petak catur ganjil
                                pad = "c";
                            }
                        }else{      //jika baris petak catur ganjil
                            if(j%2==0){  //jika kolom petak catur genap
                                pad = "c";
                            }else{       //jika kolom petak catur ganjil
                                pad = "w";
                            }
                        }
                        maker+="<td class='"+pad+"' posx='"+(j+1)+"' kondisi='"+map[i][j][2]+"'>";
                        if(!map[i][j][0].equals("")){ //jika pada posisi petak catur pada array map [i][j][0]
                                                      //ada bidak yang menempati akan di isi dengan gambar bidak
                                                      //yang ada pada folder bidak pada webpages
                            maker+="<img src='./bidak/"+map[i][j][0]+"-"+map[i][j][1]+".png' width='40'>";
                        }
                        
                        maker+="</td>";
            
                    }   
                    maker+="</tr>";
                }
                out.print(maker); //menampilkan hasil posisi petak dan bidak catur pada html
%>
<%
	out.print("		</tbody>"
                 +"<tfoot></tfoot>"
                 +"</table>"
                 +"</div>"
        );
%>
                <%
                   //mengisi variable string cek_gameberakhir dari session berartribut gameberakhir
                   cek_gameberakhir = request.getSession(false).getAttribute("gameberakhir").toString();
                    
                   out.print("Banyak Langkah     :"+banyakstep+"<br>"); //menampilan jumlah step yang ada
                   if(banyakstep%2==1){//jika banyak step bernilai ganjil,
                       out.print("Sekarang langkah : WARNA PUTIH<br>");
                   }else{              //jika banyak step bernilai genap
                       out.print("Sekarang langkah : WARNA HITAM<br>");
                   }
                   out.print("apakah game berakhir ??? ");
                   if(cek_gameberakhir.equals("1")){
                       out.print("GAME SUDAH BERAKHIR");
                   }
                %>
<%
out.print("</body></html>");
%>