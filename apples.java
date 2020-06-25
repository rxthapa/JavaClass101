package com.bank;

public class apples {

	public static void main(String[] args) {
		int ss = 100;

		tuna object = new tuna();
		object.setAttribute(100);// creating a object of the class
		System.out.println(object.getAttribute());

		tuna object88 = new tuna();
		object88.setAttribute(200);
		System.out.println(object88.getAttribute());

		tuna object99 = new tuna();
		tuna object77 = new tuna();
		object77.setAttribute(400);

		int a = object.simpleMessage5("thapa");

		int b = object88.simpleMessage5("thapa");

		int c = object99.simpleMessage5("thapa");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(object99.getAttribute());

		object.add(20);
		System.out.println(object.getAttribute());
	}

}
