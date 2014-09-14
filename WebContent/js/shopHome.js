/*
 * Author:VL
 */
//购物车容器
var cartContainer=[];
$(function(){
	
	var cookie = document.cookie;
	if(cookie.length==0){
		//alert("浏览器禁用的cookie,将会影响购物车使用!");
	}
	//
	
	freshCartNum();
	//click adding shop cart button
	$(".btn").click(function(){
		var name = $(this).parent().find(".itemname").html();
		var price = $(this).parent().find(".price").html();
		var imgUrl = $(this).parent().parent().find("img").attr("src");
		var count = 1;
		//飞入效果
		var cartEle = $(this).parent().parent().find("img").clone().css('opacity','0.7').addClass("cartItemCopy");
		cartEle.css({
			'z-index': 9000,
			'display': 'block',
			'position': 'absolute',
			'top': $(this).offset().top +'px',
			'left': $(this).offset().left +'px',
			'width': $(this).width() +'px',
			'height': $(this).height() +'px'
		});
		$('body').append(cartEle);
		cartEle.animate({
			top:$('.icon-shopping-cart').offset().top,
			left:$('.icon-shopping-cart').offset().left,
			width:0,
			height:0,
		},'slow');
		/////////////////////////////////////////////////////////////////////////////////////////
		var cartObject={};
		cartObject.price = price;
		cartObject.name = name;
		cartObject.imgUrl = imgUrl;
		cartObject.count - count;
		cartContainer.push(cartObject);
		////////////////////////////////////////////////////////////////////////////////////////
		var cartWidget = '<li>'
	        +'<a href="#"><img src="'+imgUrl+'" alt="Product" width="85" height="70"/></a>'
	        +'<div class="mini-cart-detail"><h5><a href="#">'+name+'</a></h5>'
	        +'<em>'+count+' 个</em>'
	        +'<p>'+price+'</p>'
	        +'<br/><a id="removebutton" class="removedbutton">删除</a>'
	        +'</div>'
	        +'</li>';
		//add to cart container
		$("#shoppingcartwidget").append(cartWidget);
		freshCartNum();
	});//end of cart1 click
	
	
});

//From jQuery 1.7 live function has been replaced by 'on', and use second parameter as selector
//bind remove cart item function
$(document).on('click', '#removebutton', function() {
    //function code here.
	$(this).parent().parent().remove();
	var delName = $(this).parent().parent().find(".itemname").html();
	var cartContainerLength = cartContainer.length;
	var delIndex = 0;
	for(var index = 0; index<cartContainerLength; index++){
		if(cartContainer[index].name == delName){
			delIndex = index;
			break;
		}
	}//end of find del item index;
	cartContainer.splice(delIndex,1);
	freshCartNum();
  });
//////////normal functions/////////////
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
//更新购物车商品数
function freshCartNum(){
	$("#cartNum").html("( "+cartContainer.length+" )");
	countTotalPrice();
}

function countTotalPrice(){
	var cartContainerLength = cartContainer.length;
	var total = 0;
	for(var index = 0; index<cartContainerLength; index++){
		total = accAdd(total, cartContainer[index].price);
	}//end of find del item index;
	$("#totalPriceHeader").html(total);
	$("#totalPriceInCart").html(total);
}

//加法函数  
function accAdd(arg1, arg2) {  
    var r1, r2, m;  
    try {  
        r1 = arg1.toString().split(".")[1].length;  
    }  
    catch (e) {  
        r1 = 0;  
    }  
    try {  
        r2 = arg2.toString().split(".")[1].length;  
    }  
    catch (e) {  
        r2 = 0;  
    }  
    m = Math.pow(10, Math.max(r1, r2));  
    return (arg1 * m + arg2 * m) / m;  
}   
//给Number类型增加一个add方法，，使用时直接用 .add 即可完成计算。   
Number.prototype.add = function (arg) {  
    return accAdd(arg, this);  
};  
  
//减法函数  
function Subtr(arg1, arg2) {  
    var r1, r2, m, n;  
    try {  
        r1 = arg1.toString().split(".")[1].length;  
    }  
    catch (e) {  
        r1 = 0;  
    }  
    try {  
        r2 = arg2.toString().split(".")[1].length;  
    }  
    catch (e) {  
        r2 = 0;  
    }  
    m = Math.pow(10, Math.max(r1, r2));  
     //last modify by deeka  
     //动态控制精度长度  
    n = (r1 >= r2) ? r1 : r2;  
    return ((arg1 * m - arg2 * m) / m).toFixed(n);  
}  
  
//给Number类型增加一个add方法，，使用时直接用 .sub 即可完成计算。   
Number.prototype.sub = function (arg) {  
    return Subtr(this, arg);  
};  
  
//乘法函数  
function accMul(arg1, arg2) {  
    var m = 0, s1 = arg1.toString(), s2 = arg2.toString();  
    try {  
        m += s1.split(".")[1].length;  
    }  
    catch (e) {  
    }  
    try {  
        m += s2.split(".")[1].length;  
    }  
    catch (e) {  
    }  
    return Number(s1.replace(".", "")) * Number(s2.replace(".", "")) / Math.pow(10, m);  
}   
//给Number类型增加一个mul方法，使用时直接用 .mul 即可完成计算。   
Number.prototype.mul = function (arg) {  
    return accMul(arg, this);  
};   
  
//除法函数  
function accDiv(arg1, arg2) {  
    var t1 = 0, t2 = 0, r1, r2;  
    try {  
        t1 = arg1.toString().split(".")[1].length;  
    }  
    catch (e) {  
    }  
    try {  
        t2 = arg2.toString().split(".")[1].length;  
    }  
    catch (e) {  
    }  
    with (Math) {  
        r1 = Number(arg1.toString().replace(".", ""));  
        r2 = Number(arg2.toString().replace(".", ""));  
        return (r1 / r2) * pow(10, t2 - t1);  
    }  
}   