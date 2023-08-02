package model.entities;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import model.exceptions.DomainException;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer number;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation() {
		
	}

	public Reservation(Integer number, Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			// Lança uma exceção de quando os argumentos são inválidos
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after checkin date");
		}
		this.number = number;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
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
	
	// Propaga a exceção com throws DomainException pois o método não vai tratar ela, mas sim o programa principal
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			// Lança uma exceção de quando os argumentos são inválidos
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after checkin date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

}
