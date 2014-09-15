package com.premaseem.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	
protected	String name, description;
protected	Integer cost;
protected	Boolean isVegetarian;
protected	List<MenuComponent> subMenu;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Boolean getIsVegetarian() {
		return isVegetarian;
	}
	public void setIsVegetarian(Boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	public List<MenuComponent> getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(List<MenuComponent> subMenu) {
		this.subMenu = subMenu;
	}
	
	public void addChild(MenuComponent comp){
		subMenu.add(comp);
	}
	public void printMenuTree(){
		System.out.println((isVegetarian!= null ? "--------- Leaf iteam name is "+ name : " # Menu master name is " + name ));
		
		for(MenuComponent cmp : subMenu){
			cmp.printMenuTree();
		}
	}
}


class MenuItem extends MenuComponent{
	
	public MenuItem(String name, String desc, boolean isVeg){
		setName(name);
		setDescription(desc);
		setIsVegetarian(isVeg);
		setSubMenu(new ArrayList<MenuComponent>());
	}
}

class Menu extends MenuComponent{
	
	public Menu(String name, String desc){
		setName(name);
		setDescription(desc);
		setIsVegetarian(null);
		setSubMenu(new ArrayList<MenuComponent>());
	}
	
}