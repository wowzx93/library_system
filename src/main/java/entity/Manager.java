package entity;

public class Manager {
	private int ManagerId;
	private String ManagerName;
	private String ManagerPwd;
	private short ManagerPower;

	public Manager(String managerName, String managerPwd, short managerPower) {
		super();
		ManagerName = managerName;
		ManagerPwd = managerPwd;
		ManagerPower = managerPower;
	}

	public Manager(int managerId, String managerName, String managerPwd, short managerPower) {
		super();
		ManagerId = managerId;
		ManagerName = managerName;
		ManagerPwd = managerPwd;
		ManagerPower = managerPower;
	}

	public Manager(String managerName, String managerPwd) {
		super();
		ManagerName = managerName;
		ManagerPwd = managerPwd;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}

	public String getManagerPwd() {
		return ManagerPwd;
	}

	public void setManagerPwd(String managerPwd) {
		ManagerPwd = managerPwd;
	}

	public short getManagerPower() {
		return ManagerPower;
	}

	public void setManagerPower(short managerPower) {
		ManagerPower = managerPower;
	}

	public int getManagerId() {
		return ManagerId;
	}

	@Override
	public String toString() {
		return "ManagerDao [ManagerId=" + ManagerId + ", ManagerName=" + ManagerName + ", ManagerPwd=" + ManagerPwd
				+ ", ManagerPower=" + ManagerPower + "]";
	}

}
