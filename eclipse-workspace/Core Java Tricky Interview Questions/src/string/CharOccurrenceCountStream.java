package string;

public class CharOccurrenceCountStream {

	public static void main(String[] args) {


		String str = "Testing solutions";
		
//		long count = str
//						.chars()
//							.filter(e -> (char)e == 's' || (char)e == 'i')
//								.count();
		
		//System.out.println(count);
		System.out.println(getCharCouont(str, 'T'));

	}
	
	public static long getCharCouont(String str, char c) {
		
		return str.chars().filter(e -> (char)e == c).count();
		
	}

}
