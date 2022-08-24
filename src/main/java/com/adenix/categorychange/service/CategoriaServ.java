package com.adenix.categorychange.service;
import com.adenix.categorychange.domain.Categoria;
import com.adenix.categorychange.mapper.CategoriaMapper;
import com.adenix.categorychange.repository.CategoriaRepo;
import com.adenix.categorychange.requests.CategoriaPostReqBody;
import com.adenix.categorychange.requests.CategoriaPutReqBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoriaServ{
private final CategoriaRepo categoriaRepo;
@Transactional
public Categoria save(CategoriaPostReqBody categoriaPostReqBody){
return categoriaRepo.save(CategoriaMapper.INSTANCE.toCategoria(categoriaPostReqBody));

}

}