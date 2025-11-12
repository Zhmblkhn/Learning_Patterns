package FacadePattern.STO;

public class STOFacade {
    private Stoshnic stoshnic;
    private Engine engine;
    private Xodovka xodovka;

    public STOFacade() {
        stoshnic = new Stoshnic();
        engine = new Engine();
        xodovka = new Xodovka();
    }

    public void updateCar() {
        stoshnic.remontCar();
        engine.setNewEngine();
        xodovka.setNewXodovka();

        System.out.println("Car updated");
    }
}
