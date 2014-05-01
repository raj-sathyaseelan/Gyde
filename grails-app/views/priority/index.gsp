<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<r:require modules="bootstrap"/>
<meta name="layout" content="main" />
<title>Priorities</title>

</head>
<body>
<p>&nbsp;</p>

<div class="border-form-div" id="fourth_form">
<g:form class="form-horizontal" action="next" method="post">
  <fieldset>
  
    <!-- Form Name -->
    <legend>Priorities</legend>
    
<%--    <!--      --%>
<%--    Last Name: <g:fieldValue bean="${person}" field="lastName"/><br/>--%>
<%--	First Name: <g:fieldValue bean="${person}" field="firstName"/><br/>--%>
<%--	Age: <g:fieldValue bean="${person}" field="age"/><br/>--%>
<%--	-->--%>

    <!-- Multiple checkbox -->
       
    <div class="control-group">
      <label class="control-label" for="$[all-user-priorities]">Select all that apply</label>
      
		<div class="controls">
		
	    <g:each var="priority" in="${priorities}">
    	
			<label class="checkbox" >
			   <g:checkBox name="${priority.keyID}" id="${priority.keyID}" value="${priority.value}" checked="false"/>
			   ${priority.value}
			</label>
		</g:each>
          
      </div>
      
    </div>

    <div class="control-group">
      <label class="control-label" for="next"></label>
      
      <div class="controls">
        <button type="submit"  name="next" class="btn btn-primary">Next</button>
      </div>
      
    </div>

  </fieldset>
  
</g:form>
</div>

</body>
</html>