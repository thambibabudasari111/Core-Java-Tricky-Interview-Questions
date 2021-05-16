package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {

	public static void main(String[] args) {
		
		String str = "Thambi babu";
		
		//method 1
		System.out.println(str.toCharArray().length);
		
		//method 2
		System.out.println(str.lastIndexOf(""));
		
		//method 3
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);
		
		//method 4
		System.out.println(str.split("").length);
		
		//method 5
		int l = new StringBuilder(str).length();
		System.out.println(l);
		
		int count = 0;
		for(char c : str.toCharArray()) {
			count++;
		}
		
		System.out.println(count);

		System.out.println(getLength("String length"));
		
		System.out.println(getStringLength("testing"));
	}
	
	
	public static int getLength(String str) {
		
		int i=0;
		try {
			while(true) {
				str.charAt(i);
				i++;
			}
		}catch(IndexOutOfBoundsException e) {
			return i;
		}
	}
	
	public static int getStringLength(String str) {
		String st[] = str.split("");
		
		int count = 0;
		
		for (String s:st) {
			count+= s.toCharArray().length;
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
