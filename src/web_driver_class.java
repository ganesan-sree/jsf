import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class web_driver_class {

	static Logger logger = Logger.getLogger("");
	static WebDriver driver = new FirefoxDriver();

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		logger.setLevel(Level.OFF);
		StringBuffer output = new StringBuffer();
		StringBuffer error = new StringBuffer();
		String url = null;
		String data = null;
		String basepath = "C:\\Users\\390607\\Desktop\\";

		do {			
			data = getDetails(driver, "http://www.phunwa.com/phone/44/26150476");
			if (data == null) {
				error.append(url);
				error.append("\n");
			} else {
				output.append(data);
			}

		} while (url != null);

	
		writeError(basepath, error.toString());
		writeOutput(basepath, output.toString());

		driver.close();
		System.out.println("Completed the Conversion !!!!!!");
	}

	private static String getDetails(WebDriver driver, String link) {

		try {
			driver.get(link);
			System.out.println(driver.getPageSource());
			String phoneno = driver.getTitle();
			
			
			String address = driver.findElement(By.className("address-tags")).getText();
			address = address.replaceAll("Follow @phunwa", "");
			address = address.replaceAll("(.*)Other Numbers:(.*)", "");
			address = address.replaceAll("(.*)Location:(.*)", "");
			address = address.trim();		
			StringBuffer out = new StringBuffer();
			out.append(address);
			out.append("\nPhone: " + phoneno);
			out.append("\n\n");
			return out.toString();

		} catch (Exception e) {
			return null;
		}

	}

	private static void writeOutput(String basepath, String output) {

		try {
			File fout = new File(basepath + "output.txt");
			FileWriter fw = new FileWriter(fout);
			fw.write(output);
			fw.flush();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void writeError(String basepath, String error) {

		try {
			File ferr = new File(basepath + "error.txt");

			FileWriter fwerr = new FileWriter(ferr);
			fwerr.write(error);
			fwerr.flush();
			fwerr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
