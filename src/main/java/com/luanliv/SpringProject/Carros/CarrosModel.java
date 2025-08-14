package com.luanliv.SpringProject.Carros;

import com.luanliv.SpringProject.Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_carros")
public class CarrosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String cor;
    @OneToMany(mappedBy = "carros")
    private List<PessoaModel> pessoas;



}
