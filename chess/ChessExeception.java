package chess;

import java.io.Serial;

public class ChessExeception extends RuntimeException {

    @Serial
    private static final long serialVersionUID =1L;

    public ChessExeception(String msg){
        super(msg);
    }



}
