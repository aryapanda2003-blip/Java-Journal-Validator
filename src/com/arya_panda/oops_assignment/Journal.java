package com.arya_panda.oops_assignment;



public class Journal {
//	CHECK_NAME, CHECK_JOURNAL_ID, and ISSUE-NUMBER, CHECK_ISSN
	private String journalName;
	private String journalId;
	private String issueNumber;
	private String issnNumber;
	
	public Journal(String journalName, String journalId, String issueNumber, String issnNumber) throws CHECK_NAME, CHECK_JOURNAL_ID, ISSUE_NUMBER, CHECK_ISSN {
		setJournalName(journalName);
		setJournalId(journalId);
		setIssueNumber(issueNumber);
		setIssnNumber(issnNumber);
	}

	public void setJournalName(String journalName) throws CHECK_NAME {
		if(journalName.length() > 30) {
			throw new CHECK_NAME("Journal Length should not exceed 30");
		}
		
		char[] charArray = journalName.toCharArray();
		
		for(char ch : charArray) {
		
			if(!Character.isLetter(ch)) {
				throw new CHECK_NAME("Special characters not allowed");
			}
		}
		
		this.journalName = journalName;
	}


	public void setJournalId(String journalId) throws CHECK_JOURNAL_ID {
		char[] charArray = journalId.toCharArray();
		for(char ch :charArray) {
			if(!(Character.isLetterOrDigit(ch))) {
				throw new CHECK_JOURNAL_ID("Special characters are not allowed");
			}
		}
				
		this.journalId = journalId;
	}
	
	
	public void setIssueNumber(String issueNumber) throws ISSUE_NUMBER {
		if(issueNumber.length()>20) {
			throw new ISSUE_NUMBER("Issue Number muct not exceed 20 characters");
		}
		this.issueNumber = issueNumber;
	}

	public void setIssnNumber(String issnNumber) throws CHECK_ISSN {
		boolean containHypen = issnNumber.contains("-");
		
		if(!containHypen) {
			throw new CHECK_ISSN ("ISSN number muct contacin Hyphen(-)");
		}
		
		if(issnNumber.length()!=9) {
			throw new CHECK_ISSN ("ISSN number should not exceed 9 characters");
		}
		
		this.issnNumber = issnNumber;
	}
	
	public String toString() {
		return String.format("Journal Name:		%s"
				+ "\nJournal ID:		%s"
				+ "\nJournal Issue Number:	%s"
				+ "\nJournal ISSN Number:	%s",journalName, journalId,issueNumber,issnNumber);
	}
	

}
