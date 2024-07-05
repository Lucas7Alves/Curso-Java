package Model.entites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Model.entites.Exception.DomainException;

public class Reservation {
  private Integer roomNumber;
  private Date checkIn;
  private Date checkOut;

  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  //contructors
  public Reservation(){
  }
  public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
    if (!checkOut.after(checkIn)) {
      throw new DomainException("Error in reservation: Check-out date must be after check-in date");
  }
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  //method
  public long duration() {
    long diff = checkOut.getTime() - checkIn.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
  }

  public void updateReservation(Date checkIn, Date checkOut) throws DomainException {
    Date now = new Date();
    if (checkIn.before(now) || checkOut.before(now)) {
        throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
    } else  if (!checkOut.after(checkIn)) {
        throw new DomainException("Error in reservation: Check-out date must be after check-in date");
    }
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  @Override
  public String toString() {
    return "Room "
            + roomNumber
            + ", check-in: "
            + sdf.format(checkIn)
            + ", check-out: "
            + sdf.format(checkOut)
            + ", "
            + duration()
            + " nights";
  }

  //getters and setters
  public Integer getRoomNumber() {
    return roomNumber;
  }
  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }
  public Date getcheckIn() {
    return checkIn;
  }
  public Date getCheckOut() {
    return checkOut;
  }

  
}
