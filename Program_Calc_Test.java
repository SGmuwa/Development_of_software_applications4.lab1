public class Program_Calc_Test
{
	public static void main(String[] args) {Calc_Test.run(args);}
	
	public static class Calc_Test {
	
		public static void run(String[] args)
		{
			Calc exmpl = new Program_Calc_Test().new Calc(false);
			test_Add(exmpl);
			test_Sub(exmpl);
			test_Mul(exmpl);
			test_Div(exmpl);
			exmpl.SetDoubleIsEnabled(true);
			test_Add(exmpl);
			test_Sub(exmpl);
			test_Mul(exmpl);
			test_Div(exmpl);
		}
	
		public static void test_Add(Calc exmpl) {
			if(exmpl.DoubleIsEnabled())
				if(exmpl.addDouble(1.5, 2.5) == 4.0) System.out.println("addDouble: ok");
				else System.out.println("addDouble: failed");
			else
				if(exmpl.add(1, 2) == 3) System.out.println("add: ok");
				else System.out.println("add: Test failed");
		}
		
		public static void test_Sub(Calc exmpl){
			if (exmpl.DoubleIsEnabled())
				if(exmpl.subDouble(2.5, 1.5) == 1.0) System.out.println("subDuble: ok");
				else System.out.println("subDouble: failed");
			else 
				if(exmpl.sub(2, 1) == 1) System.out.println("sub: ok");
				else System.out.println("sub: Test failed");
		}
		
		public static void test_Mul(Calc exmpl) {
			if (exmpl.DoubleIsEnabled())
				if(exmpl.mulDouble(2.5, 5.0) == 12.5) System.out.println("mulDouble: ok");
				else System.out.println("mulDouble: failed");
			else 
				if(exmpl.mul(2, 1) == 2) System.out.println ("mul: ok");
				else System.out.println("mul: test failed");
			}
		
		public static void test_Div(Calc exmpl){
			if (exmpl.DoubleIsEnabled())
				if(exmpl.divDouble(8.2, 4.1) == 2.0) System.out.println("divDouble: ok");
				else System.out.println("divDouble: failed");
			else 
				if (exmpl.div(8, 2) == 4) System.out.println ("div: ok");
				else System.out.println ("div: test failed");
		}
		
		
	
		
	}
	
	private class Calc
	{
		
		Calc() { this(false); }
		Calc(boolean DoubleIsEnabled) { _doubleIsEnabled = false; }
	
		void SetDoubleIsEnabled(boolean value) { _doubleIsEnabled = value; }
	
		private boolean _doubleIsEnabled;
	
		boolean DoubleIsEnabled() { return _doubleIsEnabled; }
	
		public int add(int a, int b){ return a+b; }
		public double addDouble(double a, double b){ return _doubleIsEnabled ? a+b : Double.NaN; }
			
		public int sub(int a, int b){ return a-b; }
		public double subDouble(double a, double b){ return _doubleIsEnabled ? a-b : Double.NaN; }
			
		public int mul(int a, int b){ return a*b; }
		public double mulDouble(double a, double b){ return _doubleIsEnabled ? a*b : Double.NaN; }
			
		public int div(int a, int b) throws ArithmeticException { return a/b; }
		public double divDouble(double a, double b){ return _doubleIsEnabled ? a/b : Double.NaN; }
		
		
	}
	
}
