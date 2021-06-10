package br.com.senior.solFashion.services;

import br.com.senior.solFashion.domain.Categoria;
import br.com.senior.solFashion.domain.Produto;
import br.com.senior.solFashion.repositories.CategoriaRepository;
import br.com.senior.solFashion.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Arrays;

@Service
public class BdService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public void instantiateTestDatabase() throws ParseException{
        Categoria cat1 = new Categoria("Perfumaria");
        Categoria cat2 = new Categoria("Vestuário");
        Produto prod1 = new Produto("Kaiak", 89.90, cat1);
        Produto prod2 = new Produto("Blusa jeans", 89.90, cat2);

        cat1.getProdutos().addAll(Arrays.asList(prod1));
        cat2.getProdutos().addAll(Arrays.asList(prod2));


        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        produtoRepository.saveAll(Arrays.asList(prod1, prod2));
    }

}
