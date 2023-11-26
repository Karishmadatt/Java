package com.jsp.drishti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class model {
    @Id
    private String Link;
    private String Month;
    private boolean IsDownloaded;
    
   public model() {
	   
   }

public String getLink() {
	return Link;
}

public void setLink(String link) {
	Link = link;
}

public String getMonth() {
	return Month;
}

public void setMonth(String month) {
	Month = month;
}

public boolean isIsDownloaded() {
	return IsDownloaded;
}

public void setIsDownloaded(boolean isDownloaded) {
	IsDownloaded = isDownloaded;
}
   
}
