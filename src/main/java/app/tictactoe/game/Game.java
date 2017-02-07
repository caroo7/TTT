package app.tictactoe.game;

import app.tictactoe.board.*;

public class Game {

    private Board board;

    private Sequence3x3Checker sequenceChecker;

    public Game() {
        BoardBuilder builder = new BoardBuilder();
        board = builder.build();
        sequenceChecker = new Sequence3x3Checker(board);
    }

    public void addToBoard(Field field) {
        board.addToFields(field);
    }

    public GameStatus checkWinCondition(Sign player) {
        if(checkDraw()) {
            return GameStatus.DRAW;
        }

        boolean result = sequenceChecker.checkHorizontal(player) || sequenceChecker.checkVertical(player) || sequenceChecker.checkDimensional(player);
        if(result) {
            return player.equals(Sign.O) ? GameStatus.O : GameStatus.X;
        }

        return GameStatus.PLAY;
    }

    private boolean checkDraw() {
        int counter = 0;
        for(Field field: board.getFields()) {
            if(field.getSign().equals(Sign.EMPTY)) {
               counter++;
            }
        }
        return counter == 0;
    }

}