package br.com.portalcon.portalconcursos.service;

import br.com.portalcon.portalconcursos.entity.Aprovado;
import br.com.portalcon.portalconcursos.repository.AprovadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class AprovadoService {

    @Autowired
    private AprovadoRepository repository;

    // Caminho onde as fotos serão salvas
    private static String caminhoImagens = "src/main/resources/static/uploads/";

    public Aprovado salvar(Aprovado aprovado, MultipartFile arquivo) throws IOException {
        
        if (arquivo != null && !arquivo.isEmpty()) {
            Path diretorio = Paths.get(caminhoImagens);
            if (!Files.exists(diretorio)) {
                Files.createDirectories(diretorio);
            }

            String nomeArquivo = System.currentTimeMillis() + "_" + arquivo.getOriginalFilename();
            Path caminhoCompleto = diretorio.resolve(nomeArquivo);
            
            Files.write(caminhoCompleto, arquivo.getBytes());
            aprovado.setFotoPath(nomeArquivo);
        }

        return repository.save(aprovado);
    }

    public List<Aprovado> listarTodos() {
        return repository.findAll();
    }
}