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
//		m1.ordermenu = "������˿";
//		m1.price = 15;
//		m1.count = 1;
//		m2.ordermenu = "�׷�";
//		m2.price = 2;
//		m2.count = 1;
//		m3.ordermenu = "�������";
//		m3.price = 25;
//		m3.count = 1;
//		m4.ordermenu = "����";
//		m4.price = 15;
//		m4.count = 1;
//		m5.ordermenu = "������";
//		m5.price = 20;
//		m5.count = 1;
//		System.out.println("m1����"+m1.ordermenu+"");//�۸�Ϊ:"+m1.price+"����:"+m1.count);
//		System.out.println("m2����"+m2.ordermenu+"");//�۸�Ϊ:"+m2.price+"����:"+m2.count);
//		System.out.println("m3����"+m3.ordermenu+"");//�۸�Ϊ:"+m3.price+"����:"+m3.count);
//		System.out.println("m4����"+m4.ordermenu+"");//�۸�Ϊ:"+m4.price+"����:"+m4.count);
//		System.out.println("m5����"+m5.ordermenu+"");//�۸�Ϊ:"+m5.price+"����:"+m5.count);
		

	}
}