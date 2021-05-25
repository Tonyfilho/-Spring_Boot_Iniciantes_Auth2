package spring.com.spring_iniciantes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import spring.com.spring_iniciantes.model.Pessoa;
import spring.com.spring_iniciantes.repository.PessoaRepository;

@Service
@AllArgsConstructor
public class PessoaServices {

 //  @Autowired //OBS: SUBSTIRUIDO construtor do  LOMBOK
   PessoaRepository pessoaRepository;

   public Pessoa savePessoa(Pessoa pessoa) {
      // verificar se Já existe uma pessoa cadastrada com um CPF, buscaremos o CPF
      // adcionado no momento do Post e faremos o filtro
    List<Pessoa> pessoas = pessoaRepository.findByCpf(pessoa.getCpf());
      if (pessoas.size() > 0) {
         throw new RuntimeException("Este CPF já está cadastrado");
      }
      return this.pessoaRepository.save(pessoa);

   }

   public List<Pessoa> getPessoa() {

      return this.pessoaRepository.findAll();
   }

   public List<Pessoa> GetCPF(String cpf) {
      return pessoaRepository.findByCpf(cpf);
   }

}// end class
