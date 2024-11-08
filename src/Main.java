import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		String wildcard = sc.nextLine();
		
		for (int i=0;i<wildcard.length();i++) {
			char c = wildcard.charAt(i);
			if (c=='*')
				continue;
			
			int idx = original.indexOf(c);
			if (idx < 0) {
				// cannot find c
				System.out.println("N");
				return;
			}
			
			original = original.substring(0,idx) + original.substring(idx+1);
			
		}
		
		System.out.println("A");

	}

}
