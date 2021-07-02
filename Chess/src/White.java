
public class White extends Score {
	int i,j;
	double tut,black;

	String type;
	String [][] s;
	Puan puan= new Puan();
	
	public White(int i,int j,String type,String [][] s) {
		 this.i=i;
		 this.j=j;
		 this.s=s;
		 this.type=type;
	 }
	public void Type() {
		if(type.equals("kb")) {//kale için hesaplama
			for(int k=i;k<=8;k++ ) {
				if(!s[k][j].equals("xx")) {
					if(s[k][j].contains("s")) {
						tut=+ puan.Hesap(s[k][j]);
						break;
					}
					else if(s[k][j].contains("b")) {
						break;
					}
				}
			}
			for(int k=i;k<=8;k-- ) {
				if(!s[k][j].equals("xx")) {
					if(s[k][j].contains("s")) {
						tut=+puan.Hesap(s[k][j]);
						break;
					}
					else if(s[k][j].contains("b")) {
						break;
					}
				}
			}
			for(int k=j;k<=8;k++ ) {
				if(!s[i][k].equals("xx")) {
					if(s[i][k].contains("s")) {
						tut=+puan.Hesap(s[i][k]);
						break;
					}
					else if(s[i][k].contains("b")) {
						break;
					}
				}
			}
			for(int k=j;k<=8;k-- ) {
				if(!s[i][k].equals("xx")) {
					if(s[i][k].contains("s")) {
						tut=+puan.Hesap(s[i][k]);
						break;
					}
					else if(s[i][k].contains("b")) {
						break;
					}
				}
			}
		}
		if(type.equals("ab")) {//at için
			if(i!=7 && j!=6) {
			if(!s[i+1][j+2].equals("xx")) {
				if(s[i+1][j+2].contains("s")) {
					tut=+puan.Hesap(s[i+1][j+2]);
				}
			}}
			if(i!=6 && j!=7) {
			if(!s[i+2][j+1].equals("xx")) {
				if(s[i+2][j+1].contains("s")) {
					tut=+puan.Hesap(s[i+2][j+1]);
				}
			}}
			if(i!=1 && j!=0) {
			if(!s[i-2][j-1].equals("xx")) {
				if(s[i-2][j-1].contains("s")) {
					tut=+puan.Hesap(s[i-2][j-1]);
				}
			}}
			if(i!=0 && j!=1) {
			if(!s[i-1][j-2].equals("xx")) {
				if(s[i-1][j-2].contains("s")) {
					tut=+puan.Hesap(s[i-1][j-2]);
				}
			}}
			if(i!=6 && j!=0) {
			if(!s[i+2][j-1].equals("xx")) {
				if(s[i+2][j-1].contains("s")) {
					tut=+puan.Hesap(s[i+2][j-1]);
				}
			}}
			if(i!=7 && j!=1) {
			if(!s[i+1][j-2].equals("xx")) {
				if(s[i+1][j-2].contains("s")) {
					tut=+puan.Hesap(s[i+1][j-2]);
				}
			}}
			if(i!=1 && j!=7) {
			if(!s[i-2][j+1].equals("xx")) {
				if(s[i-2][j+1].contains("s")) {
					tut=+puan.Hesap(s[i-2][j+1]);
				}
			}}
			if(i!=0 && j!=6) {
			if(!s[i-1][j+2].equals("xx")) {
				if(s[i-1][j+2].contains("s")) {
					tut=+puan.Hesap(s[i-1][j+2]);
				}
			}}
			
		}
		if(type.equals( "fb")) {
			for(int k=i; k<= 8; k++) {
				for(int m=j; m>=8; m++) {
					if(!s[k][m].equals("xx")) {
						if(s[k][m].contains("s")) {
							tut=+puan.Hesap(s[k][m]);
							break;
						}
						else
							break;
					
					}
				}
			}
			for(int k=i; k<= 8; k++) {
				for(int m=j; m>=8; m--) {
					if(!s[k][m].equals("xx")) {
						if(s[k][m].contains("s")) {
							tut=+puan.Hesap(s[k][m]);
							break;
						}
						else
							break;
					
					}
				}
			}
			for(int k=i; k<= 8; k--) {
				for(int m=j; m>=8; m++) {
					if(!s[k][m].equals("xx")) {
						if(s[k][m].contains("s")) {
							tut=+puan.Hesap(s[k][m]);
							break;
						}
						else
							break;
					
					}
				}
			}
			for(int k=i; k<= 8; k--) {
				for(int m=j; m>=8; m--) {
					if(!s[k][m].equals("xx")) {
						if(s[k][m].contains("s")) {
							tut=+puan.Hesap(s[k][m]);
							break;
						}
						else
							break;
					
					}
				}
			}
		}
		if(type.equals( "vb")) {
			boolean dene= false;
			while(dene==false) {
				if(!s[i+1][j].equals("xx")) {
					if(s[i+1][j].contains("s")) {
						tut=+puan.Hesap(s[i+1][j]);
					}
					else if(s[i+1][j].contains("b")) {
						dene=true;
					}
				}
			}
			dene= false;
			while(dene==false) {
			if(!s[i-1][j+1].equals("xx")) {
				if(s[i-1][j+1].contains("s")) {
					tut=+puan.Hesap(s[i-1][j+1]);
				}
				else if(s[i+1][j].contains("b")) {
					dene=true;
				}
			}
			}
			while(dene==false) {
			if(!s[i+1][j+1].equals("xx")) {
				if(s[i+1][j+1].contains("s")) {
					tut=+puan.Hesap(s[i+1][j+1]);
				}
				else if(s[i+1][j].contains("b")) {
					dene=true;
				}
			}
			}
			while(dene==false) {
			if(!s[i][j+1].equals("xx")) {
				if(s[i][j+1].contains("s")) {
					tut=+puan.Hesap(s[i][j+1]);
				}
				else if(s[i+1][j].contains("b")) {
					dene=true;
				}
			}
			}
			while(dene==false) {
				if(!s[i+1][j-1].equals("xx")) {
					if(s[i+1][j-1].contains("s")) {
						tut=+puan.Hesap(s[i+1][j-1]);
					}
				
					else if(s[i+1][j].contains("b")) {
						dene=true;
					}
				}
				}
			while(dene==false) {
				if(!s[i][j-1].equals("xx")) {
					if(s[i][j-1].contains("s")) {
						tut=+puan.Hesap(s[i][j-1]);
					}
				
					else if(s[i+1][j].contains("b")) {
						dene=true;
					}
				}
				}
			
			while(dene==false) {
				if(!s[i-1][j-1].equals("xx")) {
					if(s[i-1][j-1].contains("s")) {
						tut=+puan.Hesap(s[i-1][j-1]);
					}
					else if(s[i+1][j].contains("b")) {
						dene=true;
					}
				}
				}
			
			while(dene==false) {
				if(!s[i-1][j].equals("xx")) {
					if(s[i-1][j].contains("s")) {
						tut=+puan.Hesap(s[i-1][j]);
					}
				
					else if(s[i+1][j].contains("b")) {
						dene=true;
					}
				}
				}
			
			
			
		}
		if(type.equals( "sb")) {
			if(!s[i+1][j].equals("xx")) {
				if(s[i+1][j].contains("s")) {
					tut=+puan.Hesap(s[i+1][j]);
				}
			}
			if(!s[i-1][j+1].equals("xx")) {
				if(s[i-1][j+1].contains("s")) {
					tut=+puan.Hesap(s[i-1][j+1]);
				}
			}
			if(!s[i+1][j+1].equals("xx")) {
				if(s[i+1][j+1].contains("s")) {
					tut=+puan.Hesap(s[i+1][j+1]);
				}
			}
			if(!s[i][j+1].equals("xx")) {
				if(s[i][j+1].contains("s")) {
					tut=+puan.Hesap(s[i][j+1]);
				}
			}
			if(!s[i+1][j-1].equals("xx")) {
				if(s[i+1][j-1].contains("s")) {
					tut=+puan.Hesap(s[i+1][j-1]);
				}
			}
			if(!s[i][j-1].equals("xx")) {
				if(s[i][j-1].contains("s")) {
					tut=+puan.Hesap(s[i][j-1]);
				}
			}
			if(!s[i-1][j-1].equals("xx")) {
				if(s[i-1][j-1].contains("s")) {
					tut=+puan.Hesap(s[i-1][j-1]);
				}
			}
			if(!s[i-1][j].equals("xx")) {
				if(s[i-1][j].contains("s")) {
					tut=+puan.Hesap(s[i-1][j]);
				}
			}
			
		}
		if(type.equals( "pb")) {
			if(i!=7 && j!=7) {
				if(!s[i+1][j+1].equals("xx")) {
					if(s[i+1][j+1].contains("s")) {
						tut=+puan.Hesap(s[i+1][j+1]);
					}
				}}
			
				if(i!=7 && j!=0) {
				if(!s[i+1][j-1].equals("xx")) {
					if(s[i+1][j-1].contains("s")) {
						tut=+puan.Hesap(s[i+1][j-1]);
					}
				}}
			
				if(i!=0 && j!=7) {
				if(!s[i-1][j+1].equals("xx")) {
					if(s[i-1][j+1].contains("s")) {
						tut=+puan.Hesap(s[i-1][j+1]);
					}
				}}
			
				if(i!=0 && j!=0) {
				if(!s[i-1][j-1].equals("xx")) {
					if(s[i-1][j-1].contains("s")) {
						tut=+puan.Hesap(s[i-1][j-1]);
					}
				}}
		}
		Black(tut);
		Print();
		
	}
	 

	
	
}
