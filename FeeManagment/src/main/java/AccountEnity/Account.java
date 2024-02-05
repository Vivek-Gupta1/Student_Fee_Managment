package AccountEnity;

public class Account {
	private int sId;
	private String sName,sEmailId,sPassword,sAddress,sContact;
	
	public Account() {
		super();
	}
	public Account( String sName, String sEmailId, String sPassword, String sAddress, String sContact) {
		super();
		
		this.sName = sName;
		this.sEmailId = sEmailId;
		this.sPassword = sPassword;
		this.sAddress = sAddress;
		this.sContact = sContact;
	}

	public Account(int sId, String sName, String sEmailId, String sPassword, String sAddress, String sContact) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmailId = sEmailId;
		this.sPassword = sPassword;
		this.sAddress = sAddress;
		this.sContact = sContact;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmailId() {
		return sEmailId;
	}

	public void setsEmailId(String sEmailId) {
		this.sEmailId = sEmailId;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsContact() {
		return sContact;
	}

	public void setsContact(String sContact) {
		this.sContact = sContact;
	}

	@Override
	public String toString() {
		return "Account [sId=" + sId + ", sName=" + sName + ", sEmailId=" + sEmailId + ", sPassword=" + sPassword
				+ ", sAddress=" + sAddress + ", sContact=" + sContact + "]";
	}

	
	
	
	

}
