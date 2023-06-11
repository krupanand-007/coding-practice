package lowleveldesign.tictactoe.exception;

public class InvalidMoveException extends RuntimeException {

    private String message;

    public InvalidMoveException(String message) {
        this.message = message;
    }

}
