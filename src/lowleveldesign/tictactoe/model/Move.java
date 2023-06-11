package lowleveldesign.tictactoe.model;

public class Move {

    Cell cell;
    Player player;

    public Move(Player player, Cell cell) {
        this.cell = cell;
        this.player = player;
    }
}

