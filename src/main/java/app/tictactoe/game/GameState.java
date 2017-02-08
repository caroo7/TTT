package app.tictactoe.game;

import java.io.Serializable;

public class GameState implements Serializable {

    public GameState(){}

    public GameState(boolean endOfGame, boolean isADraw) {
        this.endOfGame = endOfGame;
        this.isADraw = isADraw;
    }

    boolean endOfGame;

    boolean isADraw;

    public boolean isEndOfGame() {
        return endOfGame;
    }

    public void setEndOfGame(boolean endOfGame) {
        this.endOfGame = endOfGame;
    }

    public boolean isADraw() {
        return isADraw;
    }

    public void setADraw(boolean ADraw) {
        isADraw = ADraw;
    }
}