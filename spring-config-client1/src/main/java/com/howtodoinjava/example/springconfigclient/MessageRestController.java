package com.howtodoinjava.example.springconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {
	@Autowired
	DepRepo empRepo;
	@Value("${msg:Config Server is not working. Please check...}")
	private String msg;

	@GetMapping("/msg")
	public String getMsg() {
		System.out.println("in clinet");
		return this.msg;
	}
	 
	@PostMapping("/dep")
    public void addEmp(@RequestBody DepReq empReq) throws Exception {
		
		empRepo.save(empReq.toEmpModel());
		System.out.println("save data");
    }

   
}
