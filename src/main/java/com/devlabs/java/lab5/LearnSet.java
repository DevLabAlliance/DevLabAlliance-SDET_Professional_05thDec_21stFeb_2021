package com.devlabs.java.lab5;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class LearnSet {
public static void main(String[] args) {
	Set<String> set = new LinkedHashSet<String>();
	set.add("Elvis");
	set.add("D Singh");
	set.add("Anandhu");
	set.add("Karthik");
	set.add("Sheena");
	set.add("Anandhu");
	System.out.println(set);
	for (String eachName : set) {
		System.out.println(eachName);
	}
	List<String> list = new ArrayList<>();
	list.addAll(set);
}
}
