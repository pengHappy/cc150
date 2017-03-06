public class Solution {
	public void removeDuplicateLetters(char[] str) {
		int[] data = new int[8];
		int k = 0;
		for(int i = 0; i < str.length; i++) {
			char c = str[i];
			if(((data[c / 32] >> (c % 32)) & 1) > 0) {
				continue;
			}
			data[c / 32] += (1 << (c % 32));
			str[k++] = c;
		}
		str[k] = '\0';
	}
}
