package com.example.eurekaserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaServerApplicationTests {

	@Test
	public void contextLoads() throws Exception {

		try{
			throw new Exception("1");
		}catch (IOException e){
			throw new Exception("2");
		}catch (Exception e) {
			throw new Exception("3");
		}finally {
			throw new Exception("4");
		}
	}

}
