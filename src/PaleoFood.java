import java.io.Serializable;
import java.util.Objects;

public abstract class PaleoFood implements Serializable {
    protected int calories, carbs;
    protected String name;

    public PaleoFood(int calories, int carbs, String name) {
        this.calories = calories;
        this.carbs = carbs;
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaleoFood paleoFood = (PaleoFood) o;
        return calories == paleoFood.calories && carbs == paleoFood.carbs && Objects.equals(name, paleoFood.name);
    }
}
