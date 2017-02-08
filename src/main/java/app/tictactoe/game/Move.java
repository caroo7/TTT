package app.tictactoe.game;

import java.io.Serializable;

public class Move implements Serializable {

    private String playerSign;

    private int position;

    Move(String playerSign, int position) {
        this.playerSign = playerSign;
        this.position = position;
    }

    String getPlayerSign() {
        return playerSign;
    }

    public void setPlayerSign(String playerSign) {
        this.playerSign = playerSign;
    }

    int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}