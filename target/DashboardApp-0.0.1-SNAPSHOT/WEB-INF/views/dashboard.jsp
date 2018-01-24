<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PACSLink Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/resources/css/jquery-ui.css" var="JqueryUiCss" />
<spring:url value="/resources/css/styles.css" var="stylesCss" />
<link href="${bootstrapCss}" rel="stylesheet">
<link href="${JqueryUiCss}" rel="stylesheet">
<link href="${stylesCss}" rel="stylesheet">
</head>
<body style="background-color:#FCF7F7;">

<div class="spacer"></div>

<spring:url value="/resources/images/header.png" var="headerUrl" />
<div class="container">
	<img alt="N/A" src="${headerUrl}" class="img-responsive" width="100%">
</div>
<div class="spacer"></div>

<!-- /Header -->
<div class="col-md-12" style="background-color:	#59A628; margin-bottom: 17px; padding:15px;">
	<div class="row">
  <div class="col-md-4">
  	<label style="color:white; font-size:20px;"><input type="checkbox" id="refresh" style="zoom: 1;">Auto-Refresh</label> 
  	<label style="text-align:right; color:white; font-size:20px;" class="pull-right">Select Date :</label>	 		
  </div>
  <div class="col-md-6">
  <form class="form-inline" action="${pagecontext.request.contextpath}search" method="post">
    <!-- <div class="input-group"> -->
	   <div class="form-group">
	   		<input type="text" class="form-control" name="fromDate" id="fromDate" placeholder="From Date">
	   </div>
	   <div class="form-group">
	   		<input type="text" class="form-control" name="toDate" id="toDate" placeholder="To Date">
	   </div>
	        <input type="submit" class="btn btn-default" value="Search!" />
	<!-- </div> -->
  </form>
  </div>
  <div class="col-md-2" style="text-align:right;">
  		<span id="Time" style="color:white; font-size:18px;"></span>
  </div> 
	</div>
