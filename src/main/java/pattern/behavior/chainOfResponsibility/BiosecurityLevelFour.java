package pattern.behavior.chainOfResponsibility;

public class BiosecurityLevelFour extends LaboratorySafety{
    public BiosecurityLevelFour(int accessLevel) {
        super(accessLevel);
    }

    @Override
    public void research(String pathogen) {
        System.out.println(pathogen + " Четвертый уровень опасности. Высока степень контагиозности.  \n" +
                "Представляет общественный риск. Могут легко передаваться аэрозольным путём в лаборатории и вызывать у людей тяжёлые  \n" +
                "или смертельные заболевания. Нет доступных вакцин или методов лечения ");
        System.out.println("==================================================================");


    }
}
