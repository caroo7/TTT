package app.tictactoe.board;

public class Field {

    int position;

    Sign sign;

    public Field(int position, Sign sign) {
        this.position = position;
        this.sign = sign;
    }

    public Sign getSign() {
        return sign;
    }
}