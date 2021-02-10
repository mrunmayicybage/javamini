<%@page import="com.cybage.model.Enrolled"%>
<%@page import="java.util.List"%>
<style>
table,th, td {
  border: 1px solid black;
  border-collapse: collapse;
 
}
th{
color:#3d5c5c;
}
td{
color:#527a7a;}
table.center {
  margin-left: auto; 
  margin-right: auto;
}
h1{
text-align:center;
color:#669999;
}
table{
background-color:#ffcccc}
</style>
<br>
<h1>Enrolled Courses Table</h1>
<table class="center" border="1">
	<tr>
		<th>  Enrolled Course Name  </th>
		<th>  Start Date  </th>
		<th>  End Date  </th>
		


	</tr>
	<%
	List<Enrolled> enrolled = (List)request.getAttribute("enroll");
	for (Enrolled en : enrolled) {
			out.print("<tr>");
			out.print("<td>" + en.getCoursename() + "</td>");
			//out.print("<td>" + en.getEcid() + "</td>");
			//out.print("<td>" + en.getUserid() + "</td>");
			//out.print("<td>" + en.getCourseid() + "</td>");
			//out.print("<td>" + en.getCompletedcourse() + "</td>");
			out.print("<td>" + en.getStartdate() + "</td>");
			out.print("<td>" + en.getEnddate() + "</td>");
			

			
			
			out.print("</tr>");
		}
	%>

</table>