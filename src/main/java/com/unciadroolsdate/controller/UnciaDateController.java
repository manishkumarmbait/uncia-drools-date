package com.unciadroolsdate.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unciadroolsdate.model.DateModel;
import com.unciadroolsdate.service.UnciaDateService;

@RestController
@RequestMapping("/ruleservice")
public class UnciaDateController {

	@Autowired
	private UnciaDateService unciaDateService;

	@PostMapping("/getDate")
	//public ResponseEntity<String> getDate(@RequestBody DateModel date) {
	public ResponseEntity<String> getDate(@RequestBody DateModel dateModel) throws ParseException {
		//SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

           // Date inputDate1 = dateFormat.parse(inputDate);

           //DateModel dateModel = new DateModel();
//            dateModel.setInputDate(inputDate1);
            dateModel.setCurrentDate(new Date());
//            System.out.println("inputDate1 : "+dateModel.getInputDate());
//            System.out.println("Current Date : "+dateModel.getCurrentDate());
		String account = unciaDateService.getResponse(dateModel);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}
}
