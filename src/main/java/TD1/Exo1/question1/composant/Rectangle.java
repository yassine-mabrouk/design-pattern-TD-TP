package TD1.Exo1.question1.composant;

import TD1.Exo1.question1.composant.Figure;

public class Rectangle extends Figure {

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(tab()+"Rectangle:"+name);
    }

}
