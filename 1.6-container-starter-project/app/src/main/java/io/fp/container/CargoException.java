package io.fp.container;

public class CargoException extends Exception {

    public CargoException() {
    }

    public CargoException(String arg0) {
        super(arg0);
    }

    public CargoException(Throwable arg0) {
        super(arg0);
    }

    public CargoException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public CargoException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
    
}
