/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_  SmartPhoneTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author REALIFE
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SmartPhone[] a = {
				new IPhone("iPhone7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone s : a){
			System.out.println(s);
			s.turnOn();
			s.pay();
			s.useSpecialFunction();
			s.turnOff();
			System.out.println();
		}
		
	}

}
