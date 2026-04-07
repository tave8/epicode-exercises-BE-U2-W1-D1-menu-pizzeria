package giuseppetavella.D1_menu_pizzeria.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String nome;
    private final List<ElementoMenu> elementiMenu = new ArrayList<>();

    public Menu(String nome, List<ElementoMenu> elementiMenu) {
        this.nome = nome;
        this.aggiungiElementiMenu(elementiMenu);
    }
    
    public Menu(String nome) {
        this.nome = nome;
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
