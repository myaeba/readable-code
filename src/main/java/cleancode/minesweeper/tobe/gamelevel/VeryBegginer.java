package cleancode.minesweeper.tobe.gamelevel;

public class VeryBegginer implements GameLevel{

    @Override
    public int getRowSize() {
        return 4;
    }

    @Override
    public int getColSize() {
        return 5;
    }

    @Override
    public int getLandMineCount() {
        return 2;
    }
}
