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

    <!-- Multiple Radios -->
    
    <div class="control-group">
      <label class="control-label" for="radios-user-priorities">Select all that apply</label>
      <div class="controls">
        
          <label class="checkbox" >
          <g:checkBox name="checkbox-user-priorities" id="checkbox-user-priorities" value="on" checked="true"/>
          Save money
          </label>
          
          <label class="checkbox" >
          <g:checkBox name="checkbox-user-priorities" id="checkbox-user-priorities" value="Better coverage" checked="false"/>
          Better coverage
          </label>
        
          <label class="checkbox">
          <g:checkBox name="checkbox-user-priorities" id="checkbox-user-priorities" value="Specific Doctor" checked="false"/>
          Specific Doctor
          </label>
          
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