<%@ page import="com.gyde.Person" %>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'sex', 'error')} required">
	<label for="sex">
		<g:message code="person.sex.label" default="Sex" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="sex" from="${personInstance.constraints.sex.inList}" required="" value="${personInstance?.sex}" valueMessagePrefix="person.sex"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="person.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="age" type="number" value="${personInstance.age}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="person.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${personInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'quote', 'error')} required">
	<label for="quote">
		<g:message code="person.quote.label" default="Quote" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="quote" name="quote.id" from="${com.gyde.Quote.list()}" optionKey="id" required="" value="${personInstance?.quote?.id}" class="many-to-one"/>

</div>

