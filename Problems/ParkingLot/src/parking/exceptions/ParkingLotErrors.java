package parking.exceptions;

public enum ParkingLotErrors {

    SLOTS_NOT_FOUND_ERROR(500),
    VEHICLE_NOT_FOUND(500);

    final int code;

    ParkingLotErrors(int code) {
        this.code = code;
    }
}
