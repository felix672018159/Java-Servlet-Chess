package catur;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import catur.mesincatur;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;





@WebServlet(name = "coba", urlPatterns = {"/coba"})//url pattern untuk mengakses dengan /coba
public class coba extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");//jenis konten text/html
        
        
        String dari     = request.getParameter("dari"); //mendapatkan parameter dari pada url
        String pindahke = request.getParameter("pindahke"); //mendapatkan parameter pindahke pada url
        String path = request.getContextPath(); //mendapatkan lokasi project dalam bentuk url
        int banyaklangkah; //inisialisasi banyaklangkah
        HttpSession session = request.getSession(); //inisilisasi session dengan mendapatkan session
                                                    //dengan mendapatkan session yang dikirim oleh http header
        ArrayList<String> posisisemua = new ArrayList<String>(); //inisialisasi arraylist string posisisemua
        if(session.isNew()){ //jika session adalah baru
            session.invalidate(); //menghapus session pada request session
            response.sendRedirect(path); //melakukan redirect / kunjungi situs pada lokasi project (/index.jsp)
        }else{ //jika session tidak baru
            //jika session dengan atribut posisi dan gameberakhir tidak kosong
            if (session.getAttribute("posisi") != null&&session.getAttribute("gameberakhir")!=null){
                ArrayList<String> semuaposisi = new ArrayList<String>();
                String gameberakhir = ""; //inisialisasi String game berakhir
                semuaposisi = (ArrayList<String>)session.getAttribute("posisi"); //passing arrraylist semuaposisi dengan
                                                                                 //arraylist dari session posisi
                gameberakhir = (String)session.getAttribute("gameberakhir"); //passing String gameberakhir dengan
                                                                             //String dari session gameberakhir
                banyaklangkah = semuaposisi.size(); //mengisi banyaklangkah(int) dengan banyak data pada array list 
                                                    //semuaposisi yang telah dipassing dengan session posisi
                mesincatur mesin = new mesincatur(); // inisialisasi kelas mesincatur
                if(banyaklangkah>0){ //jika banyak langkah lebih dari 0
                    mesin.mesincatur_init(semuaposisi); //passing data langkah yang tersimpan dalam session melalui
                                                        //variabel semuaposisi ke object kelas mesin catur.
                    mesin.pindah(dari, pindahke);       //lakukan proses perpindahan melalui parameter dari dan pindahke
                                                        //untuk di check langkah permindahan tersebut valid / tidak
                                                        
                    if(mesin.cek_langkah_valid==true){  // jika langkah legal
                        semuaposisi.add(mesin.hasilpindah); //tambahkan session posisi dengan variabel hasilpindah
                        if(mesin.game_berakhir==true){//jika mesin mendeteksi permainan sudah berakhir
                            session.setAttribute("gameberakhir", "1"); //isi session dengan atribut gameberakhir
                                                                       //bernilai 1 (String)
                        }
                    }
                    
                }else{
                }
                response.sendRedirect(path); //melakukan redirect / kunjungi situs pada lokasi project (/index.jsp)
                
            }else{// jika atribut posisi dan atribut gameberakhir pada session bernilai null
                response.sendRedirect(path); //melakukan redirect / kunjungi situs pada lokasi project (/index.jsp)
            }
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
