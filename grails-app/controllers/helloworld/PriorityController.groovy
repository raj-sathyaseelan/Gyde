package helloworld

class PriorityController {

    def index() { 
		//render "Hello World"
		//Person person = new Person(firstName: 'John', lastName:'Doe', age:55)
		
		Date currentDate = new Date()
		Quote newQuote = new Quote(createTime:currentDate).save()		
		
	}
	
	def next() {
		def priorityIds = params.list('checkbox-user-priorities')
		
		render priorityIds
		
		//Priority newPriority = new Priority()
		
		//Person person = new Person(sex:'M', age:'35').save()
		//[ person:person ]
		//redirect(healths)
	}
	
	def hi() {
		render "how are you?"
	}
	
}