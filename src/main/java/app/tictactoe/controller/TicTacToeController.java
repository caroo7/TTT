package app.tictactoe.controller;

import app.tictactoe.game.*;
import app.tictactoe.board.Field;
import org.springframework.web.bind.annotation.*;


@RestController
public class TicTacToeController {

    private Game game;

    public TicTacToeController() {
        this.game = new Game();
    }

    @PostMapping("/game")
    public GameState game(@RequestBody Move move) {
        if(move == null) {
            throw new IllegalArgumentException("Invalid move.");
        }

        Field field = MoveToFieldConverter.convert(move);
        game.addToBoard(field);

        return game.checkWinCondition(field.getSign());
    }

    @PutMapping("/game/restart")
    public void restart() {
        game = new Game();
    }

}