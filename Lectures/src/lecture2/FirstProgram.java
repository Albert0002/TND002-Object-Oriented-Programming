package lecture2;

public class FirstProgram {

	public static void main(String[] args) {
		String arg = "Hello";
		System.out.println(arg);
		arg = "Hello World";
		System.out.println(arg);
		
		String s = null;
		System.out.println(s);

		String s = "-Hello World";
		System.out.println(s);
	}
	
	public static String consoleOutput(String arg) {
		System.out.println(arg);
		return arg;
	}
	
	public static void consoleOutput(int arg) {
		System.out.println(arg);
	}
	
}
