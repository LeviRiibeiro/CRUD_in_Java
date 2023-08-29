package br.com.Levi.Cliente.persistence.entity;

import jakarta.persistence.*;

import java.security.PrivateKey;
import java.util.function.Function;

@Entity
@Table(name = "db_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private  long id;
    @Column(name = "nome", nullable = false)
    private long nome;
    @Column(name = "documento", nullable = false)
    private  String documento;

    public <R> R map(Function<Cliente, R> func) {
        return func.apply(this);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNome() {
        return nome;
    }

    public void setNome(long nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
