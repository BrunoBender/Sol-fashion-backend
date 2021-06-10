package br.com.senior.solFashion.repositories;

import br.com.senior.solFashion.domain.Produto;
import br.com.senior.solFashion.domain.Vestuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VestuarioRepository extends JpaRepository<Vestuario, Integer> {
}
