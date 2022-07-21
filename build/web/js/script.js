$(document).ready(function(){

				function telusur(ypos,xpos,warna){
					var cek_aman = 1;
					//cek atas
					//$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","red");
					for(go=ypos+1;go<=8;go++){
						y = go;   //ypos atau go
						x = xpos; //xpos atau go
						var cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="ster"||jenispos=="banteng"){
									cek_aman = 0;
								}
								break;
							}
							if(warnapos==warna&&jenispos=="raja"){}else{
								break;
							}
						}else{
							
						}
					}

					//cek bawah
					for(go=ypos-1;go>=1;go--){
						y = go;   //ypos atau go
						x = xpos; //xpos atau go
						var cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="ster"||jenispos=="banteng"){
									cek_aman = 0;
								}
								break;
							}
							if(warnapos==warna&&jenispos=="raja"){}else{
								break;
							}
						}else{
							
						}
					}

					//cek kiri
					for(go=xpos-1;go>=1;go--){
						y = ypos;   //ypos atau go
						x = go; //xpos atau go
						var cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="ster"||jenispos=="banteng"){
									cek_aman = 0;
								}
								break;
							}
							if(warnapos==warna&&jenispos=="raja"){}else{
								break;
							}
						}else{
							
						}
					}

					//cek kanan
					for(go=xpos+1;go<=8;go++){
						y = ypos;   //ypos atau go
						x = go; //xpos atau go
						var cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="ster"||jenispos=="banteng"){
									cek_aman = 0;
								}
								break;
							}
							if(warnapos==warna&&jenispos=="raja"){}else{
								break;
							}
						}else{
							
						}
					}

					//cek kanan atas
					for(go=xpos+1;go<=8;go++){
						adder = go-xpos;
						y = ypos+adder;   //ypos atau go
						x = go; //xpos atau go
						var cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="ster"||jenispos=="mentri"){
									cek_aman = 0;
								}
								break;

							}
							if(warnapos==warna&&jenispos=="raja"){}else{
								break;
							}
						}else{
							
						}
					}

					//cek kiri atas
					for(go=xpos-1;go>=1;go--){
						adder = go-xpos;
						y = ypos-adder;   //ypos atau go
						x = go; //xpos atau go
						var cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="ster"||jenispos=="mentri"){
									cek_aman = 0;
								}
								break;
								
							}
							if(warnapos==warna&&jenispos=="raja"){}else{
								break;
							}
						}else{
							
						}
					}

					//cek kiri bawah
					
					for(go=xpos-1;go>=1;go--){
						adder = xpos-go;
						y = ypos-adder;   //ypos atau go
						x = go; //xpos atau go
						var cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="ster"||jenispos=="mentri"){
									cek_aman = 0;
								}
								break;
								
							}
							if(warnapos==warna&&jenispos=="raja"){}else{
								break;
							}
						}else{
							
						}
					}
					


					//cek kanan bawah
					for(go=xpos+1;go<=8;go++){
						adder = go-xpos;
						y = ypos-adder;   //ypos atau go
						x = go; //xpos atau go
						var cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="ster"||jenispos=="mentri"){
									cek_aman = 0;
								}
								break;
							}
							if(warnapos==warna&&jenispos=="raja"){}else{
								break;
							}
						}else{
							
						}
					}



					//cek kuda atas kiri
						x = xpos + (-1);
						y =	ypos + (2);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="kuda"){
									cek_aman = 0;
								}
							}
						}else{
							
						}
					//cek kuda atas kanan
						x = xpos + (1);
						y =	ypos + (2);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="kuda"){
									cek_aman = 0;
								}
							}
						}else{
							
						}

					//cek kuda bawah kiri
						x = xpos + (-1);
						y =	ypos + (-2);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="kuda"){
									cek_aman = 0;
								}
							}
						}else{
							
						}

					//cek kuda bawah kanan
						x = xpos + (1);
						y =	ypos + (-2);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="kuda"){
									cek_aman = 0;
								}
							}
						}else{
							
						}

					//cek kuda kiri bawah
						x = xpos + (-2);
						y =	ypos + (-1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="kuda"){
									cek_aman = 0;
								}
							}
						}else{
							
						}

					//cek kuda kiri atas
						x = xpos + (-2);
						y =	ypos + (1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="kuda"){
									cek_aman = 0;
								}
							}
						}else{
							
						}

					//cek kuda kanan atas
						x = xpos + (2);
						y =	ypos + (1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="kuda"){
									cek_aman = 0;
								}
							}
						}else{
							
						}

					//cek kuda kanan bawah
						x = xpos + (2);
						y =	ypos + (-1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos!=warna){
								if(jenispos=="kuda"){
									cek_aman = 0;
								}
							}
						}else{
							
						}
					//cek pion hitam kiri
						x = xpos + (-1);
						y =	ypos + (1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos=="b"&&warna!=warnapos){
								if(jenispos=="pion"){
									cek_aman=0;
								}
							}
						}else{
								
						}


					//cek pion hitam kanan
						x = xpos + (1);
						y =	ypos + (1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos=="b"&&warna!=warnapos){
								if(jenispos=="pion"){
									cek_aman=0;
								}
							}
						}else{
								
						}


					/////////////////////////////////////////////////////

					//cek pion putih kiri
						x = xpos + (-1);
						y =	ypos + (-1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos=="p"&&warna!=warnapos){
								if(jenispos=="pion"){
									cek_aman=0;
								}
							}
						}else{
								
						}


					//cek pion putih kanan
						x = xpos + (1);
						y =	ypos + (-1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warnapos=="p"&&warna!=warnapos){
								if(jenispos=="pion"){
									cek_aman=0;
								}
							}
						}else{
								
						}




					/////////////////////////////////////////////////////////////////////////////////
					//cek_raja atas kiri
						x = xpos + (-1);
						y =	ypos + (1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warna!=warnapos){
								if(jenispos=="raja"){
									cek_aman=0;
								}
							}
						}
						

					//cek_raja atas tengah
						x = xpos + (0);
						y =	ypos + (1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warna!=warnapos){
								if(jenispos=="raja"){
									cek_aman=0;
								}
							}
						}
					//cek_raja atas kanan
						x = xpos + (1);
						y =	ypos + (1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warna!=warnapos){
								if(jenispos=="raja"){
									cek_aman=0;
								}
							}
						}

					//cek_raja kanan tengah
						x = xpos + (1);
						y =	ypos + (0);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warna!=warnapos){
								if(jenispos=="raja"){
									cek_aman=0;
								}
							}
						}
					//cek_raja kiri tengah
						x = xpos + (-1);
						y =	ypos + (0);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warna!=warnapos){
								if(jenispos=="raja"){
									cek_aman=0;
								}
							}
						}


					//cek_raja bawah kiri
						x = xpos + (-1);
						y =	ypos + (-1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warna!=warnapos){
								if(jenispos=="raja"){
									cek_aman=0;
								}
							}
						}

					//cek_raja bawah tengah
						x = xpos + (0);
						y =	ypos + (-1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warna!=warnapos){
								if(jenispos=="raja"){
									cek_aman=0;
								}
							}
						}
					//cek_raja bawah kanan
						x = xpos + (1);
						y =	ypos + (-1);
						cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
							var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
							if(warna!=warnapos){
								if(jenispos=="raja"){
									cek_aman=0;
								}
							}
						}

					return cek_aman;
				}

				function cek_skak_raja_putih(){
					var stop = 0;
					for(y=1;y<=8;y++){
						for(x=1;x<=8;x++){
							cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
							
							if(cek>0){
								var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
								var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
								if(warnapos=="p"){
									if(jenispos=="raja"){
										cek = telusur(y,x,"p");
										if(cek ==1){
											console.log("raja putih aman");
											return 0;
										}else{
											console.log("raja putih terskak");
											return 1;
										}
										stop = 1;
										break;										
									}
								}
							}
						}
						if(stop==1){
							break;
						}
					}
				}


				function cek_skak_raja_hitam(){
					var stop = 0;
					for(y=1;y<=8;y++){
						for(x=1;x<=8;x++){
							cek= $("[posy="+y+"] [posx="+x+"]").has("img").length;
							
							if(cek>0){
								var warnapos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
								var jenispos = $("[posy="+y+"] [posx="+x+"] img").attr("src").split("-")[1].split(".png")[0];
								if(warnapos=="b"){
									if(jenispos=="raja"){
										cek = telusur(y,x,"b");
										if(cek ==1){
											console.log("raja hitam aman");
											return 0;
										}else{
											console.log("raja hitam terskak");
											return 1;
										}
										stop = 1;
										break;										
									}
								}
							}
						}
						if(stop==1){
							break;
						}
					}
				}

				function langkah_raja(ibaris,ikolom,jenis,warna){
					//posisiraja
					//cek pojok kiri atas
					xpos = ikolom + (-1);
					ypos = ibaris + (1);
					hasil = telusur(ypos,xpos,warna);

					cek= $("[posy="+ypos+"] [posx="+xpos+"]").has("img").length;
					sewarna=0;
					if(cek>0){
						var warnapos = $("[posy="+ypos+"] [posx="+xpos+"] img").attr("src").split("bidak/")[1].split("-")[0];
						if(warna==warnapos){
							sewarna=1;
						}
					}
					if(hasil==1&&sewarna==0){
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","yellow");	
					}else{
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","");	
					}

					//cek atas tengah
					xpos = ikolom + (0);
					ypos = ibaris + (1);
					hasil = telusur(ypos,xpos,warna);
					cek= $("[posy="+ypos+"] [posx="+xpos+"]").has("img").length;
					sewarna=0;
					if(cek>0){
						var warnapos = $("[posy="+ypos+"] [posx="+xpos+"] img").attr("src").split("bidak/")[1].split("-")[0];
						if(warna==warnapos){
							sewarna=1;
						}
					}
					if(hasil==1&&sewarna==0){
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","yellow");	
					}else{
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","");	
					}
					//cek pojok kanan atas
					xpos = ikolom + (1);
					ypos = ibaris + (1);
					hasil = telusur(ypos,xpos,warna);
					cek= $("[posy="+ypos+"] [posx="+xpos+"]").has("img").length;
					sewarna=0;
					if(cek>0){
						var warnapos = $("[posy="+ypos+"] [posx="+xpos+"] img").attr("src").split("bidak/")[1].split("-")[0];
						if(warna==warnapos){
							sewarna=1;
						}
					}
					if(hasil==1&&sewarna==0){
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","yellow");	
					}else{
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","");	
					}
					//cek kanan tengah
					xpos = ikolom + (1);
					ypos = ibaris + (0);
					hasil = telusur(ypos,xpos,warna);
					cek= $("[posy="+ypos+"] [posx="+xpos+"]").has("img").length;
					sewarna=0;
					if(cek>0){
						var warnapos = $("[posy="+ypos+"] [posx="+xpos+"] img").attr("src").split("bidak/")[1].split("-")[0];
						if(warna==warnapos){
							sewarna=1;
						}
					}
					if(hasil==1&&sewarna==0){
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","yellow");	
					}else{
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","");	
					}

					//cek kiri tengah
					xpos = ikolom + (-1);
					ypos = ibaris + (0);
					hasil = telusur(ypos,xpos,warna);
					cek= $("[posy="+ypos+"] [posx="+xpos+"]").has("img").length;
					sewarna=0;
					if(cek>0){
						var warnapos = $("[posy="+ypos+"] [posx="+xpos+"] img").attr("src").split("bidak/")[1].split("-")[0];
						if(warna==warnapos){
							sewarna=1;
						}
					}
					if(hasil==1&&sewarna==0){
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","yellow");	
					}else{
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","");	
					}

					//cek pojok kiri bawah
					xpos = ikolom + (-1);
					ypos = ibaris + (-1);
					hasil = telusur(ypos,xpos,warna);
					cek= $("[posy="+ypos+"] [posx="+xpos+"]").has("img").length;
					sewarna=0;
					if(cek>0){
						var warnapos = $("[posy="+ypos+"] [posx="+xpos+"] img").attr("src").split("bidak/")[1].split("-")[0];
						if(warna==warnapos){
							sewarna=1;
						}
					}
					if(hasil==1&&sewarna==0){
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","yellow");	
					}else{
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","");	
					}

					//cek tengah bawah
					xpos = ikolom + (0);
					ypos = ibaris + (-1);
					hasil = telusur(ypos,xpos,warna);
					cek= $("[posy="+ypos+"] [posx="+xpos+"]").has("img").length;
					sewarna=0;
					if(cek>0){
						var warnapos = $("[posy="+ypos+"] [posx="+xpos+"] img").attr("src").split("bidak/")[1].split("-")[0];
						if(warna==warnapos){
							sewarna=1;
						}
					}
					if(hasil==1&&sewarna==0){
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","yellow");	
					}else{
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","");	
					}

					//cek pojok kanan bawah
					xpos = ikolom + (1);
					ypos = ibaris + (-1);
					hasil = telusur(ypos,xpos,warna);
					cek= $("[posy="+ypos+"] [posx="+xpos+"]").has("img").length;
					sewarna=0;
					if(cek>0){
						var warnapos = $("[posy="+ypos+"] [posx="+xpos+"] img").attr("src").split("bidak/")[1].split("-")[0];
						if(warna==warnapos){
							sewarna=1;
						}
					}
					if(hasil==1&&sewarna==0){
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","yellow");	
					}else{
						$("[posy="+ypos+"] [posx="+xpos+"]").css("background-color","");	
					}

				}
				function langkah_bms(ibaris,ikolom, jenis,warna){//banteng mentri ster telusur jalan
					var x=0;
						if(jenis=="ster"||jenis=="banteng"){
							for(x = ibaris; x<=8;x++){
								var cek= $("[posy="+x+"] [posx="+ikolom+"]").has("img").length;
								if(cek>0&&(x!=ibaris)){
									var warnapos = $("[posy="+x+"] [posx="+ikolom+"] img").attr("src").split("bidak/")[1].split("-")[0];
									//console.log(warnapos+' '+warna);
									if(warnapos!=warna){
										$("[posy="+x+"] [posx="+ikolom+"]").css("background-color","red");
										break;
									}else{
										break;
									}
								}else{
									$("[posy="+x+"] [posx="+ikolom+"]").css("background-color","yellow");
								}
								//console.log(x);
							}
						}
						if(jenis=="ster"||jenis=="banteng"){
							for(x = ibaris; x>=1;x--){
								var cek= $("[posy="+x+"] [posx="+ikolom+"]").has("img").length;
								if(cek>0&&(x!=ibaris)){
									var warnapos = $("[posy="+x+"] [posx="+ikolom+"] img").attr("src").split("bidak/")[1].split("-")[0];
									//console.log(warnapos+' '+warna);
									if(warnapos!=warna){
										$("[posy="+x+"] [posx="+ikolom+"]").css("background-color","red");
										break;
									}else{
										break;
									}
								}else{
									$("[posy="+x+"] [posx="+ikolom+"]").css("background-color","yellow");
								}
								//console.log(x);
							}
						}
						if(jenis=="ster"||jenis=="banteng"){
							for(x = ikolom; x<=8;x++){
								var cek= $("[posy="+ibaris+"] [posx="+x+"]").has("img").length;
								if(cek>0&&(x!=ikolom)){
									var warnapos = $("[posy="+ibaris+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
									//console.log(warnapos+' '+warna);
									if(warnapos!=warna){
										$("[posy="+ibaris+"] [posx="+x+"]").css("background-color","red");
										break;
									}else{
										break;
									}
								}else{
									$("[posy="+ibaris+"] [posx="+x+"]").css("background-color","yellow");
								};
								//console.log(x);
							}
						}
						if(jenis=="ster"||jenis=="banteng"){
							for(x = ikolom; x>=1;x--){
								var cek= $("[posy="+ibaris+"] [posx="+x+"]").has("img").length;
								if(cek>0&&(x!=ikolom)){
									var warnapos = $("[posy="+ibaris+"] [posx="+x+"] img").attr("src").split("bidak/")[1].split("-")[0];
									//console.log(warnapos+' '+warna);
									if(warnapos!=warna){
										$("[posy="+ibaris+"] [posx="+x+"]").css("background-color","red");
										break;
									}else{
										break;
									}
								}else{
									$("[posy="+ibaris+"] [posx="+x+"]").css("background-color","yellow");
								};
								//console.log(x);
							}
						}
						if(jenis=="ster"||jenis=="mentri"){
						//diagonal ke kanan atas
							for(x = ibaris; x<=8;x++){
								var cek= $("[posy="+x+"] [posx="+(ikolom+(x-ibaris))+"]").has("img").length;
								if(cek>0&&(x!=ibaris)){
									var warnapos = $("[posy="+x+"] [posx="+(ikolom+(x-ibaris))+"] img").attr("src").split("bidak/")[1].split("-")[0];
									//console.log(warnapos+' '+warna);
									if(warnapos!=warna){
										$("[posy="+x+"] [posx="+(ikolom+(x-ibaris))+"]").css("background-color","red");
										break;
									}else{
										break;
									}
								}else{
									$("[posy="+x+"] [posx="+(ikolom+(x-ibaris))+"]").css("background-color","yellow");
								};
								//console.log(x);
							}
						}
						//diagonal ke kiri atas
						if(jenis=="ster"||jenis=="mentri"){
							for(x = ibaris; x<=8;x++){
								var cek= $("[posy="+x+"] [posx="+(ikolom+(ibaris-x))+"]").has("img").length;
								if(cek>0&&(x!=ibaris)){
									var warnapos = $("[posy="+x+"] [posx="+(ikolom+(ibaris-x))+"] img").attr("src").split("bidak/")[1].split("-")[0];
									//console.log(warnapos+' '+warna);
									if(warnapos!=warna){
										$("[posy="+x+"] [posx="+(ikolom+(ibaris-x))+"]").css("background-color","red");
										break;
									}else{
										break;
									}
								}else{
									$("[posy="+x+"] [posx="+(ikolom+(ibaris-x))+"]").css("background-color","yellow");
								};
								//console.log(x);
							}
						}
						//diagonal kanan bawah
						if(jenis=="ster"||jenis=="mentri"){
							for(x = ibaris; x>=1;x--){
								//console.log(ikolom);
								var cek= $("[posy="+x+"] [posx="+(ikolom+(ibaris-x))+"]").has("img").length;
								if(cek>0&&(x!=ibaris)){
									var warnapos = $("[posy="+x+"] [posx="+(ikolom+(ibaris-x))+"] img").attr("src").split("bidak/")[1].split("-")[0];
									//console.log(warnapos+' '+warna);
									if(warnapos!=warna){
										$("[posy="+x+"] [posx="+(ikolom+(ibaris-x))+"]").css("background-color","red");
										break;
									}else{
										break;
									}
								}else{
									$("[posy="+x+"] [posx="+(ikolom+(ibaris-x))+"]").css("background-color","yellow");
								};
								//console.log(x);
							}
						}
						//diagonal kiri bawah
						if(jenis=="ster"||jenis=="mentri"){
							for(x = ibaris; x>=1;x--){
								//console.log(ikolom);
								var cek= $("[posy="+x+"] [posx="+(ikolom+(x-ibaris))+"]").has("img").length;
								if(cek>0&&(x!=ibaris)){
									var warnapos = $("[posy="+x+"] [posx="+(ikolom+(x-ibaris))+"] img").attr("src").split("bidak/")[1].split("-")[0];
									//console.log(warnapos+' '+warna);
									if(warnapos!=warna){
										$("[posy="+x+"] [posx="+(ikolom+(x-ibaris))+"]").css("background-color","red");
										break;
									}else{
										break;
									}
								}else{
									$("[posy="+x+"] [posx="+(ikolom+(x-ibaris))+"]").css("background-color","yellow");
								};
								//console.log(x);
							}
						}
				}
				function langkah_kuda(ibaris,ikolom,jenis,warna){
						//cek atas kiri
						offsety = 2;
						offsetx = -1;
						var cek= $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warnapos!=warna){
								$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","red");	
							}
						}else{
							$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","yellow");
						}

						//cek atas kanan
						offsety = 2;
						offsetx = 1;
						var cek= $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warnapos!=warna){
								$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","red");	
							}
						}else{
							$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","yellow");
						}
						
						//cek bawah kiri
						offsety = -2;
						offsetx = -1;
						var cek= $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warnapos!=warna){
								$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","red");	
							}
						}else{
							$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","yellow");
						}

						//cek bawah kanan
						offsety = -2;
						offsetx = 1;
						var cek= $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warnapos!=warna){
								$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","red");	
							}
						}else{
							$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","yellow");
						}

						//cek kiri atas
						offsety = 1;
						offsetx = -2;
						var cek= $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warnapos!=warna){
								$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","red");	
							}
						}else{
							$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","yellow");
						}

						//cek kiri bawah
						offsety = -1;
						offsetx = -2;
						var cek= $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warnapos!=warna){
								$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","red");	
							}
						}else{
							$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","yellow");
						}

						//cek kanan atas
						offsety = 1;
						offsetx = 2;
						var cek= $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warnapos!=warna){
								$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","red");	
							}
						}else{
							$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","yellow");
						}

						//cek kanan bawah
						offsety = -1;
						offsetx = 2;
						var cek= $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").has("img").length;
						if(cek>0){
							var warnapos = $("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warnapos!=warna){
								$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","red");	
							}
						}else{
							$("[posy="+(ibaris+offsety)+"] [posx="+(ikolom+offsetx)+"]").css("background-color","yellow");
						}
				}
				function langkah_pion(ibaris,ikolom,jenis,warna){
					
					//gerakan melangkah maju
					if(warna=="p"){
						var cek = $("[posy="+(ibaris+1)+"] [posx="+ikolom+"]").has("img").length;
						if(cek>0){
						}else{
							$("[posy="+(ibaris+1)+"] [posx="+ikolom+"]").css("background-color","yellow");
							if(ibaris==2){
								var cek= $("[posy="+4+"] [posx="+ikolom+"]").has("img").length;
								if(cek>0){

								}else{
									$("[posy="+4+"] [posx="+ikolom+"]").css("background-color","yellow");
								}
							}
						}
						
					}
					if(warna=="b"){
						var cek = $("[posy="+(ibaris-1)+"] [posx="+ikolom+"]").has("img").length;
						if(cek>0){
						}else{
							$("[posy="+(ibaris-1)+"] [posx="+ikolom+"]").css("background-color","yellow");
							if(ibaris==7){
								var cek= $("[posy="+5+"] [posx="+ikolom+"]").has("img").length;
								if(cek>0){

								}else{
									$("[posy="+5+"] [posx="+ikolom+"]").css("background-color","yellow");
								}
							}
						}
					}


					//gerakan memakan 					
					//memakan seblah kiri dan kanan oleh bidak warna putih
					if(warna=="p"){
						var cekkiri = $("[posy="+(ibaris+1)+"] [posx="+(ikolom-1)+"]").has("img").length;
						var cekkanan = $("[posy="+(ibaris+1)+"] [posx="+(ikolom+1)+"]").has("img").length;
						if(cekkiri>0){
							var warnapos = $("[posy="+(ibaris+1)+"] [posx="+(ikolom-1)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warna!=warnapos){
								$("[posy="+(ibaris+1)+"] [posx="+(ikolom-1)+"]").css("background-color","red");
							}
						}
						if(cekkanan>0){
							var warnapos = $("[posy="+(ibaris+1)+"] [posx="+(ikolom+1)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warna!=warnapos){
								$("[posy="+(ibaris+1)+"] [posx="+(ikolom+1)+"]").css("background-color","red");
							}
						}
						

					}
					//memakan seblah kiri dan kanan oleh bidak warna hitam
					if(warna=="b"){
						var cekkiri = $("[posy="+(ibaris-1)+"] [posx="+(ikolom-1)+"]").has("img").length;
						var cekkanan = $("[posy="+(ibaris-1)+"] [posx="+(ikolom+1)+"]").has("img").length;
						if(cekkiri>0){
							var warnapos = $("[posy="+(ibaris-1)+"] [posx="+(ikolom-1)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warna!=warnapos){
								$("[posy="+(ibaris-1)+"] [posx="+(ikolom-1)+"]").css("background-color","red");
							}
						}
						if(cekkanan>0){
							var warnapos = $("[posy="+(ibaris-1)+"] [posx="+(ikolom+1)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warna!=warnapos){
								$("[posy="+(ibaris-1)+"] [posx="+(ikolom+1)+"]").css("background-color","red");
							}
						}
					}

					//gerakan memotong
					//gerakan memotong pion putih
					if(warna=="p"){
						var cekkiri           = $("[posy="+(ibaris+1)+"] [posx="+(ikolom-1)+"]").has("img").length;
						var cekkanan          = $("[posy="+(ibaris+1)+"] [posx="+(ikolom+1)+"]").has("img").length;
						var kondisi           = $("[posy="+(ibaris)+"] [posx="+(ikolom)+"]").attr("kondisi");
						if(cekkiri>0){
							var warnapos = $("[posy="+(ibaris+1)+"] [posx="+(ikolom-1)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warna==warnapos){
							}else{
								if(kondisi=="1"||kondisi=="3"){
									$("[posy="+(ibaris+1)+"] [posx="+(ikolom-1)+"]").css("background-color","red");
								}
								
							}
						}else{
							if(kondisi=="1"||kondisi=="3"){
								$("[posy="+(ibaris+1)+"] [posx="+(ikolom-1)+"]").css("background-color","red");
							}
						}

						if(cekkanan>0){
							var warnapos = $("[posy="+(ibaris+1)+"] [posx="+(ikolom+1)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warna==warnapos){
							}else{
								if(kondisi=="2"||kondisi=="3"){
									$("[posy="+(ibaris+1)+"] [posx="+(ikolom+1)+"]").css("background-color","red");
								}
							}
						}else{
							if(kondisi=="2"||kondisi=="3"){
								$("[posy="+(ibaris+1)+"] [posx="+(ikolom+1)+"]").css("background-color","red");
							}
						}

					}

					//gerakan memotong pion hitam
					if(warna=="b"){
						var cekkiri           = $("[posy="+(ibaris-1)+"] [posx="+(ikolom-1)+"]").has("img").length;
						var cekkanan          = $("[posy="+(ibaris-1)+"] [posx="+(ikolom+1)+"]").has("img").length;
						var kondisi           = $("[posy="+(ibaris)+"] [posx="+(ikolom)+"]").attr("kondisi");
						if(cekkiri>0){
							var warnapos = $("[posy="+(ibaris-1)+"] [posx="+(ikolom-1)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warna==warnapos){
							}else{
								if(kondisi=="1"||kondisi=="3"){
									$("[posy="+(ibaris-1)+"] [posx="+(ikolom-1)+"]").css("background-color","red");
								}
								
							}
						}else{
							if(kondisi=="1"||kondisi=="3"){
								$("[posy="+(ibaris-1)+"] [posx="+(ikolom-1)+"]").css("background-color","red");
							}
						}

						if(cekkanan>0){
							var warnapos = $("[posy="+(ibaris-1)+"] [posx="+(ikolom+1)+"] img").attr("src").split("bidak/")[1].split("-")[0];
							if(warna==warnapos){
							}else{
								if(kondisi=="2"||kondisi=="3"){
									$("[posy="+(ibaris-1)+"] [posx="+(ikolom+1)+"]").css("background-color","red");
								}
							}
						}else{
							if(kondisi=="2"||kondisi=="3"){
								$("[posy="+(ibaris-1)+"] [posx="+(ikolom+1)+"]").css("background-color","red");
							}
						}

					}

					
				}

				var cekadayangenable = 0;
				$("td").hover(
					function(){
						//$("td").css("background-color","green");
						var bidak = $(this).find('img').attr("src");
						var cek = $(this).children("img").length;
						var kondisi =0
						for(i=1;i<=8;i++){
							for(y=1;y<=8;y++){
								var petak = $("[posy="+i+"] [posx="+y+"]").attr("aktif");
								if(petak=="1"){
									kondisi=1;
								}
							}
						}
						if(kondisi==1){
							cekadayangenable=1;
						}else{
							$("td").removeAttr("style");
							cekadayangenable=0;
						}
						if(cek>0){
							var warna = bidak.split("bidak/")[1].split("-")[0];
							var jenis = bidak.split("-")[1].split(".png")[0];
							//alert(warna+"-"+jenis);
							
							//$(this).find("td").css("background-color","red");
							//$("[posy=1] [posx=1]").css("background-color","green");
							var baris =  $(this).parent("tr").attr("posy");
							var kolom = $(this).attr("posx");
							var ibaris = parseInt(baris);
							var ikolom = parseInt(kolom);
							if(cekadayangenable!=1){
								$(this).css("background-color","yellow");
								if(jenis=="ster"||jenis=="mentri"||jenis=="banteng"){
									langkah_bms(ibaris,ikolom,jenis,warna);	
								}else if(jenis=="pion"){
									langkah_pion(ibaris,ikolom,jenis,warna);
								}else if(jenis=='kuda'){
									langkah_kuda(ibaris,ikolom,jenis,warna);
								}else if(jenis=='raja'){
									langkah_raja(ibaris,ikolom,jenis,warna);
								}
							}
							
						};
						//alert(x);

					},
					function(){
						//var baris =  $(this).parent("tr").attr("posy");
						//var kolom = $(this).attr("posx");
						//var ibaris = parseInt(baris);
						//var ikolom = parseInt(kolom);
						//var x;
						//$(this).removeAttr("style");
						//
						//for(x = ibaris; x<=8;x++){
						

						for(i=1;i<=8;i++){
							for(y=1;y<=8;y++){
								var petak = $("[posy="+i+"] [posx="+y+"]").attr("aktif");
								if(petak=="1"){
									cekadayangenable=1;
								}
							}
						}
							//$("[posy="+x+"] [posx="+ikolom+"]").removeAttr("style");
						if(cekadayangenable==1){
							
						}else{
							//console.log(cekadayangenable);

							$("td").removeAttr("style");
							//console.log(x);
						}
						//}
						//$(this).find("td").removeAttr("style");
						//$("td").removeAttr("style");
					}
				);
				var posisix = "";
				var posisiy = "";
				var pindahx = "";
				var pindahy = "";
				$("td").click(function(){
						console.log(cek_skak_raja_putih());
						console.log(cek_skak_raja_hitam());
						var h = parseInt($(this).attr("posx"));
						var v = parseInt($(this).parent("tr").attr("posy"));
						var cek = $(this).children("img").length;
						var posx;
						var posy;
						for(i=1;i<=8;i++){
							for(y=1;y<=8;y++){
								var petak = $("[posy="+i+"] [posx="+y+"]").attr("aktif");
								if(petak=="1"){
									posx = y;
									posy = i;
									cekadayangenable=1;
								}
							}
						}

						
						//var cekaktif = $(this).parent("td").attr("aktif");
						//if(cek>0){
							if(cekadayangenable==1){
								if(posx==h && posy==v){
									$(this).attr('aktif', function(index, attr){
		    								return attr == 1 ? 0 : 1;
									});
								}else{
									pindahx = parseInt($(this).attr("posx"))-1;
									pindahy = 8-parseInt($(this).parent("tr").attr("posy"));
									window.location = "coba?dari="+posisiy+""+posisix+"&pindahke="+pindahy+""+pindahx;
								};
							}else{
								$(this).attr('aktif', function(index, attr){
		    							return attr == 1 ? 0 : 1;
								});

								posisix = parseInt($(this).attr("posx"))-1;
								posisiy = 8-parseInt($(this).parent("tr").attr("posy"));
								$(this).css("background-color","green");
								console.log(posisiy+" "+posisix +" = y dan x");
							}
						//}
						//console.log(cekaktif);
						//console.log($(this).parent("td").parent("tr").attr("posy")+"  "+$(this).parent("td").attr("posx"));
						
						
				});
				console.log(cek_skak_raja_putih());
				console.log(cek_skak_raja_hitam());
				console.log("TERLOAD SANGAT AMAN");
			});