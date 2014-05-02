package com.gyde
	
class PriorityController {
	
	Quote newQuote;

    def index() { 
		//render "Hello World"
		//Person person = new Person(firstName: 'John', lastName:'Doe', age:55)
		
		def criteria = 'checkbox-user-priorities'
		
		// GORM Where plus execute in one action
		def prioritiesQuery = KeyValue.where {
			keyID == criteria
		}
				
		[priorities: prioritiesQuery.list()]
	}
	
	def next() {
		def priorities = params.list('checkbox-user-priorities')
		Date currentDate = new Date()
		newQuote = new Quote(createTime:currentDate).save()
		
		
		for (priorityItem in priorities ) { 
			
			Priority newPriority = new Priority(priorityName: priorityItem, quote: newQuote)
			newPriority.save(failOnError: true)
		}
	
		redirect(controller: 'HealthSituation', action: 'index', params: [quote_id: newQuote.id ])
	}
	
}