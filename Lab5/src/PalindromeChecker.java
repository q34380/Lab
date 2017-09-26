import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {


    public static void main(String[] args){
	 
	Scanner s = new Scanner(System.in);
	System.out.print("Enter your sentence");
	String b = s.nextLine();
	if (!b.equals("")){
	    if (isaPalindrome(b)) {
		System.out.println(b+ " is a palindrome");}
	    else {
		System.out.println(b+ " is not a palindrome");
	   
	}
    }}

    public static boolean isaPalindrome(String b){
    	Stack stack = new Stack();
    	for(int i=0; i<b.length(); i++){
    		stack.push(b.charAt(i));
    	}
    	String a = "";
    	while(!stack.isEmpty()){
    		a += stack.pop();
    	}if(b.compareTo(a) == 0) {
    		return true;}
    	else {
    		return false;}
    }

}
