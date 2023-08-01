package model.entities;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer number;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation() {
		
	}

	public Reservation(Integer number, Date checkin, Date checkout) {
		this.number = number;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Room ");
		sb.append(number);
		sb.append(", check-in: ");
		sb.append(sdf.format(checkIn));
		sb.append(", check-out: ");
		sb.append(sdf.format(checkOut));
		sb.append(", ");
		sb.append(duration());
		sb.append(" nights");
		
		return sb.toString();
	}
	
	public Integer duration() {		
		/*
		 * Solução alternativa:
		 * long diff = checkOut.getTime() - checkIn.getTime();
		 * return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		 */
		Duration t = Duration.between(checkIn.toInstant(), checkOut.toInstant());
		return (int) t.toDays();
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			return "Reservation dates for update must be future dates";
		}
		if (!checkOut.after(checkIn)) {
			return "Check-out date must be after checkin date";
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
	}

}
