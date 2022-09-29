package com.pixirchill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pixirchill.models.*;

@RepositoryRestResource(path="unidadmedida")
public interface UnidadMedidaRepository extends JpaRepository<UnidadMedida, Long>{

}
