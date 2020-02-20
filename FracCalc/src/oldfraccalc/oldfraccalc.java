// Leo Yang
// Period 4

package oldfraccalc;
import java.util.Scanner;
public class oldfraccalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String eqaution = input.nextLine();
		if(eqaution.equals("quit")) {
			input.close();
		}
	}
	public static String produceAnqqoswer(String input)
	{
		String num1 = input.split(" ")[0];	
		String operation = input.split(" ")[1]; 
		String num2 = input.split(" ")[2];
		int num1whole = 0; 
		int num1num = 0;
		int num1denom = 0;
		if (num1.split("_").length == 2) {
			num1whole = Integer.parseInt(num1.split("_")[0]);
			num1num = Integer.parseInt(num1.split("_")[1].split("/")[0]);
			num1denom = Integer.parseInt(num1.split("_")[1].split("/")[1]);
		}
		else if (num1.split("_").length != 2 && num1.split("/").length == 2) {
			num1num = Integer.parseInt(num1.split("/")[0]);
			num1denom = Integer.parseInt(num1.split("/")[1]);
		}
		else {
			num1whole = Integer.parseInt(num1); 
			num1denom++;
		}
		int num2whole = 0;
		int num2num = 0;
		int num2denom = 0;
		if(num2.split("_").length == 2) {
			num2whole = Integer.parseInt(num2.split("_")[0]);
			num2num = Integer.parseInt(num2.split("_")[1].split("/")[0]);
			num2denom = Integer.parseInt(num2.split("_")[1].split("/")[1]);
		}
		else if(num2.split("_").length != 2 && num2.split("/").length == 2) {
			num2num = Integer.parseInt(num2.split("/")[0]);
			num2denom = Integer.parseInt(num2.split("/")[1]);
		}
		else {
			num2whole = Integer.parseInt(num2); 
			num2denom++;
		}
		if (num1.split("_").length == 2) {
			if (num1.indexOf("-") != -1) {
				num1whole = ((num1whole*num1denom)*-1 + num1num) * -1; 
			}
			else {
				num1whole = num1whole*num1denom + num1num;
			}
		}
		else if (num1.split("/").length == 2) {
			num1whole = num1num;
		}
		if (num2.split("_").length == 2) {
			if (num2.indexOf("-") != -1) {
				num2whole = ((num2whole*num2denom)*-1 + num2num) * -1;
			}
			else {
				num2whole = num2whole*num2denom + num2num; 
			}
		}
		else if (num2.split("/").length == 2) {
			num2whole = num2num;
		}
		int mathNum = 0;
		int mathDenom = 0;
		if (operation.equals("*")){
			mathNum = num1whole*num2whole;
			mathDenom = num1denom*num2denom;
		}
		else if (operation.equals("/")) {
			mathNum = num1whole*num2denom;
			mathDenom = num1denom*num2whole; 
		}
		else if (operation.equals("+")) {
			mathNum = ((num1whole*num2denom) + (num2whole*num1denom)); 
			mathDenom = num1denom*num2denom;
		}
		else if(operation.equals("-")) {
			mathNum = ((num1whole*num2denom) - (num2whole*num1denom)); 
			mathDenom = num1denom*num2denom;
		}
		int finalNum = Math.abs(mathNum);
		int finalDenom = Math.abs(mathDenom);
		String answer = "";
		if (finalNum == 0) {
			answer = Integer.toString(0);
		}
		else if ((finalNum/finalDenom) == finalNum || finalNum == finalDenom) { 
			answer = Integer.toString(mathNum/mathDenom);
		}
		else {
			int whole = 0;
			for (whole = 2; whole <= finalNum; whole++) {
				if (finalNum % whole == 0 && finalDenom % whole == 0) {
					finalNum /= whole;
					finalDenom /= whole;
					whole--;
				}
			}
				for(whole = 0; finalNum >= finalDenom; whole++) {
					finalNum -= finalDenom;
				}
				if (whole == 0) { 
					if (mathNum / mathDenom < 0) {
						answer = "-" + finalNum + "/" + finalDenom; 
					} else {
						answer = finalNum + "/" + finalDenom;
					}
				}
				else if (finalNum == 0) {
					if (mathNum / mathDenom < 0) {
						answer = "-" + whole;
					} else {
					answer = Integer.toString(whole);
				}
				}
				else {
					if(mathNum / mathDenom < 0) {
						answer = "-" + answer + whole + "_" + finalNum + "/" + finalDenom;
					} else {
					answer = whole + "_" + finalNum + "/" + finalDenom;
				}
				}
		}
		return answer;
}
}


