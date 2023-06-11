package lowleveldesign.tictactoe.model.strategy;

import lowleveldesign.tictactoe.model.Board;
import lowleveldesign.tictactoe.model.Move;
import lowleveldesign.tictactoe.model.Player;

public interface BotPlayingStrategy {

    Move decideMove(Player player, Board board);

}
