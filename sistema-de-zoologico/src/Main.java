public class Main {
    public static void main(String[] args) {
        Leao l1 = new Leao();
        l1.setNome("Ed");
        l1.emitirSom();

        Leao l2 = new Leao();
        l2.setNome("Alan");
        l2.emitirSom();

        Elefante e1 = new Elefante();
        e1.setNome("George");
        e1.emitirSom();

        Elefante e2 = new Elefante();
        e2.setNome("Matt");
        e2.emitirSom();

        Urso u1 = new Urso();
        u1.setNome("Bruno");
        u1.emitirSom();

        Urso u2 = new Urso();
        u2.setNome("Nando");
        u2.emitirSom();

        Zoologico zoo = new Zoologico();
        zoo.setRazaoSocial("Zoológico Sol Nascente");

        zoo.getAnimais().add(l1);
        zoo.getAnimais().add(l2);
        zoo.getAnimais().add(e1);
        zoo.getAnimais().add(e2);
        zoo.getAnimais().add(u1);
        zoo.getAnimais().add(u2);

        Veterinario vet = new Veterinario();
        vet.setNome("Ricardo");
        vet.examinar(zoo.getAnimais());
    }
}