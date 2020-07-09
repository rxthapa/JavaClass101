package com.bank;

public class tuna {
	private int attribute;
	private int attribute2;
	private int attribute3;
	private Names Names;
	private String[] nameList;

	public String[] getAllNames() {
		return nameList;
	}

	public void setNameList(String[] allNames) {
		this.nameList = allNames;
	}

	public Names getNames() {
		return Names;
	}

	public void setNames(Names names) {
		Names = names;
	}

	public void simpleMessage() {
		System.out.println("Hello from simpleMessage method"); // something work
	}

	public int simpleMessage2() {
		System.out.println("Hello from simpleMessage2 method"); // something work
		return 10;
	}

	public void simpleMessage3() {
		simpleMessage();
	}

	public int simpleMessage4() {
		return simpleMessage2();
	}

	public int getAttribute() {
		return attribute;
	}

	public void setAttribute(int value) {
		attribute = value;
	}

	public int simpleMessage5(String name) {
		System.out.println("hello from " + name);
		if (name.equals("roshan")) {
			return 100 + attribute;
		} else
			return 50 + attribute;
	}

	public int simpleMessage5(String name, String name2) {
		if (name.equals("roshan")) {
			return 100;
		} else
			return 50;
	}

	public int wordCount(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;

			}
		}
		return count + 1;

	}

	public void add(int a) {
		attribute = attribute + a;
	}

	public void printNameWith(String name) {

		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].startsWith(name))
				System.out.println(nameList[i]);

		}

	}

	public String returnNamewith(String name) {
		String[] arrays = Names.getAllnames();
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i].startsWith(name)) {
				return arrays[i];
			}

		}
		return null;
	}
	
	
	public String returnName(String name) {
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].startsWith(name)) {
				return nameList[i];
			}

		}
		return null;
	}

}
