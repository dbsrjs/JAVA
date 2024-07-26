package level4Exam;

public class Motorcycle implements Movable {
    private Double fuel;
    private FuelType fuelType;

    public Motorcycle(Double fuel, FuelType fuelType) {
        this.fuel = fuel;
        this.fuelType = fuelType;
    }

    @Override
    public void move(Double distance) {
        if(fuelType.calculateRequiredFuel(distance) <= fuel) {
            //연료가 주어진 거리만큼 이동할 수 있는 경우
            System.out.println("오토바이가 " + distance + " 만큼 이동했습니다. 남은 연료: " + fuel);
        }

        else
            //연료가 주어진 거리를 이동할 수 없는 경우
            System.out.println(distance + "만큼 이동하기에 연료가 충분하지 않습니다.");
    }

    public Double getRemainingFuel() {
        return fuel;
    }

    @Override
    public TransportType getTransportType() {
        return TransportType.MOTORCYCLE;
    }
}
