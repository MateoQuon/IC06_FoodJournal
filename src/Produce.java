import java.io.Serializable;
import java.util.Objects;

public class Produce extends PaleoFood implements Serializable {
    private int organic;

    public Produce(int calories, int carbs, String name, int organic) {
        super(calories, carbs, name);
        this.organic = organic;
    }

    public int getOrganic() {
        return organic;
    }

    public void setOrganic(int organic) {
        this.organic = organic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Produce produce = (Produce) o;
        return organic == produce.organic;
    }

    @Override
    public String toString() {
        String produceType = "";
        if (organic == 1)
            produceType = "Organic Produce";
        if (organic == 2)
            produceType = "Produce";

        return ": " +
                name + ", " +
                calories + " calories, " +
                carbs + " carbs";
    }
}
