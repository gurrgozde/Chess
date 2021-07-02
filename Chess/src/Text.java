import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//Black ve White classlaeýnýn amacý tehtid ettiði zýt renkteki tarafýn puanýný düþürmektir.
//Score amacý Puaný bastýrmaktý fakat orada sýkýntý yaþadým. Düzenlemeyi tam olarak ayarlayamadýðýmý düþünüyorum. Düzeltmeye zamaným yok.


//Puan da ise puanlarý tutuyorum ve resik altýndaysa olan puanlarý tutuyorum.
public class Text  {//Txt dosyamý iki boyutlu bir string arrayin içine yerleþtirdim.
	public static void main (String[] args) {
		File f = new File ("C:/Users/Gözde/OneDrive/Masaüstü/cs-tech-chees/board1.txt");
		String array [][]= new String [8][8];
		try {
			String s;
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
			int i=0;
			while ((s = reader.readLine()) != null) {
				 
				 System.out.println(s);
					String[] arrSplit = s.split(" ");
					for(int j=0; j<array.length; j++) {
						array[i][j]=arrSplit[j];
					}
					i++;
			   
			  }
			
			Score score= new Score(array);
			score.Color(array);
				
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("exception");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
	}
}
