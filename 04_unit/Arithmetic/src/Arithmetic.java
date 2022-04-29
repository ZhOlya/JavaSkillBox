public class Arithmetic {
    private int x;
    int y;

    Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        int result = x + y;
        return result;
    }
    public int mult() {
        int result = x * y;
        System.out.println("mult = " + result);
        return result;
    }
    public int max() {
        if(x > y){
            System.out.println("max = " + x);
            return x;
        }
        else {
            System.out.println("max = " + y);
            return y;
        }
    }
    public int min() {
        if (x < y) {
            System.out.println("min = " + x);
            return x;
        }
        else {
            System.out.println("min = " + y);
            return y;
        }
    }

}

