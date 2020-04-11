package com.estore.ecommerce.ecommerce.util;

import java.io.Serializable;
import java.sql.*;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class DepartmentIdGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor SharedSession, Object object) throws HibernateException {
		String prefix = "USER";
        Connection connection = SharedSession.connection();
        try {
            Statement statement=connection.createStatement();

            ResultSet rs=statement.executeQuery("select count(user_id) as Id from ecommerce.USER_INFO");
            if(rs.next())
            {
                int id=rs.getInt(1)+101;
                String generatedId = prefix + new Integer(id).toString();
                System.out.println("Generated Id: " + generatedId);
                return generatedId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}
}