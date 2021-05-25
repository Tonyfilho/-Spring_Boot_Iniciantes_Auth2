package spring.com.spring_iniciantes.controller;

import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import spring.com.spring_iniciantes.model.Pessoa;
import spring.com.spring_iniciantes.services.PessoaServices;

@AllArgsConstructor //Não preciso criar o construtor por causa da anotação do LOMBOK
@RestController // Esta anotação: Usa o BODY e já recebe o JSON como Resposta, sem precisar
                // converter nada
public class PessoaController {

  // @Autowired Remove a Anotação @AUTOWIRED e cria um CONSTRUTOR , isto evita
  // erros nullPoint e facilita os JunitTest----Anotação @ALLARGSCONSTRUCTOR substitui o construtor
  PessoaServices pessoaServices;

  // public PessoaController(PessoaServices pessoaServices) {
  //   this.pessoaServices = pessoaServices;
  // }

  // A Anotação POSTMAPPING controla Tudo que vier para o ENDPOINT '/PESSOAS' e
  // que usar o POST, ou usar da outra forma
  // @PostMapping("/pessoas")
  // @REQUESTBODY diz que receberemos um JSON vindo no BODY(@RequestBody Pessoa
  // pessoa).
  @RequestMapping(path = "/pessoas", method = RequestMethod.POST)
  public Pessoa savePessoa(@RequestBody Pessoa pessoa) {
    return pessoaServices.savePessoa(pessoa);

  }

  // A Anotação GETMAPPING controla Tudo que vier para o ENDPOINT '/PESSOAS' e que
  // usar o GET,ou usar da outra forma
  // @GetMapping("/pessoas")
  // Aqui no GET, o SPRING MCV recebe uma LISTA de OBJETO PESSOA e RESTCONTROLLER
  // transforma em JSON para front
  @RequestMapping(path = "/pessoas", method = RequestMethod.GET)
  public List<Pessoa> getPessoa() {
    return pessoaServices.getPessoa();
  }

  // Aqui neste Metodo de LISTAR por CPF
  // No controller temos que falar para spring que ele RECEBERÁ um PathVarible
  @RequestMapping(path = "/pessoas/{cpf}", method = RequestMethod.GET)
  public List<Pessoa> getPorCPF(@PathVariable String cpf) {
    return pessoaServices.GetCPF(cpf);
  }

} // end class
