

import java.lang.Exception;

public class LanguageNotFoundException extends  Exception{
    public LanguageNotFoundException() {
        super();
    }
    public LanguageNotFoundException(String message){
        super(message);
    }
    public LanguageNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    public LanguageNotFoundException(Throwable cause){
        super(cause);
    }
}