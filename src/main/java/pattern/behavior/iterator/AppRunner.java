package pattern.behavior.iterator;

public class AppRunner {
    public static void main(String[] args) {
        String[] dis = {"Введение в экономику", "Математический анализ", "Линейная алгебра", "Теория вероятностей", "Английский язык", "История экономики"};
        String[] dis2 = {"Макроэкономика", "Математическая статистика", "Эконометрика", "Статистика", "Экономическая география", "Английский язык"};

        TrainingCourse trainingCourse = new TrainingCourse(1, dis);
        TrainingCourse course2 = new TrainingCourse(2, dis2);

        Iterator iterator = trainingCourse.getIterator();
        Iterator iterator2 = course2.getIterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals("Английский язык")) {
                System.out.println("такая дисициплина есть");
            }
        }

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
