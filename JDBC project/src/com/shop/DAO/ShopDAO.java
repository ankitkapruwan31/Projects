package com.shop.DAO;

import com.shop.Beans.Customer;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShopDAO extends JDBCConnection  {

		public int addCustomer(Customer customer) throws SQLException
		{
			int submit = 0;
			try {
				Connection connection = makeConnection();
				String sql = "insert into customer values(?,?,?,?,?,?)";
				PreparedStatement stat = connection.prepareStatement(sql);
				stat.setString(1,customer.getName());
				stat.setString(2, customer.getLastName());
				stat.setLong(3, customer.getPhoneNumber());
				stat.setString(4, customer.getEmail());
				stat.setString(5, customer.getPassword());
				stat.setInt(6, 0);
				submit = stat.executeUpdate();
				stat.close();
				connection.close();
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("add customer me faaat gya h");
			}
			return submit;
			
		}//end of addCustomer 

		public int  deleteCustomer(String email) throws SQLException
		{
			int i = 0;
			try
			{
				Connection connection = makeConnection();
				PreparedStatement stat = connection.prepareStatement("delete  from customer where 	email = ? ; ");
				stat.setString(1, email);
				i = stat.executeUpdate();
				
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Delete customer me faat gya");
			}
			return i ;
		} //end of deleteCustomer
		
		public Customer getDetails(String email)
		{
			Customer customer = new Customer();
			try {
				Connection connection = makeConnection();
				String sql = "select * from customer where email= ?;";
				PreparedStatement stat = connection.prepareStatement(sql);
				stat.setString(1, email);
				ResultSet rs = stat.executeQuery();
				while(rs.next())
				{
					customer.setName(rs.getString("name"));
					customer.setEmail(rs.getString("email"));
					customer.setLastName(rs.getString("lastName"));
					customer.setPhoneNumber(rs.getLong("phoneNumber"));
					
				}//end of while
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("get details me faata");
			}
			return customer;
		}//end of getDetails

		public int updatation(String update, String updateValues,String email)
		{
			int i=0;
			try
			{
				Connection connection = makeConnection();
				System.out.println("update customer set "+update +" ? where email ="+email+" ;");
				PreparedStatement stat = connection.prepareStatement("update customer  set "+update+" =?  where email ='"+email+"' ; ");
				stat.setString(1, updateValues);
				i = stat.executeUpdate();
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("update me faat gya");
			}
			return i;
		}//end of updatation
}//end of shopDAO
