package com.adenix.categorychange.repository;
import com.adenix.categorychange.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepo extends JpaRepository<Categoria,Long>{

}