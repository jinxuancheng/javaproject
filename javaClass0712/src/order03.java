import java.io.BufferedReader;
import java.io.FileReader;

public class order03 {
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("c:/test/order.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		String str = null;
		while((str = bReader.readLine())!=null) {
			System.out.println(str);
		}
		bReader.close();
		fReader.close();
	}

}