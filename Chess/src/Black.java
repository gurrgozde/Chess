
public class Black extends Score  {
	int i,j;
	double tut=0,white;
	String type;
	String [][] s;
	Puan puan= new Puan();
	public Black(int i,int j,String type,String [][] s) {
		 this.i=i;
		 this.j=j;
		 this.s=s;
		 this.type=type;
	 }
	public void Type() {
		if(type.equals("ks")) {//kale için hesaplama
			for(int k=i;k<=8;k++ ) {
				if(!s[k][j].equals("xx")) {
					if(s[k][j].contains("b")) {
						tut=+ puan.Hesap(s[k][j]);
						break;
					}
					else if(s[k][j].contains("s")) {
						break;
					}
				}
			}
			for(int k=i;k<=8;k-- ) {
				if(!s[k][j].equals("xx")) {
					if(s[k][j].contains("b")) {
						tut=+puan.Hesap(s[k][j]);
						break;
					}
					else if(s[k][j].contains("s")) {
						break;
					}
				}
			}
			for(int k=j;k<=8;k++ ) {
				if(!s[i][k].equals("xx")) {
					if(s[i][k].contains("b")) {
						tut=+puan.Hesap(s[i][k]);
						break;
					}
					else if(s[i][k].contains("s")) {
						break;
					}
				}
			}
			for(int k=j;k<=8;k-- ) {
				if(!s[i][k].equals("xx")) {
					if(s[i][k].contains("b")) {
						tut=+puan.Hesap(s[i][k]);
						break;
					}
					else if(s[i][k].contains("s")) {
						break;
					}
				}
			}
		}
		if(type.equals("as")) {//at için
			if(!s[i+1][j+2].equals("xx")) {
				if(s[i+1][j+2].contains("b")) {
					tut=+puan.Hesap(s[i+1][j+2]);
				}
			}
			if(!s[i+2][j+1].equals("xx")) {
				if(s[i+2][j+1].contains("b")) {
					tut=+puan.Hesap(s[i+2][j+1]);
				}
			}
			if(!s[i-2][j-1].equals("xx")) {
				if(s[i-2][j-1].contains("b")) {
					tut=+puan.Hesap(s[i-2][j-1]);
				}
			}
			if(!s[i-1][j-2].equals("xx")) {
				if(s[i-1][j-2].contains("b")) {
					tut=+puan.Hesap(s[i-1][j-2]);
				}
			}
			if(!s[i+2][j-1].equals("xx")) {
				if(s[i+2][j-1].contains("b")) {
					tut=+puan.Hesap(s[i+2][j-1]);
				}
			}
			if(!s[i+1][j-2].equals("xx")) {
				if(s[i+1][j-2].contains("b")) {
					tut=+puan.Hesap(s[i+1][j-2]);
				}
			}
			if(!s[i-2][j+1].equals("xx")) {
				if(s[i-2][j+1].contains("b")) {
					tut=+puan.Hesap(s[i-2][j+1]);
				}
			}
			if(!s[i-1][j+2].equals("xx")) {
				if(s[i-1][j+2].contains("b")) {
					tut=+puan.Hesap(s[i-1][j+2]);
				}
			}
			
		}
		if(type.equals( "fs")) {
			for(int k=i; k<= 8; k++) {
				for(int m=j; m>=8; m++) {
					if(!s[k][m].equals("xx")) {
						if(s[k][m].contains("b")) {
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
						if(s[k][m].contains("b")) {
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
						if(s[k][m].contains("b")) {
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
						if(s[k][m].contains("b")) {
							tut=+puan.Hesap(s[k][m]);
							break;
						}
						else
							break;
					
					}
				}
			}
		}
		if(type.equals( "vs")) {
			boolean dene= false;
			while(dene==false) {
				if(!s[i+1][j].equals("xx")) {
					if(s[i+1][j].contains("b")) {
						tut=+puan.Hesap(s[i+1][j]);
					}
					else if(s[i+1][j].contains("s")) {
						dene=true;
					}
				}
			}
			dene= false;
			while(dene==false) {
			if(!s[i-1][j+1].equals("xx")) {
				if(s[i-1][j+1].contains("b")) {
					tut=+puan.Hesap(s[i-1][j+1]);
				}
				else if(s[i+1][j].contains("s")) {
					dene=true;
				}
			}
			}
			while(dene==false) {
			if(!s[i+1][j+1].equals("xx")) {
				if(s[i+1][j+1].contains("b")) {
					tut=+puan.Hesap(s[i+1][j+1]);
				}
				else if(s[i+1][j].contains("s")) {
					dene=true;
				}
			}
			}
			while(dene==false) {
			if(!s[i][j+1].equals("xx")) {
				if(s[i][j+1].contains("b")) {
					tut=+puan.Hesap(s[i][j+1]);
				}
				else if(s[i+1][j].contains("s")) {
					dene=true;
				}
			}
			}
			while(dene==false) {
				if(!s[i+1][j-1].equals("xx")) {
					if(s[i+1][j-1].contains("b")) {
						tut=+puan.Hesap(s[i+1][j-1]);
					}
				
					else if(s[i+1][j].contains("s")) {
						dene=true;
					}
				}
				}
			while(dene==false) {
				if(!s[i][j-1].equals("xx")) {
					if(s[i][j-1].contains("b")) {
						tut=+puan.Hesap(s[i][j-1]);
					}
				
					else if(s[i+1][j].contains("s")) {
						dene=true;
					}
				}
				}
			
			while(dene==false) {
				if(!s[i-1][j-1].equals("xx")) {
					if(s[i-1][j-1].contains("b")) {
						tut=+puan.Hesap(s[i-1][j-1]);
					}
					else if(s[i+1][j].contains("s")) {
						dene=true;
					}
				}
				}
			
			while(dene==false) {
				if(!s[i-1][j].equals("xx")) {
					if(s[i-1][j].contains("b")) {
						tut=+puan.Hesap(s[i-1][j]);
					}
				
					else if(s[i+1][j].contains("s")) {
						dene=true;
					}
				}
				}
			
			
			
		}
		if(type.equals( "ss")) {
			if(i!=7) {
			if(!s[i+1][j].equals("xx")) {
				if(s[i+1][j].contains("b")) {
					tut=+puan.Hesap(s[i+1][j]);
				}
				
			}
			}
			if(j!=7 && i!=0) {
			if(!s[i-1][j+1].equals("xx")) {
				if(s[i-1][j+1].contains("b")) {
					tut=+puan.Hesap(s[i-1][j+1]);
				}
			}}
			if(j!=7 && i!=7) {
			if(!s[i+1][j+1].equals("xx")) {
				if(s[i+1][j+1].contains("b")) {
					tut=+puan.Hesap(s[i+1][j+1]);
				}
			}}
			if(j!=7) {
			if(!s[i][j+1].equals("xx")) {
				if(s[i][j+1].contains("b")) {
					tut=+puan.Hesap(s[i][j+1]);
				}
			}}
			if(i!=7 && j!=0) {
			if(!s[i+1][j-1].equals("xx")) {
				if(s[i+1][j-1].contains("b")) {
					tut=+puan.Hesap(s[i+1][j-1]);
				}
			}}
			if(j!=0) {
			if(!s[i][j-1].equals("xx")) {
				if(s[i][j-1].contains("b")) {
					tut=+puan.Hesap(s[i][j-1]);
				}
			}}
			if(i!=0 && j!=0) {
			if(!s[i-1][j-1].equals("xx")) {
				if(s[i-1][j-1].contains("b")) {
					tut=+puan.Hesap(s[i-1][j-1]);
				}
			}}
			if(i!=0) {
			if(!s[i-1][j].equals("xx")) {
				if(s[i-1][j].contains("b")) {
					tut=+puan.Hesap(s[i-1][j]);
				}
			}}
			
		}
		if(type.equals( "ps")) {
			if(i!=7 && j!=7) {
			if(!s[i+1][j+1].equals("xx")) {
				if(s[i+1][j+1].contains("b")) {
					tut=+puan.Hesap(s[i+1][j+1]);
				}
			}}
		
			if(i!=7 && j!=0) {
			if(!s[i+1][j-1].equals("xx")) {
				if(s[i+1][j-1].contains("b")) {
					tut=+puan.Hesap(s[i+1][j-1]);
				}
			}}
		
			if(i!=0 && j!=7) {
			if(!s[i-1][j+1].equals("xx")) {
				if(s[i-1][j+1].contains("b")) {
					tut=+puan.Hesap(s[i-1][j+1]);
				}
			}}
		
			if(i!=0 && j!=0) {
			if(!s[i-1][j-1].equals("xx")) {
				if(s[i-1][j-1].contains("b")) {
					tut=+puan.Hesap(s[i-1][j-1]);
				}
			}}
		}
		White(tut);
		Print();
	}
	
	
	
}
