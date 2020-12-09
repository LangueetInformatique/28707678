package devoir06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testExec {


	public static void main(String[] args) throws IOException {
		
		FileInputStreamTP9.Copie("src/devoir06/Nom.txt", "src/devoir06/test.txt");
		FileInputStreamTP9.Compresse("src/devoir06/Nom.txt", "src/devoir06/Nom.zip");
		FileInputStreamTP9.Proprietes(null);
		//System.out.println(texte);

	}

}
