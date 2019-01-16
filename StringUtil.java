package testpack;
import java.math.BigInteger;
import java.security.*;

public class StringUtil {

	public static String applySha256(String string) {
		
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			
			byte[] messageDigest = md.digest(string.getBytes());
			
			BigInteger  no = new BigInteger(1, messageDigest);
			
			String hashText = no.toString(16);
			
			while(hashText.length() < 32) {
				hashText = "0" + hashText;
			}
			
			return hashText;
			
		}catch(NoSuchAlgorithmException nsae) {
			System.out.println("Exception thrown" + " for incorrect algorithm: " + nsae);
		}	
		
		return null;
	}

}
