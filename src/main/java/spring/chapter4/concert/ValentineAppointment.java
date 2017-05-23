package spring.chapter4.concert;

import org.springframework.stereotype.Component;

@Component
public class ValentineAppointment implements Appointment{

	@Override
	public void doAppointment() {
		// TODO Auto-generated method stub
		System.out.println("情人节约会");
	}

}
