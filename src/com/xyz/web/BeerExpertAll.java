package com.xyz.web;

import java.util.*;

public class BeerExpertAll {

	public List<String> getBrands(String color,String price) {

		List<String> brands = new ArrayList<String>();
		if (color.equals("amber")
				&& price.equals("medium")) {
			brands.add("Jack Amber");

		} else {
			if (color.equals("amber")
					&& price.equals("expensive")) {
				brands.add("expensive Red Moose");
			} else {
				brands.add("Jail Pale Ale");
				brands.add("Gout Stout");
			}
		}
		return brands;
	}
}
