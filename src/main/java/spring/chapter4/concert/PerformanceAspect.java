package spring.chapter4.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PerformanceAspect {
	@Pointcut("execution(** spring.chapter4.concert.Performance.perform(..))")
	public void perform(){};
	@Before(value = "perform()")
	public void beforePerformance(){
		System.out.println("关闭手机");
	}
	
	@Before("execution(** spring.chapter4.concert.Appointment.doAppointment(..))")
	public void doAppointment(){
		System.out.println("梳妆打扮");
	}
	
	@DeclareParents(value="spring.chapter4.concert.Performance+",defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
	
}
