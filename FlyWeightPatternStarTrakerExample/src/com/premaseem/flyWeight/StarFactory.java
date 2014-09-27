package com.premaseem.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class StarFactory {

	Map<String, Star> starStock = new HashMap<String, Star>();

	Star getStar(String name) {
		return (starStock.get(name) == null ? getNewStar(name) : starStock.get(name));

	}

	Star getNewStar(String name) {
		Star star = null;
		if(name.equalsIgnoreCase("SuperNoveStar")){
		 star = new SuperNoveStar(name);
		}else if(name.equalsIgnoreCase("PoleStar")){
			 star = new PoleStar(name);
			}else if(name.equalsIgnoreCase("DraughStar")){
				 star = new DraughStar(name);
			}
			
		starStock.put(name, star);
		return star;
	}

}
