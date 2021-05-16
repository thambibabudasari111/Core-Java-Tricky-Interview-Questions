package string;

import java.util.StringJoiner;

public class StringJoinerConcept {
	
	/**
	 * StringJoiner
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		//Thambi, Babu, Dasari
		
		StringJoiner joiner = new StringJoiner(", ", "{", "}");
		joiner.add("Thambi")
				.add("Babu")
					.add("Dasari");
		System.out.println(joiner);
		
		
	}

}
