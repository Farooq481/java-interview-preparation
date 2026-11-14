package week01_javabasics;

public class SwapNumbers {
	
	public static void main(String[]args)
	{
	
	int a=10, b=20;
	
	// Swap with Extra variable 
	
	int temp =a;
	a = b;
	b =temp;
	
	System.out.println(" Swap with Extra variable  a = " + a + ", b = " + b);
	
	// Swap with Arithmetic, 
	
	a= a+b;  // 20+10 // since above swap change values of a and b
	b = a-b;  // 30-10 =20
	
	a = a-b;  // 30-20 =10
	
	System.out.println(" Swap with Arithmetic  a = " + a + ", b = " + b);
	
	// Swap with XOR
	
	a^=b;
	b^=a;
	a^=b;
	
	System.out.println(" Swap with XOR  a = " + a + ", b = " + b);
	}

}
