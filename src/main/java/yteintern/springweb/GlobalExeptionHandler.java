package yteintern.springweb;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExeptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<String> handleValidationExeption(MethodArgumentNotValidException exception){
        return exception.getFieldErrors().stream()
                .map(error -> error.getDefaultMessage()).toList();
    }
}
