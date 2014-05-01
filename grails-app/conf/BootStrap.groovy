import helloworld.KeyValue

class BootStrap {

    def init = { servletContext ->
		
		// Check whether the test data already exists.
		if (!Priority.count()) {
	
			
			new KeyValue (Key: "checkbox-user-priorities", Value: "Save Money" ).save(failOnError: true)
			new KeyValue (Key: "checkbox-user-priorities", Value: "Better Coverage").save(failOnError: true)
			new KeyValue (Key: "checkbox-user-priorities", Value: "Specific Doctor").save(failOnError: true)
			
		}
		
    }
	
    def destroy = {
    }
}
