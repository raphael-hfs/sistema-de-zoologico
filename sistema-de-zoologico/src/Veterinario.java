import java.util.ArrayList;

public class Veterinario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void examinar(Animal animal) {
        System.out.println("Examinando " + animal.getNome());
        animal.emitirSom();
        System.out.println("Animal examinado!");
    }

    public void examinar(ArrayList<Animal> animais) {
        for (Animal i : animais) {
            examinar(i);
        }
    }
}
