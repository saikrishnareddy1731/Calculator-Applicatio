package io.calci;

public class ConsoleInput {
	 public static int getInt() {
			String objstr=getString();
			int num1=Integer.parseInt(objstr);
			return num1;
			//or
			//return Integer.parseInt(getString);
		}

	 	public static String getString() {
	 		try
	 		{
	 			byte input[]=new byte[100];
	 			int len=System.in.read(input);
	 			byte arrfinal[]=new byte[len-2];//because it will store extra \nr in it
	 			System.arraycopy(input, 0, arrfinal, 0, len-2);
	 			String objStr=new String(arrfinal);
	 			return objStr;
	 			
	 		}
	 		catch(Exception e)
	 		{
	 			System.out.println(e);
	 			
	 		}
	 		return null;
	 	}

		public static float getFlost() {
			// TODO Auto-generated method stub
			return Float.parseFloat(getString());
		}
		public static char getChar() {
			// TODO Auto-generated method stub
			return getString().charAt(0);
		}
		public static long getLong() {
			// TODO Auto-generated method stub
			return Long.parseLong(getString());
		}
		public static double getDouble() {
			// TODO Auto-generated method stub
			return Double.parseDouble(getString());
		}
		
}
