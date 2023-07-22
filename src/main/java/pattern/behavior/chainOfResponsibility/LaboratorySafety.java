package pattern.behavior.chainOfResponsibility;

public abstract class LaboratorySafety {
    private int accessLevel;
    private LaboratorySafety nextLevel;

    public LaboratorySafety(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public void setNextLevel(LaboratorySafety nextLevel) {
        this.nextLevel = nextLevel;
    }

    public void security (String pathogen, int riskLevel) {
        if(riskLevel <= accessLevel) {
            research(pathogen);
        } else if(nextLevel != null) {
            nextLevel.security(pathogen, riskLevel);
        }
    }

    public abstract void research(String pathogen);
}
