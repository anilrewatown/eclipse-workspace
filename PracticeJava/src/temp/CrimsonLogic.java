package temp;

public class CrimsonLogic {
	
	public static void main(String[] args) {
		
		
	//	A
	//	BB
	//	CCC
	//	DDDD
	//	EEEEE
		
 //   write a program to print above pattern.

		
		String alphabet = "A B C D E F G H I J K L M N O P Q R S T U V X Y Z";
		
		
		char[] ch = alphabet.toCharArray();
		
		int len = ch.length;
		
		for(int i=0; i<len; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}
		
	}

}
