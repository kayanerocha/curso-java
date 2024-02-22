package entities;

import java.util.Date;
import java.util.Objects;

public class Log {
	
	private People user;
	private Date instant;
	
	public Log(People user, Date instant) {
		this.user = user;
		this.instant = instant;
	}

	public People getUser() {
		return user;
	}

	public void setUser(People user) {
		this.user = user;
	}

	public Date getInstant() {
		return instant;
	}

	public void setInstant(Date instant) {
		this.instant = instant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		return Objects.equals(user, other.user);
	}

}
