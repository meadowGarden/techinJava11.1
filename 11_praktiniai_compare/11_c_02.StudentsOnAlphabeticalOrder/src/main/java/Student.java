
public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        if (this.name() == human.getWage()) {
            return 0;
        } else if (this.getWage() < human.getWage()) {
            return 1;
        } else {
            return -1;
        }
    }
}
