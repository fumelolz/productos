package com.example.productos.controller;

import org.springframework.web.bind.annotation.*;
import com.example.productos.repository.ProductoRepository;
import com.example.productos.model.Producto;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoRepository repo;

    public ProductoController(ProductoRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Producto> all() { return repo.findAll(); }

    @GetMapping("/{id}")
    public Producto get(@PathVariable Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("No encontrado"));
    }

    @PostMapping
    public Producto create(@RequestBody Producto p) { return repo.save(p); }

    @PutMapping("/{id}")
    public Producto update(@PathVariable Integer id, @RequestBody Producto p) {
        Producto ex = repo.findById(id).orElseThrow();
        ex.setNombre(p.getNombre());
        ex.setPrecio(p.getPrecio());
        return repo.save(ex);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { repo.deleteById(id); }
}
