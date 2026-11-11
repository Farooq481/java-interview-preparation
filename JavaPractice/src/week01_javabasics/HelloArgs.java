package week01_javabasics;

public class HelloArgs {
	
	public static void main(String[]args)
	{
		System.out.println("Hello JAVA");
		
		if(args.length==0)
		{
			System.out.println("No command line arguments");
		}
		for(int i=0;i<args.length;i++)
		{
			System.out.println("args [" + i + "] = " + args[i]);
		}
	}
	

}
