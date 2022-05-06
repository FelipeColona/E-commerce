package br.com.ecommerce.api.exception;

import java.io.Serial;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Getter
public class ResourceNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    private Set<ErrorDetails.Field> fields;

    public ResourceNotFoundException(Set<ErrorDetails.Field> fields) {
        super(fields.toString());
        this.fields = fields;
    }
}

