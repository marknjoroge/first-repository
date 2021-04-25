import java.util.Scanner;
public class Compounder {
	public static void main (String [] args){
		
		int chickNo;
		int months;
		int profit = 0;
		int accProf = 0;
		int rem = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("no of chicks: ");
		chickNo = in.nextInt();
		System.out.print("No of months: ");
		months = in.nextInt();
		System.out.println("Month \t\t Chicks \t\t profit \t\t accProfit");
		
		for(int mths = 0;mths <= months; mths++) {

			System.out.println(mths + "\t\t\t" + chickNo + "\t\t\t" + profit + "\t\t\t" + accProf +"\t\t" + rem);
			profit = 0;
			profit += chickNo * 250;
			
			if(rem%2 == 0 && rem != 0){
				chickNo++;
				rem = 0;
			}
			chickNo += profit/600; 
			if(profit%600 != 0) rem++;
			
		}
		
	}
}
