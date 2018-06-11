package Blockchain;
import java.security.MessageDigest;

// This class is to encrypt data with the example of SHA-256

public class StringUtil {
	public static String applySha256(String input) {
		try {
		// Ko hieu
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
		// Ko hieu	
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			
			StringBuffer hexString = new StringBuffer();
			
			for (int i = 0; i < hash.length; i++) {
				// Ko hieu
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length()==1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
