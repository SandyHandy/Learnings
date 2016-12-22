package com.ch01.knights;

public class BraveKnight implements Knight {

	private Quest quest;
	
	public BraveKnight(Quest quest){
		this.quest=quest;
	}
	
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();
	}

}
