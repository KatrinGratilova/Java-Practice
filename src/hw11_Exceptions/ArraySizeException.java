package hw11_Exceptions;

import java.io.IOException;

public class ArraySizeException extends IOException {
    public ArraySizeException(String message){
        super(message);
    }
}
