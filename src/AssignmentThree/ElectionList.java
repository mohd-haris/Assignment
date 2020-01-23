package AssignmentThree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ElectionList {
	


	public static void main(String[] args) {
		HashSet<Election> election=new HashSet<Election>();
		
		election.add(new Election(1,"BJP","23MAR","JAIPUR","haha","13"));
		election.add(new Election(2,"CONGGRESS","23MAR","JAIPUR","haha","16"));
		election.add(new Election(3,"OTHERS","13JAN","MAKRANA","wow","13"));
		election.add(new Election(3,"OTHERS","15JAN","MAKRANA","wow","13"));
		election.add(new Election(4,"OTHERS","14JAN","MAKRANA","wow","13"));
		
		System.out.println(election);
		
		List<String> arrlist = new ArrayList<String>();
		
		ArrayList<String> sameDate=new ArrayList<String>();
		
		System.out.println("Parties with same date");
		for(Election e :election)
			{
			if(arrlist.contains(e.getElectiondate())) 
			{	
				sameDate.add(e.getElectiondate());	
			}
			arrlist.add(e.getElectiondate());	
			}
	for(Election d :election)
	{
		if(sameDate.contains(d.getElectiondate()))
		{
			System.out.println(d);
		}
	}
	
	}

}
