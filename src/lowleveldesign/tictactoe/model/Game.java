package lowleveldesign.tictactoe.model;

import lowleveldesign.tictactoe.model.strategy.GameWinningStrategy;

import java.util.List;

public class Game {

    Board board;
    List<Player> players;
    List<Move> moves;
    Player winner;
    GameWinningStrategy gameWinningStrategy;
}
