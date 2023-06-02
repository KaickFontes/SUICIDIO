package br.senac.sp.livro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.senac.sp.livro.data.LivroRepository;
import br.senac.sp.livro.model.Livro;

@Controller
public class LivroController {

    @Autowired
    LivroRepository repository;

    //localhost/livros
    @GetMapping("/livros")
    public String livros(Model model) {
        var livros = repository.findAll();
        model.addAttribute("livros", livros);
        return "livros";
    }

    @GetMapping("/livros/cadastrar")
    public String formulario() {
        return "formulario_livro";

    }

    @DeleteMapping("/livros")
    public String apagar(Long id, RedirectAttributes redirect){
        repository.deleteById(id);
       redirect.addFlashAttribute("mensagem", "Livro apagado com sucesso");
       return"redirect:/livros";
    
    }

    @PostMapping("/livros")
    public String cadastrar(Livro livro){
        System.out.println(livro);
        repository.save(livro);
        return"redirect:/livros";

        
        }

        @GetMapping("/")
        public String home(){
            return"redirect:/livros";
        }

    
}
