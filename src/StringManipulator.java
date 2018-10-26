import java.util.Scanner;

/**
 * 
 * @author Hady Diab, String Manipulator
 *
 *
 */
public class StringManipulator 
{

	public static void main(String[] args)
	{
		Scanner Yeet=new Scanner(System.in);
		System.out.println("Hi User, enter in any word:");
		String word=Yeet.nextLine();
		int wordLength=word.length();
		System.out.println("The length of "+word+" is "+wordLength+".");
		String firstletter= word.substring(0,1);
		String lastindex = word;
		char lastletter=lastindex.charAt(wordLength-1);
		System.out.println("The first letter of the word is "+firstletter+" and the last letter of the word is "+lastletter);
		int half=wordLength/2;
		String halfstring=word.substring(0, half);
		System.out.println("The first half of the string is "+halfstring+".");
		System.out.println("Enter in a character to search for:");
		String character=Yeet.nextLine();
		int characterLength=character.length();
		
		int index= word.indexOf(character);
		
		System.out.println("The index where the character can be found is: "+index);
		System.out.println("Enter a start index:");
		String start=Yeet.nextLine();
		System.out.println("Enter a stop index:");
		String stop=Yeet.nextLine();
		int start1=Integer.parseInt(start);
		int stop1=Integer.parseInt(stop);
		
		String usersubstring=word.substring(start1, stop1);
		
		System.out.println("The substring you identified was: "+usersubstring);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		

	
	}


}
