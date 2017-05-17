package com.prady.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


@SpringBootApplication
@EnableBinding(Sink.class)
//@EnableRxJavaProcessor
public class StreamConsumerApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(StreamConsumerApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(StreamConsumerApplication.class, args);
	}
	
	@StreamListener(Sink.INPUT)
	public void loggerSink(String messgae) {
		log.info("Received: " + messgae);
	}
	
	
}
