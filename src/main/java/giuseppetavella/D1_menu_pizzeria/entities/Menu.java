package giuseppetavella.D1_menu_pizzeria.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Menu {
    private final String nome;
    private final List<ElementoMenu> elementiMenu = new ArrayList<>();

    public Menu(@Qualifier("ottieniNomeMenu") String nome, 
                List<ElementoMenu> elementiMenu) 
    {
        this.nome = nome;
        this.aggiungiElementiMenu(elementiMenu);
    }
    

    /**
     * Stampa il menu.
     */
    public void stampaMenu() {
        System.out.println();
        System.out.println("******** START MENU '"+getNome()+"' **************");
        System.out.println();
        for(ElementoMenu elementoMenu : getElementiMenu()) {
            String msg = elementoMenu.toString();
            System.out.println(">  " + msg);
            System.out.println();
        }
        System.out.println();
        System.out.println("******** END MENU '"+getNome()+"' **************");
        System.out.println();
    }

    public List<ElementoMenu> getElementiMenu() {
        return elementiMenu;
    }

    public void aggiungiElementiMenu(List<ElementoMenu> elementiMenu) {
        for(ElementoMenu elementoMenu : elementiMenu) {
            aggiungiElementoMenu(elementoMenu);
        }
    }

    public void aggiungiElementoMenu(ElementoMenu elementoMenu) {
        elementiMenu.add(elementoMenu);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "elementiMenu=" + elementiMenu +
                ", nome='" + nome + '\'' +
                '}';
    }
}
