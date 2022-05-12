import java.util.Objects;

public class Check {
    public int x = 4;
    public int y = 8;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Check check = (Check) o;
        return x == check.x && y == check.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
