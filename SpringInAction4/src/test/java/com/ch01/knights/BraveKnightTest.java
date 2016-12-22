package com.ch01.knights;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class BraveKnightTest {
	
	@Test
	public void knighShouldEmbarkOnQuest(){
		
		Quest mockQuest = mock(Quest.class);
		BraveKnight braveKnight = new BraveKnight(mockQuest);
		braveKnight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
		
	}

}
