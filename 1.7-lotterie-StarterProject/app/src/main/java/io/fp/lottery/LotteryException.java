package io.fp.lottery;

public class LotteryException extends Exception {

    public LotteryException() {
    }

    public LotteryException(String arg0) {
        super(arg0);
    }

    public LotteryException(Throwable arg0) {
        super(arg0);
    }

    public LotteryException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public LotteryException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
    
}
