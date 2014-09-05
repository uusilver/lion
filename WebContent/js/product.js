/*
 * Author:VL
 */
//购物车容器
var cartContainer=[];

jQuery(document).ready(function(){
	//Menu
	jQuery("ul.sf-menu").supersubs({ 
	minWidth		: 12,		// requires em unit.
	maxWidth		: 27,		// requires em unit.
	extraWidth		: 3	// extra width can ensure lines don't sometimes turn over due to slight browser differences in how they round-off values
						   // due to slight rounding differences and font-family 
	}).superfish();  // call supersubs first, then superfish, so that subs are 
					 // not display:none when measuring. Call before initialising 
	//判断COOKIE是否存在
	var cookie = document.cookie;
	if(cookie.length==0){
		alert("浏览器禁用的cookie,将会影响购物车使用!");
	}
	
	
	//显示遮盖层				 
	//$("#content").showLoading();	
	
	$(".cartbutton").click(function(){
		var price = $(this).parent().find(".productprice").html();
		var name  = $(this).parent().find(".colortext").html();
		var imgUrl = $(this).parent().parent().find("img").attr("src");
		var count = 1;
		//alert(imgUrl);
		var cartObject={};
		cartObject.price = price;
		cartObject.name = name;
		cartObject.imgUrl = imgUrl;
		cartObject.count - count;
		cartContainer.push(cartObject);
		var cartWidget = '<li>'
                       +'<a href="#"><img src="'+imgUrl+'" alt="" class="alignleft"  width="57" height="57"/></a>'
                       +'<span class="colortext">'+name+'</span><br/>'
                       +'<span>'+count+'x'+price+'</span><br/>'
                       +'<span><a id="removebutton" class="removebutton">删除</a></span>'
                       +'<span class="clear"></span>'
                       +'</li>';
		$("#shoppingcartwidget").append(cartWidget);
		
		//用pop可以压出内容
		//alert(cartContainer.pop().name);
		//JSON.stringify object转string
		//var str = JSON.stringify(cartContainer);  
		//alert(str);  
		
	});//end of cart1 click
	
	//给每个删除按钮绑定删除方法
	$('#removebutton').live('click',function(){$(this).parent().parent().remove();});
			
	
});
	$("img").lazyload({
	    effect : "fadeIn"
	});
	
	
	//写cookies 
	function setCookie(name,value) 
	{ 
	    var Days = 30; 
	    var exp = new Date(); 
	    exp.setTime(exp.getTime() + Days*24*60*60*1000); 
	    document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString(); 
	} 

	//读取cookies 
	function getCookie(name) 
	{ 
	    var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
	    if(arr=document.cookie.match(reg))
	        return unescape(arr[2]); 
	    else 
	        return null; 
	} 

	//删除cookies 
	function delCookie(name) 
	{ 
	    var exp = new Date(); 
	    exp.setTime(exp.getTime() - 1); 
	    var cval=getCookie(name); 
	    if(cval!=null) 
	        document.cookie= name + "="+cval+";expires="+exp.toGMTString(); 
	} 