import java.util.*;

public class me3 {
	private String input;
	private String[][] arr;
	private String[] actionRef;
	
	private Stack<Integer> s;
	
	public static void main(String[] arg){
		Main obj=new me3(arg);
		
	}
	
	public me3(String arr){
		this.input=arr[0];
		s=new Stack<Integer>();
		arr=new String[10][8];
		
		
		
	
	}
	
	private void createTable(){
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j]="err";
			
			}
		}
		arr[1][0]="S6";
		arr[2][0]="R2";
		arr[3][0]="R4";
		arr[4][0]="R6";
		arr[5][0]="R7";
		arr[7][0]="R3";
		arr[8][0]="R5";
		arr[9][0]="R2";
		
		arr[3][1]="S8";
		arr[4][1]="R6";
		arr[5][1]="R7";
		arr[8][1]="R5";
		
		arr[0][2]="S4";
		arr[2][2]="S4";
		arr[3][2]="R4";
		arr[4][2]="R6";
		arr[5][2]="R7";
		arr[6][2]="S4";
		arr[7][2]="R3";
		arr[8][2]="R5";
		arr[9][2]="S4";
		
		arr[0][3]="S5";
		arr[2][3]="S5";
		arr[3][3]="R4";
		arr[4][3]="R6";
		arr[5][3]="R7";
		arr[6][3]="S5";
		arr[7][3]="R3";
		arr[8][3]="R5";
		arr[9][3]="S5";
		
		arr[1][4]="accept";
		arr[2][4]="R2";
		arr[3][4]="R4";
		arr[4][4]="R6";
		arr[5][4]="R7";
		arr[7][4]="R3";
		arr[8][4]="R5";
		arr[9][4]="R2";
		
		arr[0][5]="1";
		
		arr[0][6]="2";
		arr[6][6]="2";
		
		arr[0][7]="3";
		arr[2][7]="7";
		arr[6][7]="3";
		arr[9][7]="7";
		
		
		actionRef = {
		"+","*","a","b","$","E","T","F"
		};
		
	
	
	
	}
	private void retrieveNextOne(){
		
		String tmp=
		while(tmp!=){
		
		}
	}
	private void PushToStack(){
	
	
	}
	


}