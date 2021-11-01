package TD1.Exo1.question1.composant;

import lombok.Data;

@Data
public abstract class Figure {
       protected String name ;
       protected int level ;

    public Figure(String name) {
        this.name = name;
    }
    public abstract  void operation();
    public  String tab(){
        String tab="";
        for (int i=0;i<level;i++){
             tab+="\t";
        }
        return tab;
    }
}
