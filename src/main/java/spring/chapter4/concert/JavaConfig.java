package spring.chapter4.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses={JavaConfig.class})
public class JavaConfig {
	@Bean
	public PerformanceAspect performanceAspect(){
		return new PerformanceAspect();
	}
}
