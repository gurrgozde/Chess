import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//Black ve White classlae�n�n amac� tehtid etti�i z�t renkteki taraf�n puan�n� d���rmektir.
//Score amac� Puan� bast�rmakt� fakat orada s�k�nt� ya�ad�m. D�zenlemeyi tam olarak ayarlayamad���m� d���n�yorum. D�zeltmeye zaman�m yok.


//Puan da ise puanlar� tutuyorum ve resik alt�ndaysa olan puanlar� tutuyorum.
public class Text  {//Txt dosyam� iki boyutlu bir string arrayin i�ine yerle�tirdim.
	public static void main (String[] args) {
		File f = new File ("C:/Users/G�zde/OneDrive/Masa�st�/cs-tech-chees/board1.txt");
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
