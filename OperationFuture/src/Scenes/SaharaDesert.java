package Scenes;

import Map.Map;
import Map.State;
import UI.UI;

public class SaharaDesert extends Location implements State{
	
	UI ui = new UI();

	@Override
	public void prev(Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next(Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStatus() {
		ui.println("you are now at the desert");
		
	}

}
