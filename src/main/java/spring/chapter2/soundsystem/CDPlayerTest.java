package spring.chapter2.soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=CDPlayerConfig.class)
@ContextConfiguration(locations = {"classpath:spring1.xml" })
public class CDPlayerTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	CompactDisc cd;
	@Autowired
	CDPlayer player;
	@Test
	public void cdShuoldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void playerTest(){
		player.play();
		assertEquals("Playing Sgt pepper's lonely hearts club band by The Beatles\r\n",log.getLog());
	}

}
