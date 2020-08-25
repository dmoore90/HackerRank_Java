import java.util.*;

public class Skanner {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			l.add(scanner.nextInt());	
		}
		for (int i = 0 ; i < 3; i++) {
			System.out.println(l.get(i));
		}
	}
}