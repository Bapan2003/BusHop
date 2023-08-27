package com.example.BusHop.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException{

	private String resourseName;
	private String fieldName;
	private Long FieldValue;
	public ResourceNotFound(String resourseName, String fieldName, Long id) {
		super(String.format("%s Not Found With %s : %s",resourseName,fieldName,id));
		this.resourseName = resourseName;
		this.fieldName = fieldName;
		this.FieldValue = id;
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
	public Long getFieldValue() {
		return FieldValue;
	}
	public void setFieldValue(Long fieldValue) {
		FieldValue = fieldValue;
	}
	
	
}