package com.aula110.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crypto_tb")
public class Crypto {
    
    @Id
    //gerar valor (pela estrategia AUTO -> sequencial)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "crypto_id", columnDefinition = "INTEGER")
    private Integer id;

    @Column(name = "crypto_name", columnDefinition = "VARCHAR", nullable = false, unique = true)
    private String name;

    @Column(name = "crypto_rate", columnDefinition = "DOUBLE", nullable = false)
    private Double rate;

    @Column(name = "crypto_exchange", columnDefinition = "VARCHAR", nullable = false)
    private String exchange;

    //construtor vazio para o spring usar e definir meus atributos
    public Crypto(){};

    public Crypto(String name, Double rate, String exchange) {
        
        this.name = name;
        this.rate = rate;
        this.exchange = exchange;
    }

    @Override
    //para exibir meus registros
    public String toString() {
        return String.format("-> Criptomoeda\nId: %id\nName: %s\nRate: %d, id, name, rate");
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getRate() {
        return rate;
    }

    public String getExchange() {
        return exchange;
    }
}
