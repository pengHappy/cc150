void reverse(char *str) {
	char *end = str;
	char temp;
	if(str) {
		while(*end) {
			end++;
		}
		end--;
		while(str < end) {
			temp = *end;
			*end = *str;
			*str = temp;
			end--;
			str++;
		}
	}
}
