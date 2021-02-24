import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a string :");
		String str=input.nextLine();
		StringFunction STR=new StringFunction(str);
		if(STR.palamdrome()==1)
			System.out.println(str+" is Palamdrome" );
		else
			System.out.println(str+" is not Palamdrome" );	
	}
}
class StringFunction{
	String str;
	StringFunction(String str){
		this.str=str;
	}
	int palamdrome(){
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				return -1;
		}
		return 1;
	}
	
}
