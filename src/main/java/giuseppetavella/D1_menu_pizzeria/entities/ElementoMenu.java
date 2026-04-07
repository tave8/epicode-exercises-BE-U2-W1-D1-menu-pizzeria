package giuseppetavella.D1_menu_pizzeria.entities;

public abstract class ElementoMenu {
    private final String nome;
    private final double calorie;
    
    public ElementoMenu(String nome, double calorie) {
        this.nome = nome;
        this.calorie = calorie;
    }

    public double getCalorie() {
        return calorie;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "ElementoMenu{" +
                "calorie=" + calorie +
                ", nome='" + nome + '\'' +
                '}';
    }
}
