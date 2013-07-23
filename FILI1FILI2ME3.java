import java.util.*;
import javax.swing.*;

public class FILI1FILI2ME3 {
	private String input;
	private String[][] table;
	private List<Character> actionRef;
	private Stack<Integer> stack;
	
	public static void main(String[] args) {
		new FILI1FILI2ME3(args);
	}
	
	public FILI1FILI2ME3(String[] args) {
		if (args.length < 2) {
			input = JOptionPane.showInputDialog("Enter the sentence: ");
			input = input.replace(" ", "");
		}
		else
			input = join(args);
		stack = new Stack<Integer>();
		actionRef = Arrays.asList('+', '*', 'a','b','$','E','T','F');
		
		initTable();
		parse();
	}
	
	private String join(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < args.length; i++)
			sb.append(args[i]);
		return sb.toString();
	}
	
	private void initTable() {
		table = new String[10][8];
		for (int i = 0; i < table.length; i++)
			for (int j = 0; j < table[i].length; j++)
				table[i][j] = "error";
		
		table[1][0] = "S6";
		table[2][0] = "R2";
		table[3][0] = "R4";
		table[4][0] = "R6";
		table[5][0] = "R7";
		table[7][0] = "R3";
		table[8][0] = "R5";
		table[9][0] = "R2";
		
		table[3][1] = "S8";
		table[4][1] = "R6";
		table[5][1] = "R7";
		table[8][1] = "R5";
		
		table[0][2] = "S4";
		table[2][2] = "S4";
		table[3][2] = "R4";
		table[4][2] = "R6";
		table[5][2] = "R7";
		table[6][2] = "S4";
		table[7][2] = "R3";
		table[8][2] = "R5";
		table[9][2] = "S4";
		
		table[0][3] = "S5";
		table[2][3] = "S5";
		table[3][3] = "R4";
		table[4][3] = "R6";
		table[5][3] = "R7";
		table[6][3] = "S5";
		table[7][3] = "R3";
		table[8][3] = "R5";
		table[9][3] = "S5";
		
		table[1][4] = "accept";
		table[2][4] = "R2";
		table[3][4] = "R4";
		table[4][4] = "R6";
		table[5][4] = "R7";
		table[7][4] = "R3";
		table[8][4] = "R5";
		table[9][4] = "R2";
		
		table[0][5] = "1";
		
		table[0][6] = "2";
		table[6][6] = "2";
		
		table[0][7] = "3";
		table[2][7] = "7";
		table[6][7] = "3";
		table[9][7] = "7";
	}
	
	private int code(int index) {
		char token = input.charAt(index);
		return actionRef.indexOf(token);
	}
	
	private void parse() {
		int currentState;
		String action;
		int inputIndex = 0;
		
		stack.push(0);
		while(!stack.isEmpty() && inputIndex <= input.length()) {
			currentState = stack.peek();
			action = table[currentState][code(inputIndex)];  
			if (action.startsWith("S")) { // shift
				inputIndex++;
				stack.push(Integer.parseInt(action.substring(1)));
			} else if (action.startsWith("R")) { // reduce
				stack.pop();
			} else if (action.equals("error")) {
				System.out.println("Not accepted");
				System.exit(0);
			} else if (action.equals("accept")) {
				System.out.println("Accepted");
			} else { // goto integer
			}
		}
	}
}