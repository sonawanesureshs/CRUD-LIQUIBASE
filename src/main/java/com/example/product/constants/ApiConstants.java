package com.example.product.constants;

public class ApiConstants {

	private ApiConstants() {
		throw new IllegalStateException("Utility class");
	}
	public static final String API_SEPARATOR = "/";
	public static final String API_PRODUCT = "product";
	public static final String API_CATEGORY = "category";
	
	public static final String API_PRODUCT_PATH = API_SEPARATOR + API_PRODUCT;
	public static final String API_CATEGORY_PATH = API_SEPARATOR + API_CATEGORY;
	
	public static final String API_ADD_CATEGORY_SUCCESS = "Category added successfully.!!";
	public static final String API_CATEGORY_EXISTS = "Category already exists.!!";
	public static final String API_CATEGORY_NOT_EXISTS = "Category doesn't exists.!!";
	public static final String API_CATEGORY_DELETE = "Category deleted successfully.!!";

	public static final String API_ADD_PRODUCT_SUCCESS = "Product added successfully.!!";
	public static final String API_PRODUCT_EXISTS = "Product already exists.!!";
	public static final String API_PRODUCT_NOT_EXISTS = "Product doesn't exists.!!";
	public static final String API_PRODUCT_DELETE = "Product deleted successfully.!!";

	public static final String API_USERS_PATH = "/api/user";

	public static final String API_ALLOWED_ORIGIN = "http://13.59.166.19";

	public static final String API_ADD_USERS = "User added successfully.!!";
	public static final String API_UPDATE_USER = "User updated successfully.!!";

	public static final String API_USER_DELETE = "Category deleted successfully.!!";

	public static final String API_USER_PATH_ID = "/{id}";

	public static final String API_MESSAGE = "msg";



	
}
