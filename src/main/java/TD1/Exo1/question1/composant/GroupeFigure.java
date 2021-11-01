package TD1.Exo1.question1.composant;


import java.util.ArrayList;
import java.util.List;

public class GroupeFigure  extends Figure{
     private List<Figure> figures=new ArrayList<>();

    public GroupeFigure(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(tab()+"Groupe Figure:"+name);
          for (Figure fi:this.figures){
              fi.operation();
          }
    }
    public Figure addFigure(Figure figure){
        figure.level=super.level+1;
        this.figures.add(figure);
        return figure;
    }
    public void removeFigure(Figure figure){
        this.figures.remove(figure);
    }

}
