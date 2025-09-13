package com.arya_panda.oops_assignment;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

	public static void main(String[] args) throws CHECK_NAME, CHECK_JOURNAL_ID, ISSUE_NUMBER, CHECK_ISSN {
		List <String[]> list = new ArrayList<String[]>();		
		list.add(new String[]{"JournalOfTheoreticalAndAppliedPhysics", "JTAP2025", "Volume 19", "1134-4648"});
		list.add(new String[]{"Astrobiology", "AST-BIO-01", "Issue 2", "2161-4008"});
		list.add(new String[]{"Genetics", "GEN201", "SpecialEditionForInternationalConference", "1943-2631"});
		list.add(new String[]{"Immunology", "IMM556", "Vol 10", "1365-256"});
		list.add(new String[]{"Ecology","ECL789","Vol 22 Issue 4", "0012-9658"});
		
		List <Journal> validJournal = new ArrayList<Journal>();
		for (String[] data : list) {
            try {
                Journal journal = new Journal(data[0], data[1], data[2], data[3]);
                validJournal.add(journal);
                System.out.println("SUCCESS: Journal '" + data[0] + "' is valid and has been added.");

            } catch (CHECK_NAME | CHECK_JOURNAL_ID | ISSUE_NUMBER | CHECK_ISSN e) {

                System.out.println("FAILED: Could not create journal '" + data[0] + "'. Reason: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred for journal '" + data[0] + "': " + e.getMessage());
            }
        }
		
		
		 if (validJournal.isEmpty()) {
	            System.out.println("No valid journals were found.");
	        } else {
	            for (Journal journal : validJournal) {
	                System.out.println(journal);
	            }
	            
	        }

	}

	

}
