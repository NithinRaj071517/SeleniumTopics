package week1.day2;

import java.util.Arrays;


public class LearnArrays {

	public static void main(String[] args) {
		
		String[] names ={"nk","the","got","fish","prt"};
		System.out.println(names[3]);
		System.out.println(names.length);
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		int[] empID= new int[5];
		empID[0]=23;
		empID[1]=25;
		empID[2]=35;
		empID[3]=39;
		Arrays.sort(empID);
		for(int i=0;i<empID.length;i++)
		{
			System.out.println(empID[i]);
		}
	}
}
