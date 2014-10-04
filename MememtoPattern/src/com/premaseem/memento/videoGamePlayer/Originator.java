package com.premaseem.memento.videoGamePlayer;

public class Originator {
	GamePlayer player;

	Memento saveMemento(GamePlayer player){
		GamePlayer playerSnapShot = createPlayerSnapshot(player);
		Memento memento = new Memento(playerSnapShot);
		return memento;
	}

	private GamePlayer createPlayerSnapshot(GamePlayer player) {
		// TODO - try cloning here 
		GamePlayer playerSnapShot=null;
		try {
			playerSnapShot = (GamePlayer) player.clone();
        } catch (CloneNotSupportedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
		
		return playerSnapShot;
//	    GamePlayer playerSnapShot = new GamePlayer();
//	    playerSnapShot.setMaskPicked(player.getMaskPicked());
//	    playerSnapShot.setLevel(player.getLevel());
//	    playerSnapShot.setTotalPoints(player.getTotalPoints());
//	    playerSnapShot.setPlayerName(player.getPlayerName());
//	    return playerSnapShot;
    }
	
	 void restorePlayerSnapshot(GamePlayer playerSnapShot,GamePlayer player) {
		// TODO - try cloning here 
	    playerSnapShot.setMaskPicked(player.getMaskPicked());
	    playerSnapShot.setLevel(player.getLevel());
	    playerSnapShot.setTotalPoints(player.getTotalPoints());
	    playerSnapShot.setPlayerName(player.getPlayerName());
    }
	
	
}