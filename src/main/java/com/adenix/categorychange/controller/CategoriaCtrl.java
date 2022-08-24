package com.adenix.categorychange.controller;
import com.adenix.categorychange.domain.Categoria;
import com.adenix.categorychange.requests.CategoriaPostReqBody;
import com.adenix.categorychange.requests.CategoriaPutReqBody;
import com.adenix.categorychange.service.CategoriaServ;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("categoria")
@Log4j2
@RequiredArgsConstructor
public class CategoriaCtrl {
@Autowired
private final CategoriaServ categoriaServ;

@PostMapping
public ResponseEntity<Categoria> save(@RequestBody CategoriaPostReqBody categoriaPostReqBody){
return new ResponseEntity(categoriaServ.save(categoriaPostReqBody), HttpStatus.CREATED);
}

}
