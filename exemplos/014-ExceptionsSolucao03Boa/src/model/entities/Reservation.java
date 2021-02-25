package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Checkout date must be after checkIn date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException{ // metodo que propaga exceção

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Update dates must be in future");
        }

        if (!checkOut.after(checkIn)) {
            throw new DomainException("Checkout date must be after checkIn date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration(){
        long diff = this.checkOut.getTime() - this.checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomNumber=" + roomNumber +
                ", checkIn=" + sdf.format(checkIn) +
                ", checkOut=" + sdf.format(checkOut) +
                ", " + duration() + " nights" +
                '}';
    }
}
