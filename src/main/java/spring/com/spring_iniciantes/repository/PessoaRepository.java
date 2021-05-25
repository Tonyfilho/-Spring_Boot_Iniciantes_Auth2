package spring.com.spring_iniciantes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.com.spring_iniciantes.model.Pessoa;

//Repository é um BEAN especial do SPRING_DATA, por isto não preciso por ANOTAÇÕES
//As anotações já estão injetada no frameworks
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    // O SPRING consegue fazer BUSCAR no ATRIBUTOS da class pelo nome, mas tem que
    // seguir a ordem camelCase findByCpf usando o findByNomeDoAtributo
    // Com isto o Spring vai montar o SQL que faz estas busca na Tabela

    List<Pessoa> findByCpf(String cpf);

    Pessoa findByIdade(String idade);

    Pessoa findByNome(String nome);

    List<Pessoa> findByNomeLike(String nome); // Cria a Query que busca uma Letra ou um Nome que tem na Tabela

    List<Pessoa> findByIdadeGreaterThan(int idade);// cria uma QUERY de pessoas com idade acima de:(IDADE)

    List<Pessoa> findByIdadeGreaterThanEqual(int idade); // cria uma QUERY de pessoas com idade MAIOR/IQUAL a:(IDADE)

    List<Pessoa> findByNomeContaining(String nome); // Cria um Query de pessoas de 1 " Item, Letra,etc "" que contem na
                                                    // tabela nome
                                                    

}
