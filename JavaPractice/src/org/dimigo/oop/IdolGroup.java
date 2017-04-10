/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_  IdolGroup
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 10.
 * </pre>
 *
 * @author REALIFE
 * @version : 1.0
 */
public class IdolGroup {

	public static void main(String[] args) {
		
		String[] groupArray = {"빅뱅", "2NE1", "걸스데이"};
 		String[][] idolArray = {
				{"GD", "태양", "대성", "탑", "승리"}, 
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		
		for(int i = 0; i < idolArray.length; i++){
			System.out.println("<<" + groupArray[i] + ">>");
			for(int j = 0; j < idolArray[i].length; j++){
				System.out.println(idolArray[i][j]);
			}
			System.out.println();
		}
	};

}
