package testing;
import java.util.*;

/*
 * Im creating the fibonacci sequence with linear time complexity
 */
public class fib {
	
	public static void main(String[] args) {
		
		int sLast=0;
		int last=1;
		int temp;
		int select;
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(sLast);
		array.add(last);
		
		
	System.out.println("How many fib do you want");
	Scanner input =new Scanner(System.in);
	select=input.nextInt(); // this will let me know how many to calculate
	
		
		while(select>=2) {
			temp=sLast+last;
			sLast=last;
			last=temp;
			// this center part has to do with saving previous numbers
			
			array.add(last);
			// end of saving
			select--;
		}
		System.out.print(array.toString());
		System.out.println("");
		// now to print out only the one requested you have to do length-1
		temp=array.size()-1;
		System.out.print(array.get(temp));
		
		}// end of main
	
	

}// end of class 
