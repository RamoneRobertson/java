public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productionRate = 0.0;
        if(speed < 5){
            productionRate = speed * 221;
        }
        else if(speed <= 8){
            productionRate = speed * (221 * 0.9);
        }
        else if(speed == 9){
            productionRate = speed * (221 * 0.8);
        }
        else{
            productionRate = speed * (221 * 0.77);
        }

        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        double perHourRate = productionRatePerHour(speed);
        double perMinuteRate = perHourRate / 60;
        return (int) perMinuteRate;
    }
}
