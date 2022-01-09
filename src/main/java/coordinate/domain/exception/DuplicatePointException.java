package coordinate.domain.exception;

/**
 * Created by melodist
 * Date: 2022-01-09 009
 * Time: 오후 11:34
 */
public class DuplicatePointException extends RuntimeException{
    public DuplicatePointException (String s) {
        super(s);
    }
}
