<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<r:require modules="bootstrap"/>
<meta name="layout" content="main" />
<title>Health Situations</title>

</head>

<body>
<p>&nbsp;</p>
<div class="border-form-div" id="fourth_form">

Quote_id: ${params["quote_id"]} <br>

<g:form class="form-horizontal" action="next" params="[quote_id : params.quote_id]" method="post">

<%--params="[quote_id: param.quote_id]" --%>


<%--<g:hiddenField name="quote_id" value="${param[quote_id]}" />--%>

<%--<g:hiddenField name="quote_id" value="${request.quote_id}" />--%>

<!-- Form Name -->
   <legend>Do you have a specific health condition?</legend>
   
	<p> If you have a chronic or serious illness then access to quality care is critical to your health and wellbeing.  Select what conditions you are dealing with firefly will guide you to options for managing your health and budget.</p>
 
   <%-- Multiple check boxes --%>
       
    <div class="control-group">
      <label class="control-label" for="$[all-user-healthsituations]">Select all that apply</label>
      
		<div class="controls">
		
	    <g:each var="healthsituation" in="${healthSituations}">
    	
			<label class="checkbox" >
			   <g:checkBox name="${healthsituation.keyID}" id="${healthsituation.keyID}" value="${healthsituation.value}" checked="false"/>
			   ${healthsituation.value}
			</label>
		</g:each>
          
      </div>
      
    </div>
    
    
    <!-- Button -->
    <div class="control-group">
      <label class="control-label" for="user_save"></label>
      <div class="controls">
        <button id="user_save" type="submit" name="user_save" class="btn btn-primary">Next</button>
      </div>
    </div>

 </g:form>
 </div>
</body>

</html>
