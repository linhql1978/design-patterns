package chainOfResponsibility;

public enum LevelProcess {
    EASY(0), MEDIUM(1), HARD(2);

    private int level;

    LevelProcess(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
