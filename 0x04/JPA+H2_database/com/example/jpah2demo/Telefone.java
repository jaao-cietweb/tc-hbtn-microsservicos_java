package com.example.jpah2demo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "telefones")
public class Telefone {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column
private int DDD;
@Column
private int numero;

    public Telefone(int id, int DDD, int numero) {
        this.id = id;
        this.DDD = DDD;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return id == telefone.id && DDD == telefone.DDD && numero == telefone.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, DDD, numero);
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "id=" + id +
                ", DDD=" + DDD +
                ", numero=" + numero +
                '}';
    }
}
