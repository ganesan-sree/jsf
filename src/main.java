import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;


public class main {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("welcome !!!!!!!!!!!!!!!!!!!!!");
		
		InetAddress address = InetAddress.getByName(("www.google.com"));
		  
		    if (address.isReachable(2000))
		      System.out.printf("%s is reachable%n", address);
		    else
		      System.out.printf("%s could not be contacted%n", address);
		  
		
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("ping google.com");
		p.waitFor();
		System.out.println(p.getInputStream().available());
		
		BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = "";

		while ((line = b.readLine()) != null) {
		  System.out.println(line);
		}
	}

	static int r=5;
	static {
		System.out.println(r);
		System.out.println("33333");
	}
	
	
	
}
