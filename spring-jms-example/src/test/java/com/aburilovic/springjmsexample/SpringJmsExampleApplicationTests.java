package com.aburilovic.springjmsexample;

import static org.assertj.core.api.Assertions.assertThat;

import com.aburilovic.springjmsexample.jms.Receiver;
import com.aburilovic.springjmsexample.jms.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJmsExampleApplicationTests {

	@Autowired
	private Sender sender;

	@Autowired
	private Receiver receiver;

	@Test
	public void testReceive() throws Exception {
		sender.send("Hello Ante");
		Thread.sleep(1000);
		assertThat(receiver.getLatestMessage()).isEqualTo("Hello Ante");
	}
}

