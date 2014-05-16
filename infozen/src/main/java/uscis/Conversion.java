public class Conversion{
	
	public static void main(String[] args){
		
	}

	public static double celsius(double f){
		return (f - 32) * 5.0/9.0;
	}

	public static double fahrenheit(double c){
		return c * 9.0/5.0 + 32;
	}
}
