package Retail_Bookstore.controllerWithoutDb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Retail_Bookstore.db.ItemDB;
import Retail_Bookstore.model.Item;
import Retail_Bookstore.model.User;
import Retail_Bookstore.service.UserService;

public class AddCartController extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String selectedItemNo = request.getParameter("selectedItem"); 
	
		if (selectedItemNo.isEmpty())
		{
			 RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			   out.println("<font color=red>Please select item to cart</font>");
			   rd.include(request, response);
		} 
		else
		{
			ItemDB itemDB = new ItemDB();
			List<Item> itemsInStore = itemDB.getItems();
			
			List<Item> selectedItems = new ArrayList<Item>();
			
			for(Item item : itemsInStore) {
				if(item.getItemNo() == Integer.parseInt(selectedItemNo)) {
					selectedItems.add(item);
				}
			}
			
			
			request.setAttribute("cart_items_list", selectedItems);
			
			RequestDispatcher rd = request.getRequestDispatcher("/addcart.jsp");
			rd.forward(request,response);
			return;
		}
		
	
		
	/*	String email=request.getParameter("email ID");
		String pass=request.getParameter("password");
		
		if (email.isEmpty() || pass.isEmpty()) {
			  RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			   out.println("<font color=red>Please fill all the fields</font>");
			   rd.include(request, response);
			  } else {
				
				  User signUp=new User("","",pass,email);

					PrintWriter pout= response.getWriter();
					if (new UserService().isAuthorized(signUp)) {
						pout.write("Login successfull...");
						
						ItemDB itemDB = new ItemDB();
						List<Item> items = itemDB.getItems();
						
						request.setAttribute("item_list", items);
						
						RequestDispatcher rd = request.getRequestDispatcher("/addcart.jsp");
						rd.forward(request,response);
						return;
					}
					pout.write("Login fail...");
					 
					RequestDispatcher rd = request.getRequestDispatcher("/fail.jsp");
					rd.forward(request,response);
					
					
			  }*/
	}

}
