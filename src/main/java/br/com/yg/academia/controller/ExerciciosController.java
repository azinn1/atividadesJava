package br.com.yg.academia.controller;

import br.com.yg.academia.controller.DAO.IExercicios;
import br.com.yg.academia.entity.Exercicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExerciciosController {

    @Autowired
    private IExercicios dao;

    @GetMapping("/exercises")
    public List<Exercicios> getAllExercicios() {
        return IExerciciosgit.findAll();
    }


}
