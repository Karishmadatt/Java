package com.jsp.CRUD.Driver;

import com.jsp.CRUD.model.Crush;
import com.jsp.CRUD.utility.utility;

public class insert {
public static void main(String[] args) {
	Crush crush = new Crush();
	crush.setId(2);
	crush.setName("Doremon");
	crush.setIg_id(null);
	crush.setNo_of_ex(0);
	crush.setStatus(false);
	
	utility.entityTransaction.begin();
	utility.entityManager.persist(crush);
	utility.entityTransaction.commit();
}
}
