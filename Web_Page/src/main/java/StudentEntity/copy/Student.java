package StudentEntity.copy;

public class Student {
	private int rollNo;
	private String name,emailId,sex,cource,address,contact;
	private double fee,paid,due;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, String emailId, String sex, String cource, String address, String contact,
			double fee, double paid, double due) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.emailId = emailId;
		this.sex = sex;
		this.cource = cource;
		this.address = address;
		this.contact = contact;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public double getDue() {
		return due;
	}

	public void setDue(double due) {
		this.due = due;
	}
	
	

}
