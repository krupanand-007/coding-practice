package lowleveldesign.tictactoe.model;

import lowleveldesign.tictactoe.exception.InvalidMoveException;
import lowleveldesign.tictactoe.model.enums.CellState;
import lowleveldesign.tictactoe.model.enums.PlayerType;

import java.util.List;
import java.util.Scanner;

public class Player {

    String name;
    char symbol;
    PlayerType playerType;

    public Player(String name, char symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public void display(Board board) {

        List<List<Cell>> cells = board.getBoard();

        for (List<Cell> cellRow : cells) {
            for (Cell cell : cellRow) {
                CellState currentState = cell.getCellState();
                if (CellState.EMPTY.equals(currentState)) {
                    System.out.print(" |   | ");
                } else if (CellState.BLOCKED.equals(currentState)) {
                    System.out.print(" | X | ");
                } else {
                    System.out.print(" | " + cell.getPlayer().symbol + " | ");
                }
            }
        }

    }

    public Move decideMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the cell row and colum");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        //cell validation
        List<List<Cell>> boardCells = board.getBoard();
        CellState currentState = boardCells.get(row).get(col).getCellState();
        if (CellState.FILLED.equals(currentState)) {
            throw new InvalidMoveException("Cannot fill " + currentState + "cell");
        }
        return new Move(this, new Cell(row, col, CellState.FILLED));
    }
}
