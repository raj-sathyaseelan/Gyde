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
		
		def quote_id_value = params["quote_id"]
		
		for (healthSituationItem in healthSituations ) {
			new HealthSituation(healthSituationName: healthSituationItem, quote:  Quote.get(quote_id) ).save()
		}
		
		redirect(controller: 'Person', action: 'index', params: [quote_id: quote_id_value ])
	}
	
}
