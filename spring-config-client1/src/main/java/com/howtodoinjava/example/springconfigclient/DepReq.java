package com.howtodoinjava.example.springconfigclient;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class DepReq {
	String name;
	String company;
	  public DepModel toEmpModel(){
	       return DepModel.builder().name(this.name).company(this.company).build();
	    }
	
}
