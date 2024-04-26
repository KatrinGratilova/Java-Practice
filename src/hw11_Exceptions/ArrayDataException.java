package hw11_Exceptions;

import java.io.IOException;

public class ArrayDataException extends IOException {
    public ArrayDataException(String message, Throwable cause){
        super(message, cause);
    }
}
