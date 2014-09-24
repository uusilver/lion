package com.tmind.lion.model;

public class WillingCart  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = -8922455947575049719L;
	// Fields    

     private Integer id;
     private Integer userId;
     private String cartContent;
     private String addDate;
     private String remarks1;
     private String remarks2;
     private String remarks3;
     private String remarks4;

    /** default constructor */
    public WillingCart() {
    }

	/** minimal constructor */
    public WillingCart(Integer id,Integer userId, String cartContent, String addDate) {
    	this.id = id;
        this.userId = userId;
        this.cartContent = cartContent;
        this.addDate = addDate;
    }
    
    /** full constructor */
    public WillingCart(Integer id,Integer userId, String userName, String cartContent, String addDate, String remarks1,
			String remarks2,String remarks3) {
    	this.id = id;
    	this.userId = userId;
		this.cartContent = cartContent;
        this.addDate = addDate;
		this.remarks1 = remarks1;
		this.remarks2 = remarks2;
		this.remarks3 = remarks3;
		this.remarks3 = remarks4;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCartContent() {
		return cartContent;
	}

	public void setCartContent(String cartContent) {
		this.cartContent = cartContent;
	}

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	public String getRemarks1() {
		return remarks1;
	}

	public void setRemarks1(String remarks1) {
		this.remarks1 = remarks1;
	}

	public String getRemarks2() {
		return remarks2;
	}

	public void setRemarks2(String remarks2) {
		this.remarks2 = remarks2;
	}

	public String getRemarks3() {
		return remarks3;
	}

	public void setRemarks3(String remarks3) {
		this.remarks3 = remarks3;
	}

	public String getRemarks4() {
		return remarks4;
	}

	public void setRemarks4(String remarks4) {
		this.remarks4 = remarks4;
	}
    

}