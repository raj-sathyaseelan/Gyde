package com.gyde

class HealthSituationController {
	
	def index() {		
		def criteria = 'checkbox-healthsituations'
		
		// GORM Where plus execute in one action
		def healthSituationsQuery = KeyValue.where {
			keyID == criteria
		}
		
		def healthSituations = healthSituationsQuery.list()
		[healthSituations: healthSituations]
	}
	
	def next() {
		def healthSituations = params.list('checkbox-healthsituations')
		
		println ("params " + params)
		def quote_id = params["quote_id"]
		def quoteModel = Quote.get(quote_id)
				
		for (healthSituationItem in healthSituations ) {
			new HealthSituation(healthSituationName: healthSituationItem, quote: quoteModel  ).save()
		}
		
		redirect(controller: 'Personal', action: 'index', params: [quote_id: quote_id ])
	}
	
}
