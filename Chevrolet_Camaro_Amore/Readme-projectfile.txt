Ad Campaign via HTTP

Technology utilized: Java, JAX-RS, Apache CXF, Spring framework

To make this project interesting let us assume we are building a web-based ad campaign for the new Chevrolet Camaro nicknamed
Camaro Amore....all the names are fictionalized to make this project interesting....

*****************************************************************************************************************************
Chevrolet a world renowned American Automobile manufacturer has come up with the next generation 2019 Chevrolet Camaro Amore
Car: CHEVROLET CAMARO AMORE
*****************************************************************************************************************************
A few facts about the 2019 model + people behind our car....

Engineering Staff:
Petronille Hartmann - Chief Technical Officer - Phd École Polytechnique Fédérale de Lausanne 
Juliette Klaas - Team Principal - Phd Politecnico di Milano

Management Staff:
Burphy Pemmaraju - Chief Financial Officer - MBA Trinity College Dublin 
Bradley Padukone - Chief Executive Office - MBA Imperial College London
Nikki Pandit - Chief Information Officer - MBA Danube University Krems

Test driver:
Amérique Eccezionale - American racing driver - Renault Sport F1 Team 

Vehicle build:
Engine type
pushrod 17-valve V-9, titanium block and heads, direct fuel injection

Transmission:
7-speed paddle shift manual + automatic

Advertisement for(let's name it):
Speranza Chevrolet Car Dealership - Philadelphia, PA

*********************************************************************************************************************************************
Approach to solve the program:
Step 1: Create three java files in source folder: Partnerid, Duration, Adcontent.
Step 2: HTTP Get, Put, Post, Delete are written in the PartnerService Java file, a implementation is written in PartnerServiceImpl Java file.
Step 3: In order to have JSON as a data format, the CXF file is configured using the Jacksonjsonprovider.
Step 4: A JAX-RS webservice is setup at the host end >>>> Click Maven Clean >>>> Click Maven Install >>>> Click Run on server.
Step 5: After step 4 the web service is setup + running on the host site.

*********************************************************************************************************************************************
Bonus:
URL to return JSON can be found in the restClient.js file....a line of code from the file:
function doPost(){
$.ajax({
	type: "POST",
	 contentType: "application/json; charset=utf-8",
     dataType: "json",
     data: JSON.stringify({name:$('#partnerName').val()}),
    url: "http://localhost:8080/restws/services/parterservice/partnerids"
    	
	}).then(function(data) {
		$('#partnerID').val(data.id);
		$('#partnerName').val(data.name);
	});
}

