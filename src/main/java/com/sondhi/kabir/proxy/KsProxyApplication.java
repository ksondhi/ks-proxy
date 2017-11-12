package com.sondhi.kabir.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class KsProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(KsProxyApplication.class, args);
	}
}
