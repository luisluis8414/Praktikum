package io.fp.caesarcipherfx;

public class CipherException extends Exception {

    public CipherException() {
    }

    public CipherException(String arg0) {
        super(arg0);
    }

    public CipherException(Throwable arg0) {
        super(arg0);
    }

    public CipherException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public CipherException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
    
}
