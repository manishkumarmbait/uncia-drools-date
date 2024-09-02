package com.unciadroolsdate.model;

import java.util.Date;

public class DateModel {

	private Date inputDate;
	private Date currentDate;

	public DateModel() {
	}

	public DateModel(Date inputDate, Date currentDate) {
		super();
		this.inputDate = inputDate;
		this.currentDate = currentDate;
	}

	public Date getInputDate() {
		return inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

}
