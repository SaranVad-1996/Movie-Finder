function loadSelect(){
	//Lines 3-19 populates genre select tag
	
	// Where the select tag will be located
	var td1 = document.getElementById("td1");
    
	// Array that contains film genres 
    var genreArray = ["Action","Adventure","Comedy","Crime","Drama","Horror",
        		"Musical","Science Fiction","War","Western"];
        	
    var genreSelectList = document.createElement("select");
        	
    genreSelectList.setAttribute("id", "genre");
    genreSelectList.setAttribute("name","genre");
    td1.appendChild(genreSelectList);
    
	var option1 = document.createElement("option");
	option1.setAttribute("value", "");
	option1.text = "Select genre";
    genreSelectList.appendChild(option1);
    
    for (var i = 0; i <= genreArray.length; i++) {
    	var options = document.createElement("option");
        options.setAttribute("th:value", genreArray[i]);
        options.text = genreArray[i];
        genreSelectList.appendChild(options);
    }
    
    //Lines 25-40 populates country select tag
    var td2 = document.getElementById("td2");
    
    var nationArray = ["Argentina","Brazil","Canada","China","France","Germany","India"
    					,"Italy","Japan","Mexico","Nigeria","South Korea","Spain","Turkey","UK","USA"];
    
    var nationSelectList = document.createElement("select");
    nationSelectList.setAttribute("id","country");
    nationSelectList.setAttribute("name","country");
    td2.appendChild(nationSelectList);
    
	var option2 = document.createElement("option");
	option2.setAttribute("value", "");
	option2.text = "Select country";
	nationSelectList.appendChild(option2);
    
    for (var i = 0; i < nationArray.length; i++) {
    	var options = document.createElement("option");
    	options.setAttribute("th:value", nationArray[i]);
    	options.text = nationArray[i];
        nationSelectList.appendChild(options);
    }
    //42-57 populates language select
    var td3 = document.getElementById("td3");
    
    var langArray = ["English","Mandarin","Spanish","Portuguese"
    					,"Korean","Turkish","Japanese","French","Italian"];
    
    var langSelectList = document.createElement("select");
    langSelectList.setAttribute("id","lang");
    langSelectList.setAttribute("name","lang");
    td3.appendChild(langSelectList);
    
    var option3 = document.createElement("option");
	option3.setAttribute("value", "");
	option3.text = "Select language";
	langSelectList.appendChild(option3);
    
    for (var i = 0; i < langArray.length;i++){
    	var options = document.createElement("option");
    	options.setAttribute("th:value", langArray[i]);
    	options.text = langArray[i];
    	langSelectList.appendChild(options);
    }
    
    //
    var td4 = document.getElementById("td4");
    
    var yearSelectList = document.createElement("select");
    yearSelectList.setAttribute("id","year");
    yearSelectList.setAttribute("name","year");
    td4.appendChild(yearSelectList);
    
    var option3 = document.createElement("option");
	option3.setAttribute("value", "");
	option3.text = "Select year";
	yearSelectList.appendChild(option3);
    
    for(var i = 1950; i < 2018; i++){
    	var options = document.createElement("option");
    	options.setAttribute("th:value", i);
    	options.text = i;
    	yearSelectList.appendChild(options);
    }
}