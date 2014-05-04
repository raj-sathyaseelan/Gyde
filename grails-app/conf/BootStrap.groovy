import com.gyde.KeyValue

class BootStrap {

    def init = { servletContext ->
		
		// Check whether the test data already exists.
		if (!KeyValue.count()) {
			
			//priority/index.gsp
			new KeyValue (keyID: 'checkbox-user-priorities', value: 'Save Money' ).save(failOnError: true)
			new KeyValue (keyID: 'checkbox-user-priorities', value: 'Better Coverage').save(failOnError: true)
			new KeyValue (keyID: 'checkbox-user-priorities', value: 'Specific Doctor').save(failOnError: true)
			
			//healthsituation/index.gsp
			new KeyValue (keyID: 'checkbox-healthsituations', value: 'I am healthy').save(failOnError: true)
			new KeyValue (keyID: 'checkbox-healthsituations', value: 'Breast Cancer' ).save(failOnError: true)
			new KeyValue (keyID: 'checkbox-healthsituations', value: 'Lung Cancer').save(failOnError: true)
			new KeyValue (keyID: 'checkbox-healthsituations', value: 'Prostate Cancer').save(failOnError: true)
			new KeyValue (keyID: 'checkbox-healthsituations', value: 'Diabetes').save(failOnError: true)
			new KeyValue (keyID: 'checkbox-healthsituations', value: 'Asthma').save(failOnError: true)
			new KeyValue (keyID: 'checkbox-healthsituations', value: 'Other').save(failOnError: true)

		}
		
    }
	
    def destroy = {
    }
	
}
