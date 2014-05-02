package com.gyde;

class Person {
	
    String sex
	String email
    int age
	
	String toString() {
		"${email}"
	}

	static belongsTo = [quote: Quote]
	
	static constraints = {
		sex(blank: false, , size: 1..1, inList: ["M", "F"])
		age(blank: false, size: 1..3, validator: {val, obj -> val?.isNumber()})
		email(blank: false)
	}
	
}