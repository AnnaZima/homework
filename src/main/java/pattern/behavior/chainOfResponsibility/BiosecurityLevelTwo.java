package pattern.behavior.chainOfResponsibility;

public class BiosecurityLevelTwo extends LaboratorySafety{
    public BiosecurityLevelTwo(int accessLevel) {
        super(accessLevel);
    }

    @Override
    public void research(String pathogen) {
        System.out.println(pathogen + " Второй уровень опасности. Низкая степень контагиозности. " +
                "Имеются сресдтва профилактики и лечения");
        System.out.println("==================================================================");

    }
}
