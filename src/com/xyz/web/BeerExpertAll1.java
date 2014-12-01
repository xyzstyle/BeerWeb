package com.xyz.web;

import java.util.*;

public class BeerExpertAll1 {

	public List<String> getBrands(BeerBean beerBean) {

		List<String> brands = new ArrayList<String>();
		if (beerBean.getColor().equals("amber")
				&& beerBean.getPrice().equals("medium")) {
			brands.add("Jack Amber");

		} else {
			if (beerBean.getColor().equals("amber")
					&& beerBean.getPrice().equals("expensive")) {
				brands.add("expensive Red Moose");
			} else {
				brands.add("Jail Pale Ale");
				brands.add("Gout Stout");
			}
		}
		return brands;
	}
}
