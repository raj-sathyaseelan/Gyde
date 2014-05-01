package com.gyde;

class Person {
	
    String sex
	String email
    int age
	
	static belongsToQuote = [quote: Quote]
	
	static constraints = {
		sex(blank: false, , size: 2..2)
		age(blank: false, size: 1..3, validator: {val, obj -> val?.isNumber()})
		email(blank: false)
		
		/*moveInDate(nullable: false, max:  new Date())
		moveOutDate(nullable: true, validator: { val, obj ->
			val?.after(obj.moveInDate)
		})*/
	}
	
}