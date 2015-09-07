package bailei.study.gl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:SpringJms.xml");
		SpringPublisher publisher = (SpringPublisher) context
				.getBean("springPublisher");
		
		publisher.start(); 
	}
}
