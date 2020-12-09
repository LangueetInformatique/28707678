package devoir06;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

import util.Keyboard;

public class FileInputStreamTP9 extends FileInputStream {
	
	private File fichier;

	public FileInputStreamTP9(File fichier) throws FileNotFoundException {
		super(fichier);
		this.fichier = fichier;
	}
	
	public static void Copie(String nomFichier, String nomCopie) throws IOException {
		// je ne suis pas parvenue à utliser un argument file
		/*
		 * Je ne suis pas sûre de comment créer mon objet file
		 */
		File source = new File(nomFichier);
		File dest = new File(nomCopie);
		
		try (InputStream fis = new FileInputStream(source);
			OutputStream fos =  new FileOutputStream(dest)){
						
			byte[] buffer = new byte[1024];
	        int length;

	        while ((length = fis.read(buffer)) > 0) {

	        fos.write(buffer, 0, length);
	        }
			
			fis.close();
			fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public static void Compresse(String fichier, String fichierComp) {
		try {
			File fin = new File(fichier);
			FileInputStream fis = new FileInputStream(fin);
			File fout = new File(fichierComp);
			FileOutputStream fos = new FileOutputStream(fout);
			DeflaterOutputStream dos = new DeflaterOutputStream(fos);

			// calcul de la taille du fichier et copie
			byte mem[] = new byte[1024];
			fis.read(mem);
			dos.write(mem);

			fis.close();
			dos.close();
		}

		catch (EOFException e) {
			System.out.println("Fin de lecture de fichier");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void Proprietes(File fichier) {
		System.out.println("Dernière modification : "+fichier.lastModified());
		System.out.println("Taille : "+fichier.length());
		System.out.println("Chemin : "+fichier.getAbsolutePath());
		System.out.println("Nom du fichier : "+fichier.getName());
		
	}
	/*
	public static void CompareTo() {
		
	}

	public void givenIoAPI_whenCopied_thenCopyExistsWithSameContents() 
			  throws IOException {
			 
			    File copied = new File("src/test/resources/copiedWithIo.txt");
			    try (
			      InputStream in = new BufferedInputStream(
			        new FileInputStream(original));
			      OutputStream out = new BufferedOutputStream(
			        new FileOutputStream(copied))) {
			 
			        byte[] buffer = new byte[1024];
			        int lengthRead;
			        while ((lengthRead = in.read(buffer)) > 0) {
			            out.write(buffer, 0, lengthRead);
			            out.flush();
			        }
			    }
			 
			    assertThat(copied).exists();
			    assertThat(Files.readAllLines(original.toPath())
			      .equals(Files.readAllLines(copied.toPath())));
			}
			*/
}

