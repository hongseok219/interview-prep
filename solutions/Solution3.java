import java.lang.System;

public class Solution3 {

	public static char[] replaceSpaces(char[] str, int trueLen) {
		int spaceCounter = 0;
    for (int i = 0; i < trueLen; i++) {
    	if (str[i] == ' ')
    		spaceCounter++;
    }
    
    int n = spaceCounter * 3 + trueLen;
    for (int i = 0; i < trueLen; i++)
    	str[i + n] = str[i];
    int j = 0;
    for (int i = n; i < n + trueLen; i++) {
    	if (str[i] == ' ') {
    		str[j] = '%';
    		str[j+1] = '2';
    		str[j+2] = '0';
    		j = j + 2;
    	}
    	else {
    		str[j] = str[i];
    	}
      j++;
      str[i] = ' ';
    }

    return str;
	}

	public static void main(String... args) {
		char[] ex1 = {};
        char[] ex2 = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char[] ex3 = {' ', 'b', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char[] ex4 = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't' , 'h', ' ', ' ', ' ', ' '};
        char[] ex5 = {'M', 'r', ' ', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't' , 'h', ' ', ' ', ' ', ' ', ' ', ' '};

		System.out.println(replaceSpaces(ex1, 0));
		System.out.println(replaceSpaces(ex2, 3));
		System.out.println(replaceSpaces(ex3, 2));
		System.out.println(replaceSpaces(ex4, 13));
		System.out.println(replaceSpaces(ex5, 14));
	}
}