</div>
<!-- Main -->
<div class="container-fluid"> <!-- ASDASD -->
    <div class="row">
        <div class="col-sm-3 heightHr" style="border-right: 1px solid #D4D1D1;">
            <!-- Left column -->
            <a href="#"><strong>OPD VISITS</strong></a>
            <hr style="border:1px solid #D4D1D1;">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h4>OPD BOOKINGS</h4>
                </div>
                <div class="panel-body">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>SPECIALITIES</th>
                                <th>TOTAL</th>
                            </tr>
                        </thead>
                        <tbody>
                        	<c:set var="total" value="${0}"/> 
                            <c:if test="${not empty opd}">
                                    <c:forEach items="${opd}" var="opd">
                                    <c:set var="total" value="${total + opd.total}" />
                                    <tr>
                                        <td><c:out value="${opd.description}" /></td>
                                        <td><c:out value="${opd.total}" /></td>
                                    </tr>
                                    </c:forEach>
                                    <tr>
                                    	<td style="font-size:18px;"><b>Total Count :</b></td>
                                    	<td><c:out value="${total}" /></td>
                                    </tr>
                            </c:if>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <!-- /col-3 -->
       
        <div class="col-sm-4">

            <a href="#"><strong>DIAGNOSTIC ORDERS</strong></a>
            <hr style="border : 1px solid #D4D1D1;">
                <!-- center left-->
                <div class="form-group">

                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4>RADIOLOGY BOOKINGS</h4></div>
                        <div class="panel-body">
                              <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>MODALITY</th>
                                        <th>TOTAL</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:if test="${not empty radio}">
                                	<c:forEach items="${radio}" var="lst">
                                    <tr>
                                        <td><c:out value="${lst.description}" /></td>
                                        <td><c:out value="${lst.total}" /></td>
                                    </tr>
                                    </c:forEach>
                                    </c:if>
                                </tbody>
                            </table>
                        </div>
                        <!--/panel-body-->
                    </div>
                    <!--/panel-->
                </div>
                
                <div class="form-group">
                      <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4>IMAGING PERFORMED</h4></div>
                        <div class="panel-body">
                              <table class="table table-striped">
                                <thead>
                                    <tr>
                                		<th>MODALITY</th>
                                        <th>SEC</th>
                                        <th style="text-align:center;">TOTAL PERFORMED</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:if test="${not empty performed}">
                                	<c:forEach items="${performed}" var="lst">
                                    <tr>
                                        <td><c:out value="${lst.modality}" /></td> 
                                        <td><c:out value="${lst.section}" /></td> 
                                        <td style="text-align:center;"><c:out value="${lst.performed}" /></td> 
                                    </tr>
                                    </c:forEach>
                                    </c:if>
                                </tbody>
                            </table>
                        </div>
                        <!--/panel-body-->
                    </div>
                    </div>
                    
                   <div class="form-group">
                      <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4>OTHERS</h4></div>
                        <div class="panel-body">
                              <table class="table table-striped">
                                <thead>
                                    <tr>
                                		<th>PROCEDURE</th>
                                        <th style="text-align:center;">TOTAL</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:if test="${not empty dialysis}">
                                <c:forEach items="${dialysis}" var="dia">
                                    <tr>
                                        <td><c:out value="${dia.description}" /></td> 
                                        <td style="text-align:center;"><c:out value="${dia.total}"/></td> 
                                    </tr>
                                </c:forEach>   
                                </c:if>    
                                </tbody>
                            </table>
                        </div>
                        <!--/panel-body-->
                    </div>
                    </div>

					</div>
					
                  <div class="col-md-4">
                  		<br><hr style="border : 1px solid #D4D1D1;">
				   		<div class="form-group">
							<div class="panel panel-primary">
		                        <div class="panel-heading">
		                            <h4>PATHOLOGY BOOKINGS</h4></div>
		                        <div class="panel-body">
		                           <table class="table table-striped">
		                                <thead>
		                                    <tr>
		                                        <th>PROCEDURE</th>
		                                        <th>Total</th>
		                                    </tr>
		                                </thead>
		                                <tbody>
		                                	<c:if test="${not empty patho}">
		                                    <c:forEach items="${patho}" var="Path">
		                                    <tr>
		                                        <td><c:out value="${Path.description}" /></td>
		                                        <td><c:out value="${Path.total}" /></td>
		                                    </tr>
		                                    </c:forEach>
		                                    </c:if>
		                                </tbody>
		                            </table>
		                        </div>
		                    </div>
		                </div>
                   <div class="form-group">
              		 <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4>CARDIOLOGY BOOKINGS</h4></div>
                        <div class="panel-body">
                           <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>PROCEDURE</th>
                                        <th>Total</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:if test="${not empty cardio}">
                                    <c:forEach items="${cardio}" var="cardio">
                                    <tr>
                                        <td><c:out value="${cardio.description}" /></td>
                                        <td><c:out value="${cardio.total}" /></td>
                                    </tr>
                                    </c:forEach>
                                    </c:if>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
               
                 <div class="form-group">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4>GASTROENTROLOGY BOOKINGS</h4></div>
                        <div class="panel-body">
                           <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>PROCEDURE NAME</th>
                                        <th>TOTAL</th>
                                    </tr>
                                </thead>
                                <tbody>
                                   <c:if test="${not empty nilgid}">
                                    <c:forEach items="${nilgid}" var="gastro">
                                    <tr>
                                        <td><c:out value="${gastro.description}" /></td>
                                        <td><c:out value="${gastro.total}" /></td>
                                    </tr>
                                    </c:forEach>
                                    </c:if>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    </div> 
           
        </div>
        <!--/col-span-9-->
        
    </div>
</div>
<!-- /Main -->

<footer class="footer" style="background-color:#613B66; color:white; text-align:center;">
    <b>Registered TradeMark of Pacslink © CopyRight 2014-2020.</b>
</footer>


<spring:url value="/resources/js/jquery-3.2.1.min.js" var="jqueryJs" />
<spring:url value="/resources/js/jquery-ui.js" var="jqueryUiJs" />
<spring:url value="/resources/js/bootstrap.js" var="bootstrapJs" />
<spring:url value="/resources/js/moment.js" var="momentJs" />
<script type="text/javascript" src="${jqueryJs}"></script>
<script type="text/javascript" src="${jqueryUiJs}"></script>
<script type="text/javascript" src="${bootstrapJs}"></script>
<script type="text/javascript" src="${momentJs}"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		var counter = 0;
		var intervalID = 0;
		var checkbox = false;

		setTimeout('location.reload()',300000);

	    $("#fromDate").datepicker({
			 dateFormat : 'mm/dd/yy' 
		});
	    
	    $("#toDate").datepicker({
			 dateFormat : 'mm/dd/yy' 
		});
		
		setTimeout("displayTime()",1000);
	});
	
	function displayTime(){
		
		var dt = new Date();
		var m_names = new Array("Jan", "Feb", "Mar", 
				"Apr", "May", "Jun", "Jul", "Aug", "Sep", 
				"Oct", "Nov", "Dec");
		var curr_date = dt.getDate();
		var curr_month = dt.getMonth();
		var curr_year = dt.getFullYear();
		var fin = curr_date + "-" + m_names[curr_month] + "-" + curr_year;
		$("#Time").html("<p>" + fin + " - " + dt.toLocaleTimeString() + "</p>");
		setTimeout("displayTime()",1000);
	}
</script>
</body>
</html>