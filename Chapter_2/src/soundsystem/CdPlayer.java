package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer implements MediaPlayer {

	private CompactDisc compactDisc;
	
	@Autowired
	// the auto wired can be added to the setter or any method
	//@Autowired(required=false)
	public CdPlayer(CompactDisc compactDisc) {
		this.compactDisc=compactDisc;
	}

	public void play() {
		compactDisc.play();

	}

}
