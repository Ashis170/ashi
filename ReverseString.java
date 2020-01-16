import java.util.Scanner;
public class StringTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		System.out.println("......................................................");
		String str = sc.nextLine();
		System.out.println("........................................................");
		
		reverseWord(str);
	}
	public static void reverseWord(String str)
	{
		String[] word = str.split(" ");
		String reverseText = "";
		
		for(int i=0 ; i<=word.length-1 ; i++)
		{
			String words = word[i];
		    
		    String  revword = "";
		for(int j=words.length()-1 ; j>=0 ; j--)
		{
		     revword = revword + words.charAt(j);
		}
		reverseText = reverseText + revword + " "; 
	}
		System.out.println("The Reverse String is :");
		System.out.println(".................................................................");
		System.out.println(reverseText);
}
}
