package app.tictactoe.game;

import java.io.Serializable;

public class Move implements Serializable {

    private String sign;

    private String id;

    Move(String sign, String id) {
        this.sign = sign;
        this.id = id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getId() {
        return Integer.parseInt(id);
    }

    public void setId(String id) {
        this.id = id;
    }
}