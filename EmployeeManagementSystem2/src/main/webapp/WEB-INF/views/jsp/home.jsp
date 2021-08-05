<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box}
body {font-family: "Lato", sans-serif;}

/* Style the tab */
.tab {
    float: left;
    border: 1px solid #ccc;
    background-color: #1A1A27;
    width: 10%;
    height: 800px;
}

/* Style the buttons inside the tab */
.tab button {
  display: block;
  background-color: inherit;
  color: #ffffff;
  padding: 5px 16px;
  width: 100%;
  border: none;
  outline: none;
  text-align: left;
  cursor: pointer;
  transition: 0.3s;
  font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current "tab button" class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  float: left;
  padding: 0px 12px;
  border: 1px solid #ccc;
  width: 70%;
  border-left: none;
  height: 800px;
   background-color: #ffffff;
}
</style>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
  $(".dropdown-toggle").dropdown();
});  
</script>
<style type="text/css">
  .bs-example{
      margin: 20px;
    }
</style>
</head>
<body>

<h2><b>Employee Management System</b></h2><br>

<div class="bs-example">
   <div class="dropdown pull-right">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
        <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li class="divider"></li>
            <li><a href="#">Third Link</a></li>
        </ul>
    </div>
</div>

<div class="tab">
  <button class="tablinks" onclick="openForm(event, 'EmployeeGrid')" id="defaultOpen"><b>Employee Grid</b></button>
  <button class="tablinks" onclick="openForm(event, 'Employee')"><b>Employee Master</b></button>
  <button class="tablinks" onclick="openForm(event, 'Department')"><b>Department Master</b></button>
  <button class="tablinks" onclick="openForm(event, 'Designation')"><b>Designation Master</b></button>
</div>

<div id="EmployeeGrid" class="tabcontent">
<jsp:include page="employee_grid.jsp"></jsp:include>
</div>

<div id="Employee" class="tabcontent">
<jsp:include page="employee_form.jsp"></jsp:include>
</div>

<div id="Department" class="tabcontent">
<jsp:include page="department_form.jsp"></jsp:include>
</div>

<div id="Designation" class="tabcontent">
<jsp:include page="designation_form.jsp"></jsp:include>
</div>

<script>
function openForm(evt, masterName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(masterName).style.display = "block";
  evt.currentTarget.className += " active";
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();
</script>
   
</body>
</html> 
