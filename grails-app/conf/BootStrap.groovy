import com.gyde.KeyValue

class BootStrap {

    def init = { servletContext ->
		
		// Check whether the test data already exists.
		if (!KeyValue.count()) {
	
			new KeyValue (KeyID: "checkbox-user-priorities", Value: "Save Money" ).save(failOnError: true)
			new KeyValue (KeyID: "checkbox-user-priorities", Value: "Better Coverage").save(failOnError: true)
			new KeyValue (KeyID: "checkbox-user-priorities", Value: "Specific Doctor").save(failOnError: true)

			
		}
		
    }
	
    def destroy = {
    }
	
}
