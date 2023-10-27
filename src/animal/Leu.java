package animal;

public class Leu implements Carnivor {
    @Override
    public String manancaCarne(String nume, int kg) {
        return "Mananca Carne " + nume + " " + kg + " kilograme";
    }
}
