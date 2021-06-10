package br.com.senior.solFashion.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Vestuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tamanho;
    @OneToOne
    @JoinColumn(name = "vestuario_id")
    private Produto produto;

    public Vestuario(String tamanho, Produto produto) {
        this.tamanho = tamanho;
        this.produto = produto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
