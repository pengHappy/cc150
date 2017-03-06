public class Solution {
	public boolean isUniqueChar(String s) {
		int[] data = new int[8];
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(((data[c / 32] >> (c % 32)) & 1) > 0) {
				return false;
			}
			data[c / 32] += (1 << (c % 32));
		}
		return true;
	}
}
