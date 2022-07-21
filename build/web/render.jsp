<%-- 
    Document   : main
    Created on : Nov 30, 2020, 9:46:31 AM
    Author     : user
--%>
<%@page import = "java.io.*,java.util.*,catur.mesincatur" contentType="text/html" pageEncoding="UTF-8"%>
<%//initial 
    ArrayList<ArrayList<ArrayList<String>>> posisi = new ArrayList<ArrayList<ArrayList<String>>>();
    String map[][][] = { //baris,kolom,isi
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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div>
            <% //int a=1;
                //out.print(posisi.get(0)+posisi.size());
                //posisi.get(0).get(0).add(0,"jancok");
                //out.print(posisi.get(0).get(0).get(0));
                //out.print(weis.x);
                int x,y,z;
                String setting = "";
                for(x=0;x<map.length;x++){
                    setting+= "baris";
                    for(y=0;y<map[x].length;y++){
                        setting+= "kolom";
                        setting+= map[x][y][0]+"pos"+map[x][y][1]+"pos"+map[x][y][2];
                    }
                }
                ArrayList<String> posisisemua = new ArrayList<String>();
                if(session.isNew()){
                    out.print("nice");
                    
                    posisisemua.add(setting);
                    session.setAttribute("posisi", posisisemua);
                }else{
                    out.print("uhoh");
                    ArrayList<String> semuaposisi = new ArrayList<String>();
                    semuaposisi = (ArrayList<String>)session.getAttribute("posisi");
                    if(semuaposisi.size()<0){
                        semuaposisi.add(setting);
                    }
                    mesincatur mesin = new mesincatur(semuaposisi);
                    out.print(mesin.posisi.size());
                    out.print("<br><br><br>");
                    //session.setAttribute("posisi",posisisemua);
                    out.print(semuaposisi.size()+"<br>");
                    int a;
                    for (int i = 0; i < semuaposisi.size(); i++) {
                            out.print(semuaposisi.get(i)+"<br>");
                    }
                    out.print(mesin.posisistring);
                    out.print(mesin.cek());
                    //String d = "jancuk";
                    //out.print(d.split("")[1]);
                    //session.invalidate();
                    //session.invalidate();
                    //session.invalidate();
                    //response.sendRedirect("index.html");
                }
            %>
        </div>
    </body>
</html>
