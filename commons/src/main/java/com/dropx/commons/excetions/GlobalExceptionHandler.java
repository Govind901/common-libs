package com.dropx.commons.excetions;


import com.dropx.commons.model.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    private final String STATUS = "Failure";

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ResponseDto> handleCustomException(CustomException exc){
        return new ResponseEntity<>(new ResponseDto(STATUS,exc.getMessage()), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UnAuthorizedException.class)
    public ResponseEntity<ResponseDto> handleUnAuthorizedException(UnAuthorizedException exc){
        return new ResponseEntity<>(new ResponseDto(STATUS,exc.getMessage()), HttpStatus.UNAUTHORIZED);
    }
}
