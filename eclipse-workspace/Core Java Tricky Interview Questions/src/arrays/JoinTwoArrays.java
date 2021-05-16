package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class JoinTwoArrays {

	/**
	 * Join two arrays using java 8 and google guava 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String batsman[] = {"Rohit","Dhawan","Virat", "KL Rahul", "Rishab pant", "Shreyas"};
		String bowlers[] = {"Bhuvi","Bhumrah","Sami", "Hardik", "Chahal", "Jaddu"};
		
		//Java 8:
		Stream<String>bat = Arrays.stream(batsman);
		Stream<String>bow = Arrays.stream(bowlers);
		
		String[] fullTeam = Stream.concat(bat, bow).toArray(size -> new String [size]);
		
		for(String s : fullTeam) {
			System.out.println(s);
		}

		System.out.println(fullTeam.length);
		System.out.println("-------------------------");
		
		//using google guava: for object arrays
		String allTeam[] = ObjectArrays.concat(batsman, bowlers, String.class);
		for(String s : allTeam) {
			System.out.println(s);
		}
		System.out.println("-------------------------");
		//google guava: using primitive datatypes
		int[] p1 = {1,2,3,4,5};
		int[] p2 = {6,7,8,9,10};
		
		int[] p3 = Ints.concat(p1,p2);
		for(int i : p3) {
			System.out.println(i);
		}
		
		
	}

}
