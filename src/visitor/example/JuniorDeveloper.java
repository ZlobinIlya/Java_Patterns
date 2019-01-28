package visitor.example;

public class JuniorDeveloper implements Developer{

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writting poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database....");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test...");
    }
}


