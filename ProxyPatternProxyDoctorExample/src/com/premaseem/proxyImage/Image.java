package com.premaseem.proxyImage;

public interface Image {
	int getWidht();

	int getHeight();

	void loadImage();
}

class ProxyImage implements Image {
	Image realImage = null;

	@Override
	public int getWidht() {
		if (realImage != null) {
			realImage.getWidht();
		}
		return 30;
	}

	@Override
	public int getHeight() {
		if (realImage != null) {
			realImage.getHeight();
		}
		return 50;
	}

	@Override
	public void loadImage() {
		System.out.println("Proxy instianciating real Image ... ");
		realImage = new RealImage();
		realImage.loadImage();
	}

}

class RealImage implements Image {

	@Override
	public int getWidht() {
		return 100;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public void loadImage() {
		System.out.println("Loading the real image ");
	}

}