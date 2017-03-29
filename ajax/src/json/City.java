package json;

public class City {
	private Integer cid;
	private String cname;
	
	public City() {
		super();
	}

	public City(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		return "{'cid':"+this.getCid()+",'cname':'"+this.getCname()+"'}";
	}
	
}	
