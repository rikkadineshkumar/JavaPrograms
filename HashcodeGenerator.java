
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashcodeGenerator {

	public static String hashPassword(String password) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		byte[] b = md.digest();
		StringBuffer sb = new StringBuffer();
		for(byte b1 : b) {
			sb.append(Integer.toHexString(b1 & 0xff).toString());	
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		
		System.out.print("Enter the string::");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try {
			System.out.println("hashcode::9c9f1c65b1dc1f79498c9f9eb61e1a");
			System.out.println("hashcode::"+HashcodeDemo1.hashPassword(s));
		}catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

}
