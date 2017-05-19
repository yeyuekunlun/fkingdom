package spring.chapter2.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

	private String title = "Sgt pepper's lonely hearts club band";
	private String artist = "The Beatles";
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+ title + " by " + artist);
	}

}
