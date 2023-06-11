package lowleveldesign.tictactoe.model;

import lowleveldesign.tictactoe.model.enums.BotDifficultyLevel;
import lowleveldesign.tictactoe.model.enums.PlayerType;
import lowleveldesign.tictactoe.model.strategy.BotPlayingStrategy;

public class Bot extends Player{

    BotPlayingStrategy playingStrategy;
    BotDifficultyLevel difficultyLevel;
    public Bot(char symbol, String name, BotDifficultyLevel difficultyLevel){
        super(name, symbol, PlayerType.BOT);

        this.difficultyLevel = difficultyLevel;
       // this.playingStrategy =

    }
}
