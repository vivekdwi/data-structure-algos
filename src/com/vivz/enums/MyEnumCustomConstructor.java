package com.vivz.enums;

/**
 * @author Vivz
 *
 */
public class MyEnumCustomConstructor {
	
	enum Department{
		ACCOUNT(12), HR(24), SECURITY(36), FINANCE(48);
		
		private int deptId;

		Department(int id){
			this.deptId=id;
		}
		
		public int getDeptId() {
			return deptId;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Account dept id : "+Department.ACCOUNT.getDeptId());
		System.out.println("HR dept id : "+Department.HR.getDeptId());
		System.out.println("Finance dept id : "+Department.FINANCE.getDeptId());
		System.out.println("Security dept id : "+Department.SECURITY.getDeptId());
	}
}
