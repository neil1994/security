package ele_cloud.security;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecurityProvider {
	
	
	public static void main(String[] args) {
	
    com.alibaba.dubbo.container.Main.main(args);

    System.out.println("this is security service providing test");
	}
}
