package br.senac.sp.livro.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.sp.livro.model.Livro;

public interface LivroRepository extends JpaRepository<Livro,Long>  { 
    
}
