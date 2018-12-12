package com.cm.cmdc.framework.service.base.web;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.StringUtils;

public class DateEditor extends PropertyEditorSupport {  
	private static SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");  
	private static SimpleDateFormat timeformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    @Override  
    public void setAsText(String text) throws IllegalArgumentException {  
        Date date = null;  
        if(StringUtils.isEmpty(text)){
        	setValue(null);
        	return;        	
        }
        try{
	        if(text.length()>13){
	        	date = timeformat.parse(text);          	
	        }else{
	        	date = dateformat.parse(text);
	        }  
        }catch(Exception e){
        	e.printStackTrace();
        }
        setValue(date);  
    }  
    
	@Override
	public String getAsText() {
		Date value = (Date)getValue();
		return (value != null ? timeformat.format(value) : "");
	}
}  