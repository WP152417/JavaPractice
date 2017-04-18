/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_  PiggyBankTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author REALIFE
 * @version : 1.0
 */
public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember father = new FamilyMember("아빠");
		FamilyMember mother = new FamilyMember("엄마");
		FamilyMember me = new FamilyMember("나");
		FamilyMember brother = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney("아빠", 10000);
		PiggyBank.putMoney("엄마", 5000);
		PiggyBank.putMoney("나", 2000);
		PiggyBank.putMoney("남동생", 1000);
		PiggyBank.printBalance();
		
		PiggyBank.putMoney("나", 1000);
		PiggyBank.printBalance();
		
	}

}
