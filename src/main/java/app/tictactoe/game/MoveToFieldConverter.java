package app.tictactoe.game;

import app.tictactoe.board.Field;
import app.tictactoe.board.Sign;

public class MoveToFieldConverter {

    public static Field convert(Move move) {
        return new Field(move.getId(), getSign(move.getSign()));
    }

    private static Sign getSign(String value) {
        if (value.equalsIgnoreCase(Sign.O.toString())) {
            return Sign.O;
        } else {
            return Sign.X;
        }
    }

}