import com.lesson.java.abstractAnimal.Aquila;
import com.lesson.java.abstractAnimal.Cane;
import com.lesson.java.abstractAnimal.Pinguino;

public class App {
    public static void main(String[] args) throws Exception {

        Pinguino pingu = new Pinguino();
        Aquila usa = new Aquila();
        Cane bobby = new Cane();

        pingu.dormi();
        pingu.mangia();

        usa.dormi();
        usa.mangia();

        bobby.dormi();
        bobby.mangia();

    }
}
