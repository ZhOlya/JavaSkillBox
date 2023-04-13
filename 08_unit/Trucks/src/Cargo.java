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
       int currentBoxNum = 0; // порядковый номер ящиков
      int currentContainerNum = 0;// порядковый номер контейнеров

        for( int numberOftruck = 1; numberOftruck <= truck; numberOftruck++){
            System.out.println( "Грузовик " + numberOftruck +":");
            for (int containerNum = 1; containerNum <= 12; containerNum++){
                if (container <= currentContainerNum)
                    break;
                System.out.println("\t" + "Контейнер " + ++currentContainerNum + ":");
                for (int boxNum = 1; boxNum <= 27; boxNum++){
                    if (box <= currentBoxNum)
                        break;
                    System.out.println("\t" + "\t" + "\t" +" Ящик " + ++currentBoxNum);
                }
            }
        }
    }


}
