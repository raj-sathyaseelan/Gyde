package com.gyde

class Priority {
	String priorityName
	
	static belongsTo = [quote: Quote]
	
	static constraints = {
		priorityName (blank: false)
	}
	
}
