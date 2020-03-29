package ua.lviv.iot.firstlab_Farm;

public class FarmMaker {
    public static void main(String[] args) {

        Farm.numberOfPairs = 2500;
        final int ARRAY_LENGTH = 4;

        Farm firstFarm = new Farm();
        Farm secondFarm = new Farm("Novomaydanets'ke, Talnyvskyi district, Cherkasy region", 2380, 400, "Renaissance", 54, 2300);
        Farm thirdFarm = new Farm("Shpola city, Cherkasy region",23421, 226.5, 5235);

        System.out.println(firstFarm);
        System.out.println("");
        System.out.println(secondFarm);
        System.out.println("");
        System.out.println(thirdFarm);

        System.out.println("");

        System.out.println(firstFarm.printNumberOfPairs());
        System.out.println(Farm.printStaticNumberOfPairs());

        System.out.println("");

        Farm[] arrayOfFarms = new Farm[ARRAY_LENGTH];

        int index = 0;
        do {
            arrayOfFarms[index] = new Farm();
            index++;
        } while (index < ARRAY_LENGTH);

        for (Farm newIndex : arrayOfFarms) {
            newIndex.toString();
            System.out.println(newIndex.toString() + "\n");
        }
    }


}
