package pattern.behavior.iterator;

public class TrainingCourse implements Iterable{
    private int number;
    private String[] academicDiscipline;

    public TrainingCourse(int number, String[] academicDiscipline) {
        this.number = number;
        this.academicDiscipline = academicDiscipline;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String[] getAcademicDiscipline() {
        return academicDiscipline;
    }

    public void setAcademicDiscipline(String[] academicDiscipline) {
        this.academicDiscipline = academicDiscipline;
    }

    @Override
    public Iterator getIterator() {
        return new disciplineIterator();
    }

    private class disciplineIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            if(index<academicDiscipline.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return academicDiscipline[index++];
        }
    }

}
