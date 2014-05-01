package com.gyde

class Quote {
	
	Date createTime
	Priority[] priorities
	HealthSituation[] healthSituations
	
	static hasMany = [Priority, HealthSituation]
	
	static constraints = {
		createTime(nullable: false)
		priorities(nullable: true)
		healthSituations(nullable: true)
	}
	
	def String toString() {
		"($id: $createTime)"
	}

}
