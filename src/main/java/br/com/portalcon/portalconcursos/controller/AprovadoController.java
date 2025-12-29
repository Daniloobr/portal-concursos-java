package br.com.portalcon.portalconcursos.controller;

import br.com.portalcon.portalconcursos.entity.Aprovado;
import br.com.portalcon.portalconcursos.service.AprovadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class AprovadoController {

    @Autowired
    private AprovadoService service;

    // AQUI ESTÁ A MUDANÇA: Adicionei {"/", "/cadastro"} para aceitar os dois
    // endereços
    @GetMapping({ "/", "/cadastro" })
    public String exibirFormulario(Model model) {
        model.addAttribute("aprovado", new Aprovado());
        return "formulario";
    }

    @PostMapping("/salvar")
    public String salvarAprovado(Aprovado aprovado,
            @RequestParam("file") MultipartFile file) throws IOException {

        service.salvar(aprovado, file);
        return "redirect:/cadastro?sucesso";
    }
}