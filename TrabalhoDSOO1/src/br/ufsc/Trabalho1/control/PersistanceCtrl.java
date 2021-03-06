package br.ufsc.Trabalho1.control;
import java.util.ArrayList;

import br.ufsc.Trabalho1.model.Member;
import br.ufsc.Trabalho1.model.Positions;
import br.ufsc.Trabalho1.model.Staff;
import components.persistence.*;

public class PersistanceCtrl {
	
	private static final PersistanceCtrl instance = new PersistanceCtrl();
	private MemoryPersistance memberList;
	private MemoryPersistance staffList;
	private MemoryPersistance usernameList;
	
	public PersistanceCtrl() {
		this.memberList = new MemoryPersistance(new ArrayList<Member>());
		this.staffList = new MemoryPersistance(new ArrayList<Staff>());
		this.usernameList = new MemoryPersistance(new ArrayList<String>());
		add(new Staff("23123", "123", "Administrator", "2112", "rua " ,"9999999", Positions.ADMIN, "12233", "admin", "admin"));
		add(new Staff("24214", "124", "Instructor", "2113", "rei", "99999999" , Positions.INSTRUCTOR, "13333", "employee", "employee"));
		
	}

	public ArrayList getStaffList() {
		return staffList.getList();
	}
	
	public ArrayList getMemberList() {
		return memberList.getList();
	}
	
	public  ArrayList getUsernameList() {
		return usernameList.getList();
	}
	
	public void add(Member member) {
		memberList.add(member);
	}
	
	public void add(Staff staff) {
		staffList.add(staff);
		usernameList.add(staff.getUsername());
		
	}
	
	public void remove(Member member) {
		memberList.remove(member);
	}
	
	public void remove(Staff staff) {
		staffList.remove(staff);
		usernameList.remove(staff.getUsername());
	}

	public static PersistanceCtrl getInstance() {
		return instance;
	}
	
	
}
