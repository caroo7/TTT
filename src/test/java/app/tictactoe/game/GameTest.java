package app.tictactoe.game;

import app.tictactoe.board.Board;
import app.tictactoe.board.Field;
import app.tictactoe.board.Sign;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class GameTest {

    Game game;

    @BeforeMethod
    public void setUp() {
        game = new Game();
    }

    @Test
    public void checkIfGameEndedAsADraw() {
        Board board = game.board;
        board.addToFields(new Field(0, Sign.O));
        board.addToFields(new Field(1, Sign.X));
        board.addToFields(new Field(2, Sign.O));
        board.addToFields(new Field(3, Sign.X));
        board.addToFields(new Field(4, Sign.O));
        board.addToFields(new Field(5, Sign.X));
        board.addToFields(new Field(6, Sign.X));
        board.addToFields(new Field(7, Sign.O));
        board.addToFields(new Field(8, Sign.X));

        boolean isADraw = game.checkDraw();

        assertTrue(isADraw);
    }


    @Test
    public void checkIfGameEndedAsNotADraw() {
        Board board = game.board;
        board.addToFields(new Field(0, Sign.O));
        board.addToFields(new Field(1, Sign.X));
        board.addToFields(new Field(2, Sign.O));
        board.addToFields(new Field(3, Sign.X));
        board.addToFields(new Field(4, Sign.O));
        board.addToFields(new Field(5, Sign.X));
        board.addToFields(new Field(6, Sign.O));
        board.addToFields(new Field(7, Sign.X));
        board.addToFields(new Field(8, Sign.EMPTY));

        boolean isADraw = game.checkDraw();

        assertFalse(isADraw);
    }

    @Test
    public void winConditionShouldBeADraw() {
        Board board = game.board;
        board.addToFields(new Field(0, Sign.O));
        board.addToFields(new Field(1, Sign.X));
        board.addToFields(new Field(2, Sign.O));
        board.addToFields(new Field(3, Sign.X));
        board.addToFields(new Field(4, Sign.O));
        board.addToFields(new Field(5, Sign.X));
        board.addToFields(new Field(6, Sign.X));
        board.addToFields(new Field(7, Sign.O));
        board.addToFields(new Field(8, Sign.X));

        GameStatus status = game.checkWinCondition(Sign.O);

        assertEquals(status, GameStatus.DRAW);
    }

    // finish this tests

}