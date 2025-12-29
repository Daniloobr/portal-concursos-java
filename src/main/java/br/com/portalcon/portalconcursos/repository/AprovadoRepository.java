package br.com.portalcon.portalconcursos.repository;

import br.com.portalcon.portalconcursos.entity.Aprovado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AprovadoRepository extends JpaRepository<Aprovado, Long> {
}