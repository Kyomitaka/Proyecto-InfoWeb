package com.Kyomi.InfoWeb.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface NoticiaBusquedaRepository extends Repository<Object, Long> {

    @Query(value = "SELECT FIDE_BUSCAR_NOTICIAS_FN(:texto) FROM dual", nativeQuery = true)
    Integer contarNoticiasPorTexto(@Param("texto") String texto);
}
