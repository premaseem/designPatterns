package com.premaseem.proxyImage;


public class ClientForProxyImage {

	public static void main(String[] args) {

		System.out.println("Proxy images is loaded first and then real image replaces it ");
		Image image = new ProxyImage();
		System.out.println(image.getHeight());
		System.out.println(image.getWidht());
		image.loadImage();

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}
