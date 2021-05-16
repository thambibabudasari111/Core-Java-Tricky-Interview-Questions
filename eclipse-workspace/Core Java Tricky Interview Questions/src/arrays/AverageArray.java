package arrays;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;

public class AverageArray {
	
	/**
	 * Calculate average array using:
	 * simple loop,
	 * Java 8 
	 * Google Guava library
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,6,7,8,9,10,6,8,3,6,8,7};
		
		double total = 0;
		for(double e : num) {
			total = total+e;
		}

		System.out.println("Total is: "+total);
		System.out.println("Average is: "+(total/num.length));
		
		
		//Java 8:
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());
		
		//Google Guava;
		double avg1 = DoubleMath.mean(num);
		System.out.println(avg1);
	}

}
