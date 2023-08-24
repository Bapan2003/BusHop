package com.example.BusHop.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFound{

	private String resourseName;
	private String fieldName;
	private String FieldValue;
	public ResourceNotFound(String resourseName, String fieldName, String fieldName2) {
		super();
		this.resourseName = resourseName;
		this.fieldName = fieldName;
		this.FieldValue = fieldName2;
	}
	public String getResourseName() {
		return resourseName;
	}
	public void setResourseName(String resourseName) {
		this.resourseName = resourseName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldValue() {
		return FieldValue;
	}
	public void setFieldValue(String fieldValue) {
		FieldValue = fieldValue;
	}
	
	
}