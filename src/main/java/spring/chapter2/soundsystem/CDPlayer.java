package spring.chapter2.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{

	private CompactDisc cd;
	@Autowired
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		cd.play();
	}
	
	public CDPlayer(CompactDisc cd) {
		// TODO Auto-generated constructor stub
		this.cd = cd;
	}
	
	public CDPlayer(){
		
	}

}
