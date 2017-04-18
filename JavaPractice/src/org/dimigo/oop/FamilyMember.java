/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_  FamiliyMember
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author REALIFE
 * @version : 1.0
 */
public class FamilyMember {

	private static int memberCnt = 0;
	private String memberName;
	
	public String getMemberName() {
		return memberName;
	}
	
	public FamilyMember(String memberName){
		memberCnt++;
	}

	public static void printMemberCnt(){
		System.out.println("가족 총 인원수 : " + memberCnt + "명");
	}
}
