package lab3.exception;

import lab3.error.ErrorCodeEnum;
import lab3.error.InternalServerErrorException;
import org.springframework.http.HttpStatus;

public class InvalidCredentialsException extends InternalServerErrorException
{
    public InvalidCredentialsException()
    {
        super( new ServerErrorResponseDto( "Invalid username or password", ErrorCodeEnum.INVALID_USER_CREDENTIALS,
                HttpStatus.UNAUTHORIZED ), HttpStatus.UNAUTHORIZED );
    }
}