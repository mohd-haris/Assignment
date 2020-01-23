package AssignmentThree;

public class Election 
{
	private int Electionid;
	private String partyName;
	private String electiondate;
	private String District;
	private String Constituency;
	private String Countingdate;
	
	
		public Election(int electionid, String name, String electiondate, String district, String constituency,
			String countingdate)
	{
		super();
		Electionid = electionid;
		this.partyName = name;
		this.electiondate = electiondate;
		District = district;
		Constituency = constituency;
		Countingdate = countingdate;
	}
		public int getElectionid() 
		{
		return Electionid;
		}
		
		public void setElectionid(int electionid) 
		{
		Electionid = electionid;
		}
		
		public String getPartyName() 
		{
		return partyName;
		}
		
		public void setPartyName(String name) 
		{
		this.partyName = name;
		}
		
		public String getElectiondate() 
		{
		return electiondate;
		}
		
		public void setElectiondate(String electiondate) 
		{
		this.electiondate = electiondate;
		}
		
		public String getDistrict() 
		{
		return District;
		}
		
		public void setDistrict(String district) 
		{
		District = district;
		}
		public String getConstituency() 
		{
		return Constituency;
		}
		public void setConstituency(String constituency) 
		{
		Constituency = constituency;
		}
		public String getCountingdate() 
		{
		return Countingdate;
		}
		public void setCountingdate(String countingdate) 
		{
		Countingdate = countingdate;
		}
	@Override
	public String toString() {
		return "Election \n[Electionid=" + Electionid + ", name=" + partyName + ", electiondate=" + electiondate
				+ ", District=" + District + ", Constituency=" + Constituency + ", Countingdate=" + Countingdate + "]";
	}
	
	
	public int hashCode() {
		return partyName.hashCode();
	}
	
	public boolean equals(Object o) {
		
		boolean flag=false;
		if(o instanceof Election) {
			Election p=(Election)o;
			
			if(p.partyName==this.partyName) {
				flag=true;
			}
		}
		return flag;
	}
	

}
