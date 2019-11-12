import java.util.Arrays;

public class CheckAnagram {
	public static boolean CheckAnagram(String a, String b) {
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		if(Arrays.equals(c, d)) {
			return true;
		}else {
			return false;
		}
		
	}

}
