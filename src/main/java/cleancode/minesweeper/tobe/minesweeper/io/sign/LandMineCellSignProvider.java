package cleancode.minesweeper.tobe.minesweeper.io.sign;

import cleancode.minesweeper.tobe.minesweeper.board.cell.CellSnapshotStatus;
import cleancode.minesweeper.tobe.minesweeper.board.cell.CellSnapshot;

public class LandMineCellSignProvider implements CellSignProvidable {

    private static final String LAND_MINE_SIGN = "☼";

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.LAND_MINE);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return LAND_MINE_SIGN;
    }
}
