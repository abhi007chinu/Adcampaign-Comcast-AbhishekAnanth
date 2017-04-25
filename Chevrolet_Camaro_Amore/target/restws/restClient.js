function doGet(){
	$.ajax({
    	type: "GET",
    	 contentType: "application/json; charset=utf-8",
         dataType: "json",
        url: "http://localhost:8080/restws/services/partnerservice/partnerids/"+$('#partnerID').val()
    }).then(function(data) {
       $('#partnerID').val(data.id);
       $('#partnerName').val(data.name);
    });
}
	
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

function doPut(){
$.ajax({
	type: "PUT",
	 contentType: "application/json; charset=utf-8",
	 dataType: "json",
	 data: JSON.stringify({name:$('#partnerName').val()}),
	 url: "http://localhost:8080/restws/services/partnerservice/partnerids"
		 
	}).then(function(data) {
		$('#partnerID').val(data.id);
		$('#partnerName').val(data.name);	
	});
}
	
	
function doDelete(){
	$.ajax({
    	type: "DELETE",
    	 contentType: "application/json; charset=utf-8",
         dataType: "json",
        url: "http://localhost:8080/restws/services/partnerservice/partnerids/"+$('#partnerID').val()
    }).then(function(data) {
       alert('Partner Deleted');
    });
}