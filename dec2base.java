//NAME: ELIE ELIA
//STUDENTID: 260759306
import acm.program.ConsoleProgram;
public class dec2base extends ConsoleProgram{

	private String dec2B (int a, int base) {
		//the function needs to take these two integers as inputs
		String LUT = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		int q = a;
		//q is the variable to store the number to convert
		int r;
		//stores value of remainder
		String s = "";
		while(q!=0)
		//as long as input number is not 0, the while loop will run
		{
			r=q%base;
			//r is the value of the remainder
			q=q/base;
			//after storing remainder, number is divided by base to find next remainder
			s = s+LUT.charAt(r); ;
			//charAt function looks up character stored at corresponding index position
		}
		System.out.println("s="+s);
		String newS ="";

		for (int i= s.length()-1; i>=0 ; i--) {
			newS= newS + s.charAt(i);
			//result should be in reverse order, for loop applies this
		}
		System.out.println("newS = "+newS);
		return newS;
	}
	public void run()
	{
		println("Java Base Conversion");
		while(true) {
			int num = readInt("Enter number to be converted:");
			//user input
			if (num<0) break;
			//all input numbers should be positive
			int base= readInt("Enter base to convert to:");
			//user input
			String output = dec2B(num,base);
			println(""+num+" is represented in Base-"+base+" as: "+output);
			//output for user to see
		}
	}
}

