package br.com.fiap.ecommerce.dto.exception.mapper;

import br.com.fiap.ecommerce.dto.exception.ErroResponseDto;
import br.com.fiap.ecommerce.exception.EntidadeNaoEncontradaException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ApiExceptionMapper implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception e) {
        if (e instanceof EntidadeNaoEncontradaException) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(new ErroResponseDto("Entidade não encontrada", e.getMessage()))
                    .build();
        }
        return Response.serverError().build();
    }

}
