package com.example.estoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.estoque.entity.Category;
import com.example.estoque.repository.CategoryRepository;

@Controller
@RequestMapping("/categorias")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public String listarCategorias(Model model) {
        model.addAttribute("categorias", categoryRepository.findAll());
        return "categorias";
    }

    @GetMapping("/nova")
    public String novaCategoriaForm(Model model) {
        model.addAttribute("categoria", new Category());
        return "categoria-form";
    }

    @PostMapping
    public String salvarCategoria(@ModelAttribute Category categoria) {
        categoryRepository.save(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/{id}/editar")
    public String editarCategoriaForm(@PathVariable Long id, Model model) {
        model.addAttribute("categoria", categoryRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("Categoria não encontrada")));
        return "categoria-form";
    }

    @PostMapping("/{id}")
    public String atualizarCategoria(@PathVariable Long id, @ModelAttribute Category categoria) {
        categoria.setId(id);
        categoryRepository.save(categoria);
        return "redirect:/categorias";
    }

    @PostMapping("/{id}/excluir")
    public String excluirCategoria(@PathVariable Long id) {
        categoryRepository.deleteById(id);
        return "redirect:/categorias";
    }
}
