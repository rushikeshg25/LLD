public class Portal {
    private final int start;
    private final int end;
    private final PortalType type;

    public Portal(int start, int end, PortalType type) {
        if((type==PortalType.SNAKE && start<=end) || (type==PortalType.LADDER && end<=start)){
            throw new IllegalArgumentException("Incorrect Portal type");
        }
        this.start = start;
        this.end = end;
        this.type = type;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public PortalType getType() {
        return type;
    }
}
