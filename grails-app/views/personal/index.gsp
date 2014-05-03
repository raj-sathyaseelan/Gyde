<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<r:require modules="bootstrap"/>
<meta name="layout" content="main" />
<title>Personal Information</title>
</head>

<body>

  <h1 align="center" style="color:white;">Tell us more about you</h1> 
  <p>&nbsp;</p>
<div class="border-form-div" id="third_form">  

<g:form class="form-horizontal" action="next" method="post">
 	
  <fieldset>

    <!-- Form Name -->
    <legend>User details</legend>

    <!-- Text input-->
    <div class="control-group">
      <label class="control-label" for="dob">Date of birth</label>
      <div class="controls">
        

        <input id="dob" name="dob" type="text" >

      </div>

    </div>

    <!-- Text input-->
    <div class="control-group">
      <label class="control-label" for="zipcode">Zip-code</label>
      <div class="controls">
        <input id="zipcode" name="zipcode" type="text" class="input-xlarge">

      </div>
    </div>

    <!-- Button -->
    <div class="control-group">
      <label class="control-label" for="user_save"></label>
      <div class="controls">
        <button id="user_save" type="submit" name="user_save" class="btn btn-primary">Next</button>
      </div>
    </div>

  </fieldset>
</g:form>
</div>
</body>
</html>
