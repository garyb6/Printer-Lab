public class WaterBottle {
    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }
    public int getVolume(){
        return this.volume;
    }
    public int takeDrink(int amount){
        int total = 0;
        if (this.volume >= amount) {
            total = this.volume - amount;
        }
        return total;
    }
    public int setWaterBottleVolume(int num1){
        return this.volume = num1;
    }
}
