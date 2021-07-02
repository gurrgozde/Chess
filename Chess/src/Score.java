
public class Score extends Puan{
	private double scorew,scoreb;
	
	private String[][] s;
	public Score(String[][] s) {
		super();
		this.s = s;
		
	}
	public Score() {
		super();
	}
	public void Color(String[][] s) {
		for(int i=0; i<s.length;i++) {
			for(int j=0; j<s.length;j++) {
				if(!s[i][j].equals("xx")){
					if(s[i][j].contains("s")) {
						Black black= new Black(i, j,s[i][j].toString(), s );
						black.Type();
					}
					else if(s[i][j].contains("b")) {
						White white = new White(i, j,s[i][j].toString(), s);
						white.Type();
					}
				}
			}
		}
		
	}
	public void White(double tut) {
		scorew= scorew+tut;

		
		
	}
	public void Black(double tut) {
		scoreb= scoreb+tut;
		
	}
	
	public void Print() {
		scorew= 139-scorew;
		scoreb= 139-scoreb;
		System.out.println("white"+ scorew);
		System.out.println("black"+ scoreb);
	}
	
	
}
