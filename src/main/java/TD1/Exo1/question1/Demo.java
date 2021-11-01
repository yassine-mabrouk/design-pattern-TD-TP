package TD1.Exo1.question1;


import TD1.Exo1.question1.composant.Cercle;
import TD1.Exo1.question1.composant.GroupeFigure;
import TD1.Exo1.question1.composant.Rectangle;
/*
 * ==================Description==================
 *Une figure peut être soit un cercle, un rectangle ou un groupe de figures.
 * Simple implimentation Design pattern composite
 * */
public class Demo {
    public static void main(String[] args) {
        // root groupe
        GroupeFigure root =new GroupeFigure("Root");
        // groupe 1
        GroupeFigure groupe1= (GroupeFigure) root.addFigure(new GroupeFigure("Groupe 1"));
        // groupe 2
        GroupeFigure groupe2= (GroupeFigure) root.addFigure(new GroupeFigure("Groupe 2"));
        // 2 element dans groupe 1
        groupe1.addFigure(new Cercle("Cercle 1"));
        groupe1.addFigure(new Rectangle("Regtangle 1"));
        // 2 element dans groupe 1
        groupe2.addFigure(new Cercle("Cercle 2"));
        groupe2.addFigure(new Rectangle("Regtangle 2"));

        root.operation();

    }

}
