package app.tictactoe.game;

import app.tictactoe.board.Field;
import app.tictactoe.board.Sign;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MoveToFieldConverterTest {

    Move move;

    @Test
    public void correctOConversionTest() {
        move = new Move("O", 0);
        Field field = MoveToFieldConverter.convert(move);

        assertEquals(field.getSign(), Sign.O);
    }

    @Test
    public void correctXConversionTest() {
        move = new Move("X", 0);
        Field field = MoveToFieldConverter.convert(move);

        assertEquals(field.getSign(), Sign.X);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void wrongConversionTest() {
        move = new Move("S", 0);
        MoveToFieldConverter.convert(move);
    }

}