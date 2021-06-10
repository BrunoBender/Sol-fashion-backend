package br.com.senior.solFashion.repositories;

import br.com.senior.solFashion.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
