package Fibanaccoie_pgm;

 class Fibanaccoie_number 
 {
   public static void main(String[] args) 
   {
	 int fib1=0;
	 int fib2=1;
	 int fib3;
	 
	 System.out.println(fib1+"  "+fib2);
	 
	 for(int i=1; i<=10; i++)
	 {
		fib3=fib1+fib2;
		System.out.println("The Fibanaccoie Number is:"+fib3);
		
		     fib1=fib2;
		     fib2=fib3;
	 }
   }
 }
