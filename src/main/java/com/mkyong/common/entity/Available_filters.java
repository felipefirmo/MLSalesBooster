
package com.mkyong.common.entity;

import java.util.List;

public class Available_filters{
   	private String id;
   	private String name;
   	private String type;
   	private List values;

 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
 	public List getValues(){
		return this.values;
	}
	public void setValues(List values){
		this.values = values;
	}
}
