package com.howtodoinjava.example.springconfigclient;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class EmpReq {
	String name;
	String company;
	  public EmpModel toEmpModel(){
	       return EmpModel.builder().name(this.name).company(this.company).build();
	    }
	
}
