package com.jsp.oto.view;

import com.jsp.oto.controller.controller;
import com.jsp.oto.model.car;
import com.jsp.oto.model.engine;

public class view {
  public static void main(String[] args) {
	controller control = new controller();
	car c = new car();
	engine e = new engine();
	   c.setId(1);
	   c.setCar_name("Thar");
	   c.setCost(500000);
	   c.setChassis(null);
	   e.setCc(111);
	   e.setId(1);
	   e.setNo_of_cylinder(1);
	   c.setEng(e);
	   control.insert(c, e);
}
}
