package helloworld

class Quote {
	
	Date createTime
	Priority[] priorities
	HealthSituation[] healthSituations
	
	//static hasManyPriorities = [priorities: Priority]
	//static hasManyHealthSituations = [healthSituations: HealthSituation]
	
	static constraints = {
		createTime(nullable: false)
		priorities(nullable: true)
		healthSituations(nullable: true)
	}
	
	def String toString() {
		"($id: $createTime)"
	}

}
