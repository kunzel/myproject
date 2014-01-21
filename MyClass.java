import java.io.*;

public class MyClass{

	public static void main(String args[]){
		
		System.out.println("Hello, enter your name:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		try {
             		name = br.readLine();
      		} catch (IOException ioe) {
         		System.out.println("IO error trying to read your name!");
         		System.exit(1);
     		}
		System.out.println("Hello " + name);

	}
}
