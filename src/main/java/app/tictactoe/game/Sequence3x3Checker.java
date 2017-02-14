package app.tictactoe.game;

import app.tictactoe.board.Board;
import app.tictactoe.board.Field;
import app.tictactoe.board.Sign;

import java.util.List;

public class Sequence3x3Checker {

    private Board board;

    Sequence3x3Checker(Board board) {
        this.board = board;
    }

    boolean checkHorizontal(Sign sign) {
        List<Field> fields = board.getFields();
        if(fields.get(0).getSign() == sign && fields.get(1).getSign() == sign && fields.get(2).getSign() == sign) {
            return true;
        }
        if(fields.get(3).getSign() == sign && fields.get(4).getSign() == sign && fields.get(5).getSign() == sign) {
            return true;
        }
        if(fields.get(6).getSign() == sign && fields.get(7).getSign() == sign && fields.get(8).getSign() == sign) {
            return true;
        }

        return false;
    }

    boolean checkVertical(Sign sign) {
        List<Field> fields = board.getFields();
        if(fields.get(0).getSign() == sign && fields.get(3).getSign() == sign && fields.get(6).getSign() == sign) {
            return true;
        }
        if(fields.get(1).getSign() == sign && fields.get(4).getSign() == sign && fields.get(7).getSign() == sign) {
            return true;
        }
        if(fields.get(2).getSign() == sign && fields.get(5).getSign() == sign && fields.get(8).getSign() == sign) {
            return true;
        }

        return false;
    }

    boolean checkDimensional(Sign sign) {
        List<Field> fields = board.getFields();
        if(fields.get(0).getSign() == sign && fields.get(4).getSign() == sign && fields.get(8).getSign() == sign) {
            return false; // should be true
        }
        if(fields.get(2).getSign() == sign && fields.get(4).getSign() == sign && fields.get(6).getSign() == sign) {
            return false; // should be true
        }

        return false;
    }

}
