package spring.chapter2.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class CDPlayerConfig {

	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
	@Bean
	public MediaPlayer cdPlayer(CompactDisc sgtPeppers){
		return new CDPlayer(sgtPeppers);
	}
}
