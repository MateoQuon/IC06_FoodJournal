import java.io.Serializable;
import java.util.Objects;

public class Meat extends PaleoFood implements Serializable {
    private int cookingTemp;
    private int type;

    public Meat(String name, int calories, int type, int carbs, int cookingTemp) {
        super(calories, carbs, name);
        this.cookingTemp = cookingTemp;
        this.type = type;
    }

    public int getCookingTemp() {
        return cookingTemp;
    }

    public void setCookingTemp(int cookingTemp) {
        this.cookingTemp = cookingTemp;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Meat meat = (Meat) o;
        return cookingTemp == meat.cookingTemp && type == meat.type;
    }



    @Override
    public String toString() {
        String meatType = "";
        if (type == 1)
                meatType = "Meat";
        if (type == 2)
                meatType = "Seafood";

        return meatType + ": " +
                name + ", " +
                calories + " calories, " +
                carbs + "g carbs, " +
                cookingTemp +" degrees F";
    }
}
