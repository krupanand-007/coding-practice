package lowleveldesign.tictactoe.model;

import lowleveldesign.tictactoe.model.enums.CellState;

import java.util.ArrayList;
import java.util.List;

public class Board {

    int size;
    List<List<Cell>> board;

    public Board(int n) {
        this.size=n;
        this.board = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            List<Cell> row = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                Cell cell = new Cell(i, j, CellState.EMPTY);
                row.add(cell);
            }
            board.add(row);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
