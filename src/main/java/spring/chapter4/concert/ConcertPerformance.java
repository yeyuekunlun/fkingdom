package spring.chapter4.concert;

import org.springframework.stereotype.Component;

@Component
public class ConcertPerformance implements Performance{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("�������֣���֮ɫ��");
	}

}
