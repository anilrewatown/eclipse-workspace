<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script> 

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- Date picker https://github.com/eternicode/bootstrap-datepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script>



</head>


<body>
<h2><b>Employee Master</b></h2>

<div class="row">
<div class="col-xs-2">
Employee Code : <input type="text" class="form-control input-sm" disabled="disabled">
</div>
</div><br>


<div class="row">
<div class="col-xs-3">
Employee Name : <input type="text" class="form-control input-sm" placeholder="enter name">
</div>
 <div class="col-xs-3">
Department :   <select class="form-control input-sm">
                    <option>Select Department</option>
                </select>
 </div> 
 
 <div class="col-xs-3">
Gender :   <select class="form-control input-sm">
                    <option>Select Gender</option>
		            <option value="F">Female</option>
		            <option value="M">Male</option>
		            <option value="T">Transgender</option>
                </select>
 </div>                     
</div><br>


<div class="row">
<div class="col-xs-3">
Mobile No : <input type="text" class="form-control input-sm" placeholder="Enter mobile No">
</div>

 <div class="col-xs-3">
ID Proof :   <select class="form-control input-sm">
                    <option>Select ID Proof</option>
		            <option value="ACNO">Adhaar Card</option>
		            <option value="PNO">Passport</option>
		            <option value="DLNO">Driving Licence</option>
		             <option value="VIDNO">Voter ID</option>
		             <option value="PCNO">Pan Card No</option>
                </select>
 </div>    
<div class="col-xs-3">
ID No : <input type="text" class="form-control input-sm" placeholder="Enter ID No">
</div>

<!--  <div class="col-xs-3">
      <div class="checkbox">
        <label> <input type="checkbox" required="" />Remember me
        </label>
      </div>
    </div> -->
</div><br>

<div class="row">
<div class="col-xs-3">
Date Of Birth : <input type="text"  id="date" class="form-control input-sm datepicker" placeholder="dd/mm/yyyy">
</div>
<div class="col-xs-3">
Email ID : <input type="text" class="form-control input-sm datePicker" placeholder="Enter Email id">
</div>



</div><br>

<div class="row">

<div class="col-xs-5">
                  Current Address
                  <textarea type="text" class="form-control input-sm" id="descField" placeholder="current address"></textarea>
              </div>
<div class="col-xs-5">
                  Permanent Address
                  <textarea type="text" class="form-control input-sm" id="descField" placeholder="permanent address"></textarea>
              </div>
</div>


 <br><br><br><button type="submit" class="btn btn-primary">Submit</button>
 <button type="reset" class="btn btn-default">Reset</button>
</body>
</html>