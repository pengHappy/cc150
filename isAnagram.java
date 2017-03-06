public class Solution {
	public boolean anagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		int unique_t = 0, unique_s = 0;
		int[] letter = new int[256];
		char[] t_array = t.toCharArray();
		for(char c : t_array) {
			unique_t += letter[c] > 0 ? 0 : 1;
			letter[c]++;
		}
		char[] s_array = s.toCharArray();
		for(int i = 0; i < s_array.length; i++) {
			char c = s_array[i];
			if(letter[c] == 0) {
				return false;
			}
			letter[c]--;
			if(letter[c] == 0) {
				unique_s++;
				if(unique_s == unique_t) {
					return i == s_array.length - 1;
				}
			}
		}
		return false;
	}
}
