package servlet;

public class Bean {
	private String name;
	private String company;
	private String address;
	private String info;
	private String[] infoType;
	private String yesNo;

	public Bean() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Bean(String name, String company, String address, String info, String[] infoType, String yesNo) {
		super();
		this.name = name;
		this.company = company;
		this.address = address;
		this.info = info;
		this.infoType = infoType;
		this.yesNo = yesNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String[] getInfoType() {
		return infoType;
	}

	public void setInfoType(String[] infoType) {
		this.infoType = infoType;
	}

	public String getYesNo() {
		return yesNo;
	}

	public void setYesNo(String yesNo) {
		this.yesNo = yesNo;
	}

}
