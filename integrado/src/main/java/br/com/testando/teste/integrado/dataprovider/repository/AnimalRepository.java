package br.com.testando.teste.integrado.dataprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.testando.teste.integrado.dataprovider.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
