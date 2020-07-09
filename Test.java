package com.bank;

public class Test {

	public static void main(String[] args) {
		String[] list1 = { "John", "Robert", "Ken" };
		String[] list2 = { "Shubhang", "Rabin", "Pabitra" };
		
		
		String someName;
		
		
		Names name = new Names();
		name.setNames(list1);
		
		tuna tuna = new tuna();
		
		tuna.setNameList(list2);
		tuna.setNames(name);


		someName = tuna.returnName("R");
		
		System.out.println(someName);

	}

}
