package www.kgstudy.train.common.exception;

public class BusinessException extends RuntimeException {

    private BusinessExceptionEnmu e;

    public BusinessException(BusinessExceptionEnmu e) {
        this.e = e;
    }

    public BusinessExceptionEnmu getE() {
        return e;
    }

    public void setE(BusinessExceptionEnmu e) {
        this.e = e;
    }


    /**
     * 不写入堆栈信息，提高性能
     * @return
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
