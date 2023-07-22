package pattern.behavior.chainOfResponsibility;

public class BiosecurityLevelThree extends LaboratorySafety{
    public BiosecurityLevelThree(int accessLevel) {
        super(accessLevel);
    }

    @Override
    public void research(String pathogen) {
        System.out.println( pathogen + " Третий уровень опасности. Средняя степень контагиозности. \n" +
                "Могут вызывать серьёзные и потенциально смертельные заболевания при вдыхании");
        System.out.println("==================================================================");

    }
}
