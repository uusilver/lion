jQuery(function() {
  jQuery('.error').hide();
  jQuery(".butcontact").click(function() {
		// validate and process form
		// first hide any error messages
    jQuery('.error').hide();
		
	  var telno = jQuery("input#telno").val();
	  if (telno == "") {
	      jQuery("span#telno_error").show();
	      jQuery("input#telno").focus();
	      return false;
	  }
	
	  
	var emailReg = /^1\d{10}$/;
	if(!emailReg.test(telno)) {
	jQuery("span#telno_error2").show();
    jQuery("input#telno").focus();
      return false;
	}else{
		  queryAgentCode(telno);
	 }
	
	
	
	});
});

function queryAgentCode(telno) {
	$.ajax( {
		type : "get",
		async:false,
		url : "queryAgentCode/"+telno+".do",
		dataType:"html",
		success : function(result) {
			if(result=='none'){
				jQuery("span#telno_noneerror").show();
			}else{
				window.location.href="agent_apply_done.html?agentCode="+result;
			}
		}
	});
}
