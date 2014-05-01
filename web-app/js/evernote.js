
	$("form#fireflyform").submit(function() {
		alert("saving result for later");
		var sendgridjs_url = "http://peaceful-mesa-4093.herokuapp.com/send";
		var sendgridjs_to = "allen286.eb5ca68@m.evernote.com";
		var sendgridjs_subject = "Firefly Insurance Option Results !2014/03/01";
		var sendgridjs_html = "<p>html of email here as a string</p>";

		var email = {
			to : sendgridjs_to,
			subject : sendgridjs_subject,
			html : sendgridjs_html
		}
		$.post(sendgridjs_url, email, function(response) {
			if (response.success) {
				// redirect somewhere or something. up to you. the email was sent successfully.
			} else {
				alert(response.error.message);
			}
		});
	});
