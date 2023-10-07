package med.voll.api.infra.exception;

import jakarta.persistence.EntityNotFoundException;
import med.voll.api.domain.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity errorHandler404() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity errorHandler400(MethodArgumentNotValidException exception400) {
        var errors = exception400.getFieldErrors();

        return ResponseEntity.badRequest().body(errors.stream().map(DataErrorsValidation::new).toList());
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity errorHandlerBusinessRules(ValidationException exceptionBusinessRules) {
        return ResponseEntity.badRequest().body(exceptionBusinessRules.getMessage());
    }

    private record DataErrorsValidation(String field, String message) {
        public DataErrorsValidation(FieldError error) {
            this(error.getField(), error.getDefaultMessage());
        }

    }
}
