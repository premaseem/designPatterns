package com.premaseem.factorymethod2;

public abstract class Artist {

	abstract String getName();

	void doDanceing() {
		getDanceForm().perform();
	}

	void doSinging() {
		getSongForm().sing();
	}

	// This is factory method - the sub class will instance the dependencies which are encapsulated 
	abstract Song getSongForm();
	
	// This is factory method - the sub class will instance the dependencies which are encapsulated 
	abstract Dance getDanceForm();
}

class MaleArtist extends Artist{
	@Override
    String getName() {
	    return "Mr. Male";
    }

	@Override
    Song getSongForm() {
	    return new LowPichSong();
    }

	@Override
    Dance getDanceForm() {
	    return new BhandraDance();
    }
}

class FeMaleArtist extends Artist{
	@Override
    String getName() {
	    return "Miss. FeMale";
    }

	@Override
    Song getSongForm() {
	    return new HiPichSong();
    }

	@Override
    Dance getDanceForm() {
	    return new KatthakDance();
    }
}

interface Song {
	void sing();
}

class HiPichSong implements Song {
	@Override
	public void sing() {
		System.out.println("Girls like hi pich songs");
	}
}

class LowPichSong implements Song {
	@Override
	public void sing() {
		System.out.println("Boys like Low pich songs");
	}
}

interface Dance {
	void perform();
}

class BhandraDance implements Dance {
	@Override
	public void perform() {
		System.out.println("Macho dance for Boys - Balla Balla");
	}
}

class KatthakDance implements Dance {
	@Override
	public void perform() {
		System.out.println("Delicate dance for Girls - Tath ta Tath ta");
	}
}