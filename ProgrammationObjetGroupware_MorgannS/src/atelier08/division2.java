package atelier08;
import java.lang.Throwable;


public class division2 {

	public static void main(String[] args)  { division(); }
	
	public static void division() throws ArithmeticException {
		int i = 1000, j;
		do {
			i--; j=1/i;
		} while (true);
	}
}
