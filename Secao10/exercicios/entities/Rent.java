package entities;

public class Rent {
	
	private Student student;
	private int room;
	
	public Rent(Student student, int room) {
		super();
		this.student = student;
		this.room = room;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

}
