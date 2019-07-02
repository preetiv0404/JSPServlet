package com.preeti.corejava;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationPractice {

	public static void main(String[] args) {
		
		
String lan="en";
String country="US";
String lanhi="hi";
String countryIN="IN";

Locale l=new Locale(lan, country);
Locale l2=new Locale(lanhi, countryIN);
ResourceBundle r= ResourceBundle.getBundle("com.preeti.corejava.Bundle", l);
ResourceBundle r2= ResourceBundle.getBundle("com.preeti.corejava.Bundle", l2);
String str=r.getString("wish");
String str2=r2.getString("wish");
System.out.println(str);
System.out.println(str2);
	}

}
