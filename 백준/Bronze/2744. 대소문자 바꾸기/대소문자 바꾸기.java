import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		char[] newWord = new char[word.length()];
		
		for(int i=0; i< newWord.length; i++) {
			newWord[i] = word.charAt(i);
			if(newWord[i] >= 'A' && newWord[i] <= 'Z') newWord[i] += 0x20;
			else if(newWord[i] >= 'a' && newWord[i] <= 'z') newWord[i] -= 0x20;
		}
		for(int i=0; i< newWord.length; i++) {
			System.out.printf("%c", newWord[i]);
		}
	}
}