package app.tictactoe.board;

import app.tictactoe.configuration.Configuration;

import java.util.ArrayList;
import java.util.List;

public class BoardBuilder {

    public Board build() {
        return new Board(new BoardDimension(Configuration.BOARD_SIZE), initializeFields());
    }

    private List<Field> initializeFields() {
        int twoDimSize = Configuration.BOARD_SIZE * Configuration.BOARD_SIZE;
        List<Field> fields = new ArrayList<>();
        for(int i=0; i<twoDimSize; ++i) {
            fields.add(new Field(i, Sign.EMPTY));
        }
        return fields;
    }

}