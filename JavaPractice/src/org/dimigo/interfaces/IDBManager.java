/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @authur      : Kwon
 * @version     : 1.0
 */
public interface IDBManager {

	
	public static final String ORACLEDATABASE = "ORACLE";	
	public static final String SYBASEDATABASE = "SYBASE";
	
	
	public void insert();
	
	public void search();
	
	public void update();
	
	public void delete();
	
	static IDBManager getDBObject(String database){
		if(database==ORACLEDATABASE){
			return new OracleDB();
		}
		else {
			return new SybaseDB();
		}
	}
	
	
}
