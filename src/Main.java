//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University university = new University();

        Employee dean = new AdministrativeEmployee(1, "Kirill Romanyuk", "rromaniukk@mail.ru");
        Faculty faculty = new Faculty("Faculty of Computer Science", dean);
        university.addFaculty(faculty);

        Institute institute = new Institute("VSU", "Student 1st");
        faculty.addInstitute(institute);

        ResearchAssociate researcher = new ResearchAssociate(2, "Michail His", "mich@mich.com", "Computer Science");
        institute.setResearchAssociate(researcher);

        university.displayFaculties();
        faculty.displayInstitutes();
    }
}