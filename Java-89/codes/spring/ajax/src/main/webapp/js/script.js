var xhr;

function getEmployeeDetails(empno)
{
	xhr = new XMLHttpRequest();	
	
	xhr.open("GET", "searchemp?eno="+empno, true); //true - asynchronous communication
	
	xhr.onreadystatechange = stateChanged; //registering a callback function
	
	xhr.send();
}

function stateChanged(){
	var name = 'NO MATCH';
	var sal = 'NO MATCH';
	
	if(xhr.readyState == 4){
		var responseData = xhr.responseText;
		
		if(responseData.length > 0){
			var responseObject = JSON.parse(responseData);	//to convert JSON String to JSON Object	
			
			name = responseObject.name;
			sal = responseObject.salary;
		}
	}
	
	document.getElementById("emp-name").innerHTML = name;
	document.getElementById("emp-sal").innerHTML = sal;
}