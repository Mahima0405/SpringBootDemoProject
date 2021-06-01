<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color: #cccccc;
text-align: center;
}

table{
text-align: center;
margin-left: auto;
margin-right: auto;
}

input{
width: 100%;
}

</style>
</head>
<body>
	
	<h1>Student Registration Form</h1>
	<table>
		<tr>
			<td colspan="2"><h3>Add New Student Details</h3></td>
		</tr>
		<tr>
			<td> <form action="addStudent">
					
					<input type="text" name="name" placeholder="Type Student Name..."><br><br>
					<input type="text" name="rollnum" placeholder="Type Student RollNum..." class="roll"><br><br>
					<input type="text" name="tech" placeholder="Type your favourite Technology Stack..."><br><br>
					<input type="submit" class="submit"><br>
				</form>
		    </td>
		</tr>
		<tr>
			<td colspan="2"><h3>Get Student Details</h3></td>
		</tr>
		<tr>
			<td> <form action="getStudent">
					<input type="text" name="rollnum" placeholder="Type Student RollNum..."><br><br>
					<input type="submit" class="submit"><br>
				</form>
		    </td>
		  </tr>
		  <tr>
		    <td> <h3>Student Fetched: </h3> Student Name: ${obj.name} <br> Student RollNumber: ${obj.rollnum} <br> Student TechStack: ${obj.tech}</td>
		</tr>
		<tr>
			<td colspan="2"><h3>Update Student Details</h3></td>
		</tr>
		<tr>
			<td> <form action="updateStudent">
					<input type="text" name="name" placeholder="Type Student Name..."><br><br>
					<input type="text" name="rollnum" placeholder="Type Student RollNum..." class="roll"><br><br>
					<input type="text" name="tech" placeholder="Type your favourite Technology Stack..."><br><br>
					<input type="submit" class="submit"><br>
				</form>
		    </td>
		</tr>
		<tr>
			<td colspan="2"><h3>Delete Student Details</h3></td>
		</tr>
		<tr>
			<td> <form action="deleteStudent">
					<input type="text" name="rollnum" placeholder="Type Student RollNum..."><br><br>
					<input type="submit" class="submit"><br>
				</form>
		    </td>
		</tr>
		
	
	</table>
	
	
	
	
</body>
</html>