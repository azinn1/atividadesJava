package br.com.yg.academia.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "exercicios")
public class Exercicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String tipo;
    private String dificuldade;
    private String tempoEstimado;
}
