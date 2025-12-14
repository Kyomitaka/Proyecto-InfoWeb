package com.Kyomi.InfoWeb.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import oracle.jdbc.OracleTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.Kyomi.InfoWeb.model.Noticia;

@Repository
public class NoticiaConsultaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Noticia> consultarNoticias(
            Long idTema,
            Long idSubtema,
            String autor) {

        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("FIDE_CONSULTAS_NOTICIA_SP")
                .declareParameters(
                    new org.springframework.jdbc.core.SqlParameter("P_ID_TEMA", Types.NUMERIC),
                    new org.springframework.jdbc.core.SqlParameter("P_ID_SUBTEMA", Types.NUMERIC),
                    new org.springframework.jdbc.core.SqlParameter("P_AUTOR", Types.VARCHAR),
                    new org.springframework.jdbc.core.SqlOutParameter(
                        "P_CURSOR_OUT",
                        OracleTypes.CURSOR,
                        new NoticiaRowMapper()
                    )
                );

        Map<String, Object> result = jdbcCall.execute(
            Map.of(
                "P_ID_TEMA", idTema,
                "P_ID_SUBTEMA", idSubtema,
                "P_AUTOR", autor
            )
        );

        return (List<Noticia>) result.get("P_CURSOR_OUT");
    }

    private static class NoticiaRowMapper implements RowMapper<Noticia> {
        @Override
        public Noticia mapRow(ResultSet rs, int rowNum) throws SQLException {
            Noticia n = new Noticia();
            n.setIdNoticia(rs.getLong("ID_NOTICIA"));
            n.setIdTema(rs.getLong("ID_TEMA"));
            n.setIdSubtema(rs.getLong("ID_SUBTEMA"));
            n.setAutor(rs.getString("AUTOR"));
            n.setTitulo(rs.getString("TITULO"));
            n.setFechaPublicacion(rs.getDate("FECHA_PUBLICACION"));
            return n;
        }
    }
}
