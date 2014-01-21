
public class MyClass{

	public static void main(String args[]){
		
		if (args.length != 1){
			System.out.println("Usage: java MyClass <name>");
			System.exit(1);
		}
		
		String name = args[0];
		
		System.out.println("Hello " + name);

	}
}
