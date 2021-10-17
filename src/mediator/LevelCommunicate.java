package mediator;

public enum LevelCommunicate {
    LOW(0),MEDIUM(1),HIGH(2);

    private int level;

    LevelCommunicate(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
