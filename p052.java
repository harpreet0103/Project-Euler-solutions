/* 
 * Solution to Project Euler problem 52
 * By Nayuki Minase
 */

import java.util.Arrays;


public class p052 {
	
	public static void main(String[] args) {
		outer:
		for (int i = 1; ; i++) {
			for (int j = 2; j < 6; j++) {
				if (!hasSameDigits(i * j, i * (j + 1)))
					continue outer;
			}
			System.out.println(i);
			break;
		}
	}
	
	
	private static boolean hasSameDigits(int x, int y) {
		return Arrays.equals(sortDigits(x), sortDigits(y));
	}
	
	
	private static char[] sortDigits(int x) {
		char[] result = Integer.toString(x).toCharArray();
		Arrays.sort(result);
		return result;
	}
	
}