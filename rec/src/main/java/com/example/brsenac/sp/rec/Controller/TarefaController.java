package com.example.brsenac.sp.rec.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.brsenac.model.Tarefa;


@Controller
public class TarefaController {

    @Autowired
    TarefaRepository repository;
     

    @GetMapping ("/tarefas")
    public String tarefas() {
        return "tarefas";

    }

    @GetMapping ("/tarefas/cadastrar")
    public String formulario() {
        return "formulario_tarefas";
    }

    @GetMapping("/tarefas") 
    public String cadastrar(Tarefa tarefa) {
        repository.save(tarefa);
        return "redirect:/tarefas";
        

    }




    
}
