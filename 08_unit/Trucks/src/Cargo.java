import java.security.PublicKey;

public class Cargo {
    //Представьте, что вы доставляете груз в ящиках одинакового размера.
    // У вас есть грузовики и контейнеры. В каждый грузовик помещается максимум 12 контейнеров.
    // В каждый контейнер — не более 27 ящиков. Ящики, контейнеры и грузовики пронумерованы.

    int box;
    int container;
    int truck;

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public int getContainer() {
        return container;
    }

    public void setContainer(int container) {
        this.container = container;
    }

    public int getTruck() {
        return truck;
    }

    public void setTruck(int truck) {
        this.truck = truck;
    }

    //Cargo (int box){
    //    this.box = box;
    //}

    public void calculate(){
            container = box / 27;
            if ((box % 27) > 0) {
                container++;
            }

            truck = container / 12;
            if ((container % 12) > 0) {
                truck++;
            }

    }

    public void result(){
        if (box > 0){
            calculate();
            System.out.println("Количество ящиков - " + box + System.lineSeparator() +
                    "Необходимо: "+ System.lineSeparator() +
                    "Количесство контейнеров - " + container + System.lineSeparator() +
                    "Количество грузовиков - " + truck );
        } else {
            System.out.println("Недопустимое количество ящиков");
        }

    }
    public void numbering (){
        int boxNum = 0; // порядковый номер ящиков
        int containerNum = 0;// порядковый номер контейнеров
        for( int i = 1; i <= truck; i++){
            System.out.println( "Грузовик " + i +":");
            for (int y = 1; y <= 12; y++){
                if (container <= containerNum)
                    break;
                System.out.println("\t" + "Контейнер " + ++containerNum + ":");
                for ( int z = 1; z <= 27; z++){
                    if (box <= boxNum)
                        break;
                    System.out.println("\t" + "\t" +" Ящик " + ++boxNum);
                }
            }
        }
    }


}
