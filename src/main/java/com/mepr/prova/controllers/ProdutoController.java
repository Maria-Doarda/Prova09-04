package com.mepr.prova.controllers;

import com.mepr.prova.models.ProdutoModel;
import com.mepr.prova.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/{id}")
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produtoModel){
        com.mepr.prova.models.ProdutoModel request = produtoService.criarProduto(produtoModel);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> findAll(){
        List<ProdutoModel> request = produtoService.findAll();
        return ResponseEntity.ok().body(request);
    }

    //deu branco


}
