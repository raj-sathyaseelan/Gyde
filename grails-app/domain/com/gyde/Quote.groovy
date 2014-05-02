package com.gyde

class Quote {
	
	Date createTime

	static hasMany = [prorities: Priority, healthSituations: HealthSituation]
	
	static constraints = {
		createTime(nullable: false)
	}
	
	def String toString() {
		"($id: $createTime)"
	}

}
