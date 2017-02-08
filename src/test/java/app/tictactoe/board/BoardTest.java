package app.tictactoe.board;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class BoardTest {

    private Board board;

    @BeforeMethod
    public void setUp() {
        board = new BoardBuilder().build();
    }

    @Test
    public void addFieldToBoardForFirstTimeTest() {
        Field field = new Field(0, Sign.O);
        boolean result = board.addToFields(field);
        assertTrue(result, "Field can be added only once on specified position");
    }

    @Test
    public void addFieldToBoardTwoTimesTest() {
        Field fieldO = new Field(0, Sign.O);
        Field fieldX = new Field(0, Sign.X);
        board.addToFields(fieldO);
        boolean result = board.addToFields(fieldX);
        assertFalse("Field can be added only once on specified position", result);
    }

}