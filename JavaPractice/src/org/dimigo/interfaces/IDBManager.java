/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *    |_  IDBManager
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author REALIFE
 * @version : 1.0
 */
public interface IDBManager {
	
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	
	public abstract void insert();
	public abstract void search();
	public abstract void update();
	public abstract void delete();
	
	public static IDBManager getDBObject(String database){

		IDBManager a = null;
		
		if(database.equals(ORACLE_DATABASE)){
			 a = new OracleDB();
		}
		else if(database.equals(SYBASE_DATABASE)){
			a = new SybaseDB();
		}
		
		return a;

	}

}
