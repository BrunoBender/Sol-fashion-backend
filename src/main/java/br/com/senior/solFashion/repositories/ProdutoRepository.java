package br.com.senior.solFashion.repositories;

import br.com.senior.solFashion.domain.Categoria;
import br.com.senior.solFashion.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
