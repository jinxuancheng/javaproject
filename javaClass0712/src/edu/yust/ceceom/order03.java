package edu.yust.ceceom;

import java.io.BufferedReader;
import java.io.FileReader;

public class order03 {
	int price;
	int count;
	String ordermenu;
	public static void main(String[] args)throws Exception {
		FileReader fReader = new FileReader("C:/test/test.xlsx");
		BufferedReader bReader = new BufferedReader(fReader);
		String str = null;
		while((str = bReader.readLine())!=null) {
			System.out.println(str.split(",")[1]);
		}
		bReader.close();
		fReader.close();
		//String[] a = str.split(",");
//	public static void main(String[] args) {
//		order03 m1 = new order03();
//		order03 m2 = new order03();
//		order03 m3 = new order03();
//		order03 m4 = new order03();
//		order03 m5 = new order03();
//		m1.ordermenu = "香辣肉丝";
//		m1.price = 15;
//		m1.count = 1;
//		m2.ordermenu = "米饭";
//		m2.price = 2;
//		m2.count = 1;
//		m3.ordermenu = "麻辣香锅";
//		m3.price = 25;
//		m3.count = 1;
//		m4.ordermenu = "米线";
//		m4.price = 15;
//		m4.count = 1;
//		m5.ordermenu = "麻辣烫";
//		m5.price = 20;
//		m5.count = 1;
//		System.out.println("m1点了"+m1.ordermenu+"");//价格为:"+m1.price+"份数:"+m1.count);
//		System.out.println("m2点了"+m2.ordermenu+"");//价格为:"+m2.price+"份数:"+m2.count);
//		System.out.println("m3点了"+m3.ordermenu+"");//价格为:"+m3.price+"份数:"+m3.count);
//		System.out.println("m4点了"+m4.ordermenu+"");//价格为:"+m4.price+"份数:"+m4.count);
//		System.out.println("m5点了"+m5.ordermenu+"");//价格为:"+m5.price+"份数:"+m5.count);
		

	}
}