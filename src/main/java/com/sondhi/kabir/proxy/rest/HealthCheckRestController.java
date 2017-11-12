package com.sondhi.kabir.proxy.rest;

import org.apache.catalina.connector.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheckRestController {

	@RequestMapping(value="/health", method=RequestMethod.GET)
	public ResponseEntity<String> healthCheck() {
		return new ResponseEntity<>("healthy", HttpStatus.OK);
	}
}
