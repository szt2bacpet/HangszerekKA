package music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        this.numberOfStrings = 6;
        this.name = "Electric Guitar";
    }

    @Override
    public void sound() {
        System.out.println("Twang");
    }
}

