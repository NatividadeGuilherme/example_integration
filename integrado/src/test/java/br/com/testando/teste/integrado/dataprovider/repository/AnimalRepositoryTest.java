package br.com.testando.teste.integrado.dataprovider.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.testando.teste.integrado.dataprovider.model.Animal;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class AnimalRepositoryTest {

	@Autowired
	private AnimalRepository animalRepository;
	
	@Test
	public void dadoQueTenhoAnimalComTodosDadosRealizoInsert() {
		Animal animal = new Animal("Calopsita");
		
		animalRepository.save(animal);
		
		List<Animal> animais = animalRepository.findAll();
		
		assertEquals(1, animais.size());
		assertEquals("Calopsita", animais.get(0).getNome());
	}
	
	@Test
	public void verificaQueNaoTemAnimais() {
		assertEquals(0, animalRepository.findAll().size());
	}
}
