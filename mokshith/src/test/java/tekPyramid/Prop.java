package tekPyramid;

import java.io.FileInputStream;
import java.util.Properties;

public class Prop {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("‪‪‪‪‪.\\src\\test\\resources\\commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.get("Browser"));
	}

}
