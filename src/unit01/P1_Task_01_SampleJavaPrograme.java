package unit01;
import java.util.Scanner ;

class P1_Task_01_SampleJavaPrograme {
	
	public static void main(String[] args) // here static we have use to call it without invoking 
    {
		Scanner sc = new Scanner(System.in);
		boolean check = sc.hasNextInt();
		System.out.println(check);   
    }
}