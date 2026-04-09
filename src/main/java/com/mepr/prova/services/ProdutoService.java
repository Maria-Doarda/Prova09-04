package com.mepr.prova.services;

import com.mepr.prova.models.ProdutoModel;
import com.mepr.prova.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Provider;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;


    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> findAll(ProdutoModel produtoModel){
        return produtoRepository.findAll(produtoModel);
    }

    public Optional<ProdutoModel> buscarId(Long id){
        return produtoRepository.findById(id);
    }

    public void deletar(Long id){
        produtoRepository.deleteById(id);
    }

}
