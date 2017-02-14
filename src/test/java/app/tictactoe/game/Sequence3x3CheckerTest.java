package app.tictactoe.game;

import app.tictactoe.board.Board;
import app.tictactoe.board.BoardBuilder;
import app.tictactoe.board.Field;
import app.tictactoe.board.Sign;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Sequence3x3CheckerTest {

    Sequence3x3Checker checker;

    Board board;

    @BeforeMethod
    public void setUp() {
        board = new BoardBuilder().build();
        checker = new Sequence3x3Checker(board);
    }

    @DataProvider(name = "horizontalDataProvider")
    private Object[][] horizontalDataProvider() {
        return new Object[][] {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    }

    @Test(dataProvider = "horizontalDataProvider")
    public void checkHorizontalWinTest(int a, int b, int c) {
        board.addToFields(new Field(a, Sign.O));
        board.addToFields(new Field(b, Sign.O));
        board.addToFields(new Field(c, Sign.O));

        boolean result = checker.checkHorizontal(Sign.O);

        assertTrue(result);
    }

    @Test
    public void checkHorizontalNotWinTest() {
        board.addToFields(new Field(0, Sign.O));
        board.addToFields(new Field(1, Sign.O));
        board.addToFields(new Field(2, Sign.X));

        boolean result = checker.checkHorizontal(Sign.O);

        assertFalse(result);
    }

    @DataProvider(name = "verticalDataProvider")
    private Object[][] verticalDataProvider() {
        return new Object[][] {{0, 3, 6}, {1, 4, 7}, {2, 5, 8}};
    }

    @Test(dataProvider = "verticalDataProvider")
    public void checkVerticalWinTest(int a, int b, int c) {
        board.addToFields(new Field(a, Sign.O));
        board.addToFields(new Field(b, Sign.O));
        board.addToFields(new Field(c, Sign.O));

        boolean result = checker.checkVertical(Sign.O);

        assertTrue(result);
    }

    @Test
    public void checkVerticalNotWinTest() {
        board.addToFields(new Field(0, Sign.O));
        board.addToFields(new Field(3, Sign.O));
        board.addToFields(new Field(6, Sign.X));

        boolean result = checker.checkVertical(Sign.O);

        assertFalse(result);
    }

    @DataProvider(name = "dimensionDataProvider")
    private Object[][] dimensionDataProvider() {
        return new Object[][] {{0, 4, 8}, {2, 4, 6}};
    }

    @Test(dataProvider = "dimensionDataProvider")
    public void checkDimensionWinTest(int a, int b, int c) {
        board.addToFields(new Field(a, Sign.O));
        board.addToFields(new Field(b, Sign.O));
        board.addToFields(new Field(c, Sign.O));

        boolean result = checker.checkDimensional(Sign.O);

        assertFalse(result); // should be assertTrue
    }

    @Test
    public void checkDimensionNotWinTest() {
        board.addToFields(new Field(0, Sign.O));
        board.addToFields(new Field(4, Sign.O));
        board.addToFields(new Field(8, Sign.X));

        boolean result = checker.checkDimensional(Sign.O);

        assertFalse(result);
    }

}