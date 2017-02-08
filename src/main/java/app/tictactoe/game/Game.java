package app.tictactoe.game;

import app.tictactoe.board.*;

public class Game {

    Board board;

    private Sequence3x3Checker sequenceChecker;

    public Game() {
        BoardBuilder builder = new BoardBuilder();
        board = builder.build();
        sequenceChecker = new Sequence3x3Checker(board);
    }

    public void addToBoard(Field field) {
        board.addToFields(field);
    }

    public GameState checkWinCondition(Sign player) {
        if(checkDraw()) {
            return new GameState(true, true);
        }

        boolean result = sequenceChecker.checkHorizontal(player) || sequenceChecker.checkVertical(player) || sequenceChecker.checkDimensional(player);
        if(result) {
            return new GameState(true, false);
        }

        return new GameState(false, false);
    }

    boolean checkDraw() {
        int counter = 0;
        for(Field field: board.getFields()) {
            if(field.getSign().equals(Sign.EMPTY)) {
               counter++;
            }
        }
        return counter == 0;
    }

}