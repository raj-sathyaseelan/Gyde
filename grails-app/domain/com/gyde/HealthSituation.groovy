package com.gyde

class HealthSituation {
	
	String healthSituationName;
	static belongsTo = [quote: Quote]
	
	static constraints = {
		healthSituationName (blank: false)
	}

}