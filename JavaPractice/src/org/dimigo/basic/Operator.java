/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_  Operator
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author REALIFE
 * @version : 1.0
 */
public class Operator {

	public static void main(String[] args) {

		long salary = 1700000, worker = 3, store = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", worker) + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개\n");
		
		System.out.println("연간 인건비 : " + String.format("%,d", salary*worker*12*store) + "원");
		
	}
}


