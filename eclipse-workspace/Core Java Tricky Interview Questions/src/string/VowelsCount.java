package string;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

public class VowelsCount {
	/**
	 * total no.of vowels within a java String using:
	 * java
	 * java 8
	 * Google guava techniques
	 * 
	 * aeiou
	 * @return 
	 * 
	 */
	
	//Java
	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t =='i' || t =='o' || t =='u' ||
		t =='A' || t =='E' || t =='I' || t =='O' || t =='U';		
	}
	
	public static void main(String [] args) {
		
		String str = "aeiouAEIOU";
		int vCount = 0;
		
		for (int i = 0; i<str.length(); i++) {
			if(isVowel(str.charAt(i))) {
				vCount++;
			}
		}
		
		System.out.println(vCount);
		
		//Java 8 streams
		System.out.println("using java 8 streams");
		
		IntPredicate vowel = new IntPredicate() {
			
			@Override
			public boolean test(int t) {
				return t == 'a' || t == 'e' || t =='i' || t =='o' || t =='u' ||
						t =='A' || t =='E' || t =='I' || t =='O' || t =='U';
			}
		};
		
		String test = "Thambi Babu DasarI";
		long count = test.chars().filter(vowel).count();
		System.out.println(count);
		
		//using google guava
		String st = "java examples";
		int vocount = CharMatcher.anyOf("aeiouAEIOU").countIn(st);
		System.out.println(vocount);
		
	}
}
