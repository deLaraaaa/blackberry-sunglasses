package com.example.estoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.estoque.entity.Product;
import com.example.estoque.repository.ProductRepository;

@Controller
@RequestMapping("/produtos")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", productRepository.findAll());
        return "produtos";
    }

    @GetMapping("/novo")
    public String novoProdutoForm(Model model) {
        model.addAttribute("produto", new Product());
        return "produto-form";
    }

    @PostMapping
    public String salvarProduto(@ModelAttribute Product produto) {
        productRepository.save(produto);
        return "redirect:/produtos";
    }

    @GetMapping("/{id}/editar")
    public String editarProdutoForm(@PathVariable Long id, Model model) {
        model.addAttribute("produto", productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Produto não encontrado")));
        return "produto-form";
    }

    @PostMapping("/{id}")
    public String atualizarProduto(@PathVariable Long id, @ModelAttribute Product produto) {
        produto.setId(id);
        productRepository.save(produto);
        return "redirect:/produtos";
    }

    @PostMapping("/{id}/excluir")
    public String excluirProduto(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/produtos";
    }
}
