package com.example.demo.cantroller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.studentrepository;
import com.example.demo.Repo.Components;
import com.example.demo.Repo.Language;
import com.example.demo.Repo.Parameters;
import com.example.demo.Repo.Studentm;
import com.example.demo.Repo.Template;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.Model.TemplateRepository;
import com.example.demo.Model.ParametersRepository;
import com.example.demo.Model.ComponentsRepository;
import com.example.demo.Model.LanguageRepository;
import com.example.demo.Model.ComponentsRepository;


@RestController
public class Controller implements CommandLineRunner {

	@Autowired
	studentrepository studentrepository;
	
	@Autowired
	TemplateRepository TemplateRepository;
	
	@Autowired
	ParametersRepository ParametersRepository;
	
	@Autowired
	LanguageRepository LanguageRepository;
	
	@Autowired
	ComponentsRepository ComponentsRepository;
	
	
	@Value("${demo.json.string}")
	private String json;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		Studentm value=mapper.readValue(json, Studentm.class); 
		Template value2=mapper.readValue(json, Template.class);
		Language value3=mapper.readValue(json, Language.class);
		Components value4=mapper.readValue(json, Components.class);
		Parameters value5=mapper.readValue(json, Parameters.class);
		
		
		
		System.out.println(value.getTo());
		System.out.println(value.getTemplate().getName());
		System.out.println(value.getTemplate().getLanguage().getPolicy());
		List<Components> a=value.getTemplate().getComponents();
		

		studentrepository.save(value);
		TemplateRepository.save(value2);
		LanguageRepository.save(value3);
		ComponentsRepository.save(value4);
		ParametersRepository.save(value5);
		
				
	}
}
