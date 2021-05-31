package jpabook.jpashop.exception;

public class NotEnoughStockException extends RuntimeException {
    public NotEnoughStockException(String s) {
    }

    public NotEnoughStockException() {
        super();
    }

    public NotEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStockException(Throwable cause) {
        super(cause);
    }

}
