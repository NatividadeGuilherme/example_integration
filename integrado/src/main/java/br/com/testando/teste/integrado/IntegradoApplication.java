package br.com.testando.teste.integrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.com.testando.teste.integrado.dataprovider.model.Animal;
import br.com.testando.teste.integrado.dataprovider.repository.AnimalRepository;

@SpringBootApplication
public class IntegradoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanExe = SpringApplication.run(IntegradoApplication.class, args);
		
		AnimalRepository bean = beanExe.getBean(AnimalRepository.class);
		
		bean.save(new Animal("Ovelha"));
	}

}
