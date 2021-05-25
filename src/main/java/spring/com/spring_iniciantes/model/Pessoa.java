package spring.com.spring_iniciantes.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // com esta ANOTAÇÃO @DATA não precisamos criar o GET/SET/EQUALS/TOSTRING/ etc
@AllArgsConstructor// Com esta ANOTAÇÃO @ALLAARGSCONSTRUCTOR cria-se todos os CONSTRUTORES
@NoArgsConstructor // Com esta ANOTAÇÂO @NOARGSCONTRUCTOR substitui o construtor vazio 
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private int idade;




    // public Pessoa(Long id, String nome, String cpf) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.cpf = cpf;
    // }

    // public Long getId() {
    //     return this.id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getNome() {
    //     return this.nome;
    // }

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    // public String getCpf() {
    //     return this.cpf;
    // }

    // public void setCpf(String cpf) {
    //     this.cpf = cpf;
    // }

    // public Pessoa id(Long id) {
    //     setId(id);
    //     return this;
    // }

    // public Pessoa nome(String nome) {
    //     setNome(nome);
    //     return this;
    // }

    // public Pessoa cpf(String cpf) {
    //     setCpf(cpf);
    //     return this;
    // }


   

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            "}";
    }







    
}//end class
