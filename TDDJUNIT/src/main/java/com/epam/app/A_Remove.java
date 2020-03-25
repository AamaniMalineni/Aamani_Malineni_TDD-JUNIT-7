package com.epam.app;

public class A_Remove {
	public static String remove_A(String string){
	if(string.length()>0) {
		String str = string;
		String s = "";
		if(str.charAt(0)=='A') {
			s = str.replaceFirst("A","");
			if(s.charAt(0)=='A') {
				 s = s.replaceFirst("A","");
			}
		}
		else if(str.charAt(1)=='A') {
			s = str.replaceFirst("A","");
		}
		if(s.length()>0) {
			return s;
		}
		return str;
	}
	else {
		return "";
	}
	}
}
