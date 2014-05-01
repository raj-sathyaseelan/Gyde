package com.gyde

class HealthSituationController {

	Quote quote
	
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
		
		quote = params.list.('quote').get(0)
		
		for (healthSituationItem in healthSituations ) {
			
			HealthSituation healthSituation = new HealthSituation(disease: healthSituationItem, quote: quote).save()
		};
		
		redirect(controller: 'Personal', action: 'index', params: params)
	}
	
}
