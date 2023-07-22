package pattern.behavior.chainOfResponsibility;

public class BiosecurityLevelOne extends LaboratorySafety{
    public BiosecurityLevelOne(int accessLevel) {
        super(accessLevel);
    }

    @Override
    public void research(String pathogen) {
        System.out.println(pathogen + " Не вызывают заболевания у людей и животных");
        System.out.println("==================================================================");


    }
}
