package giuseppetavella.D1_menu_pizzeria.entities;

import java.util.List;

public class Menu {
    private final String nome;
    private List<ElementoMenu> elementiMenu;
    
    public Menu(String nome) {
        this.nome = nome;
    }

    public List<ElementoMenu> getElementiMenu() {
        return elementiMenu;
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
