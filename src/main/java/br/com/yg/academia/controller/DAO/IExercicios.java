package br.com.yg.academia.controller.DAO;

import br.com.yg.academia.entity.Exercicios;
import org.springframework.data.repository.CrudRepository;

public interface IExercicios extends CrudRepository<Exercicios, Integer> {

}
