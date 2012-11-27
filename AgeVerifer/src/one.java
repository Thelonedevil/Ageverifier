import java.util.Scanner;
 class one {
	public static void main(String args[]) {
		System.out.println("Hello,");
		System.out.println("How old are you?");
		Scanner S=new Scanner(System.in);
		int age=S.nextInt();
		if(age >15 )
		{
		System.out.println("You can enter");
		System.out.println("PLease click the following link to enter");
		System.out.println("www.foobar.com");
		}
		else
		{
		System.out.println("You can't enter");
				}
	}
}
