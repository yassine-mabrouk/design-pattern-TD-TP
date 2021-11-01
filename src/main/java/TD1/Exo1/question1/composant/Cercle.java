package TD1.Exo1.question1.composant;

public class Cercle extends Figure {

    public Cercle(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(tab()+"Circle:"+name);
    }

}
