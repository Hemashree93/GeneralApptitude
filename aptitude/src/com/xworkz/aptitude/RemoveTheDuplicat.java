package com.xworkz.aptitude;

public class RemoveTheDuplicat {
	public static void main(String a[]) {
		
		String name = "mandya";
		System.out.println(name);
		StringBuilder sb = new StringBuilder(name);

		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					sb.deleteCharAt(j);

				}
			}
		}
		System.out.println("After deletion :" + sb + "");

	}

}
