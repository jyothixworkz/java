package com.xworkz.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.ResolverStyle;
import java.util.concurrent.atomic.AtomicInteger;

import javax.print.DocFlavor.SERVICE_FORMATTED;

import org.w3c.dom.ls.LSResourceResolver;

import com.mysql.cj.protocol.a.BinaryResultsetReader;
import com.xworkz.java.constant.ClassModifier;
import com.xworkz.java.constant.ClassNames;
import com.xworkz.java.constant.MethodModifier;
import com.xworkz.java.dto.JavaDTO;
 import static com.xworkz.java.constant.MySqlProperties.*;
public class JavaDAOImpl implements JavaDAO
{

	@Override
	public boolean save(JavaDTO javaDTO) {
		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			System.err.println("❤❤❤❤❤❤❤❤❤❤❤❤❤");
			String select="insert into java.java_inf values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			 PreparedStatement preparedStatement= connection.prepareStatement(select);
			 preparedStatement.setInt(1, javaDTO.getId());
			 preparedStatement.setString(2,javaDTO.getClassName().getClassName().trim());
			 preparedStatement.setString(3, javaDTO.getParent().trim());
			 preparedStatement.setString(4, javaDTO.getMainParent().trim());
			 preparedStatement.setString(5, javaDTO.getOneMethodName().trim());
			 preparedStatement.setInt(6, javaDTO.getNoOfmethods());
			 preparedStatement.setString(7, javaDTO.getMainThread().trim());
			 preparedStatement.setString(8, javaDTO.getMethodsModifier().getMethodMadifier().trim());
			 preparedStatement.setString(9, javaDTO.getReturnType().trim());
			 preparedStatement.setString(10, javaDTO.getArgType().trim());
			 preparedStatement.setInt(11, javaDTO.getDefaultConstructor());
			 preparedStatement.setString(12, javaDTO.getClassModifier().getClassModifier().trim());
			 preparedStatement.setInt(13, javaDTO.getNoOfClassModifier());
			 preparedStatement.setInt(14, javaDTO.getNoOfMethodModifier());
			 preparedStatement.setInt(15, javaDTO.getNoOfConstructorModifier());
			 preparedStatement.setString(16, javaDTO.getConstructorReturnType());
			 preparedStatement.setString(17, javaDTO.getConstructorType());
			 preparedStatement.setString(18, javaDTO.getChildClass());
			 preparedStatement.setInt(19, javaDTO.getNoOfChildClass());
			 preparedStatement.setInt(20, javaDTO.getNoOfParent());
             preparedStatement.setString(21, javaDTO.getDefaultParent());
             System.err.println("🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️");
			  int noOfRowsEffected=preparedStatement.executeUpdate();
			 
			 System.out.println(noOfRowsEffected);
			 
			 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public JavaDTO findByid(int id) {
		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String select="SELECT * FROM java.java_inf where id=?";
			PreparedStatement preparedStatement= connection.prepareCall(select);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				 Integer id1=resultSet.getInt(1);
				 String className1=resultSet.getString(2);
				  String parent1=resultSet.getString(3);
				  String mainParent1=resultSet.getString(4);
				  String  oneMethodName1=resultSet.getString(5);
				  Integer noOfmethods1=resultSet.getInt(6);
				  String mainThread1=resultSet.getString(7);
				  String methodsModifier1=resultSet.getString(8);
				  String returnType1=resultSet.getString(9);
				  String argType1=resultSet.getString(10);
				  Integer defaultConstructor1=resultSet.getInt(11);
				  String classModifie=resultSet.getString(12);
				  Integer noOfClassModifier1=resultSet.getInt(13);
				  Integer noOfMethodModifier1=resultSet.getInt(14);
				  Integer noOfConstructorModifier1=resultSet.getInt(15);
				  String constructorReturnType1=resultSet.getString(16);
				  String constructorType1=resultSet.getString(17);
				  String childClass1=resultSet.getString(18);
				  Integer noOfChildClass1=resultSet.getInt(19);
				  Integer noOfParent1=resultSet.getInt(20);
				  String defaultParent1=resultSet.getString(21);
				  JavaDTO javaDTO=new JavaDTO();
				  javaDTO.setId(id1);
				  javaDTO.setClassName(ClassNames.getByName(className1));
				  javaDTO.setParent(parent1);
				  javaDTO.setMainParent(mainParent1);
				  javaDTO.setOneMethodName(oneMethodName1);
				  javaDTO.setNoOfmethods(noOfmethods1);
				  javaDTO.setMainThread(mainThread1);
				  javaDTO.setMethodsModifier(MethodModifier.getByModifier(methodsModifier1));
				  javaDTO.setReturnType(returnType1);
				  javaDTO.setArgType(argType1);
				  javaDTO.setDefaultConstructor(defaultConstructor1);
				  javaDTO.setClassModifier(ClassModifier.getbyname(classModifie));
				  javaDTO.setNoOfClassModifier(noOfClassModifier1);
				  javaDTO.setNoOfMethodModifier(noOfMethodModifier1);
				  javaDTO.setNoOfConstructorModifier(noOfConstructorModifier1);
				  javaDTO.setConstructorReturnType(constructorReturnType1);
				  javaDTO.setConstructorType(constructorType1);
				  javaDTO.setChildClass(childClass1);
				  javaDTO.setNoOfChildClass(noOfChildClass1);
				  javaDTO.setNoOfParent(noOfParent1);
				  javaDTO.setDefaultParent(defaultParent1);
				  
				return javaDTO;  
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public JavaDTO findByidAndclassName(int id, String classNamel) {
		try(	Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String select="SELECT * FROM java.java_inf where id=? and classNamel=?";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, classNamel);
			System.out.println("🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️");
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				 Integer id1=resultSet.getInt(1);
				 String className1=resultSet.getString(2);
				  String parent1=resultSet.getString(3);
				  String mainParent1=resultSet.getString(4);
				  String  oneMethodName1=resultSet.getString(5);
				  Integer noOfmethods1=resultSet.getInt(6);
				  String mainThread1=resultSet.getString(7);
				  String methodsModifier1=resultSet.getString(8);
				  String returnType1=resultSet.getString(9);
				  String argType1=resultSet.getString(10);
				  Integer defaultConstructor1=resultSet.getInt(11);
				  String classModifie=resultSet.getString(12);
				  Integer noOfClassModifier1=resultSet.getInt(13);
				  Integer noOfMethodModifier1=resultSet.getInt(14);
				  Integer noOfConstructorModifier1=resultSet.getInt(15);
				  String constructorReturnType1=resultSet.getString(16);
				  String constructorType1=resultSet.getString(17);
				  String childClass1=resultSet.getString(18);
				  Integer noOfChildClass1=resultSet.getInt(19);
				  Integer noOfParent1=resultSet.getInt(20);
				  String defaultParent1=resultSet.getString(21);
				  JavaDTO javaDTO=new JavaDTO();
				  javaDTO.setId(id1);
				  javaDTO.setClassName(ClassNames.getByName(className1));
				  javaDTO.setParent(parent1);
				  javaDTO.setMainParent(mainParent1);
				  javaDTO.setOneMethodName(oneMethodName1);
				  javaDTO.setNoOfmethods(noOfmethods1);
				  javaDTO.setMainThread(mainThread1);
				  javaDTO.setMethodsModifier(MethodModifier.getByModifier(methodsModifier1));
				  javaDTO.setReturnType(returnType1);
				  javaDTO.setArgType(argType1);
				  javaDTO.setDefaultConstructor(defaultConstructor1);
				  javaDTO.setClassModifier(ClassModifier.getbyname(classModifie));
				  javaDTO.setNoOfClassModifier(noOfClassModifier1);
				  javaDTO.setNoOfMethodModifier(noOfMethodModifier1);
				  javaDTO.setNoOfConstructorModifier(noOfConstructorModifier1);
				  javaDTO.setConstructorReturnType(constructorReturnType1);
				  javaDTO.setConstructorType(constructorType1);
				  javaDTO.setChildClass(childClass1);
				  javaDTO.setNoOfChildClass(noOfChildClass1);
				  javaDTO.setNoOfParent(noOfParent1);
				  javaDTO.setDefaultParent(defaultParent1);
				  
				return javaDTO;  
			}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public JavaDTO findByidAndParentAndMainThread(int id, String parent, String mainThread) {

		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String Select="SELECT * FROM java.java_inf where id=? and parent=? and mainThread=?";
			PreparedStatement preparedStatement=connection.prepareCall(Select);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, parent);
			preparedStatement.setString(3, mainThread);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id3=resultSet.getInt(1);
				String parent3=resultSet.getString(3);
				String mainThread3=resultSet.getString(7);
				JavaDTO javaDTO= new JavaDTO();
				javaDTO.setId(1);
				javaDTO.setParent(parent3);
				javaDTO.setMainThread(mainThread3);
				return javaDTO;
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public JavaDTO findByidAndMainThread(int id, String mainThread) {
		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String select="SELECT * FROM java.java_inf where id=? and mainThread=?";
			PreparedStatement preparedStatement= connection.prepareCall(select);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, mainThread);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				 Integer id1=resultSet.getInt(1);
				 String className1=resultSet.getString(2);
				  String parent1=resultSet.getString(3);
				  String mainParent1=resultSet.getString(4);
				  String  oneMethodName1=resultSet.getString(5);
				  Integer noOfmethods1=resultSet.getInt(6);
				  String mainThread1=resultSet.getString(7);
				  String methodsModifier1=resultSet.getString(8);
				  String returnType1=resultSet.getString(9);
				  String argType1=resultSet.getString(10);
				  Integer defaultConstructor1=resultSet.getInt(11);
				  String classModifie=resultSet.getString(12);
				  Integer noOfClassModifier1=resultSet.getInt(13);
				  Integer noOfMethodModifier1=resultSet.getInt(14);
				  Integer noOfConstructorModifier1=resultSet.getInt(15);
				  String constructorReturnType1=resultSet.getString(16);
				  String constructorType1=resultSet.getString(17);
				  String childClass1=resultSet.getString(18);
				  Integer noOfChildClass1=resultSet.getInt(19);
				  Integer noOfParent1=resultSet.getInt(20);
				  String defaultParent1=resultSet.getString(21);
				  JavaDTO javaDTO=new JavaDTO();
				  javaDTO.setId(id1);
				  javaDTO.setClassName(ClassNames.getByName(className1));
				  javaDTO.setParent(parent1);
				  javaDTO.setMainParent(mainParent1);
				  javaDTO.setOneMethodName(oneMethodName1);
				  javaDTO.setNoOfmethods(noOfmethods1);
				  javaDTO.setMainThread(mainThread1);
				  javaDTO.setMethodsModifier(MethodModifier.getByModifier(methodsModifier1));
				  javaDTO.setReturnType(returnType1);
				  javaDTO.setArgType(argType1);
				  javaDTO.setDefaultConstructor(defaultConstructor1);
				  javaDTO.setClassModifier(ClassModifier.getbyname(classModifie));
				  javaDTO.setNoOfClassModifier(noOfClassModifier1);
				  javaDTO.setNoOfMethodModifier(noOfMethodModifier1);
				  javaDTO.setNoOfConstructorModifier(noOfConstructorModifier1);
				  javaDTO.setConstructorReturnType(constructorReturnType1);
				  javaDTO.setConstructorType(constructorType1);
				  javaDTO.setChildClass(childClass1);
				  javaDTO.setNoOfChildClass(noOfChildClass1);
				  javaDTO.setNoOfParent(noOfParent1);
				  javaDTO.setDefaultParent(defaultParent1);
				  
				return javaDTO;  
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

	@Override
	public String findMainThreadByid(int id) {
		
		try(	Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String select="SELECT * FROM java.java_inf where id=?";
			PreparedStatement preparedStatement=connection.prepareCall(select);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				
			String mainThread2=resultSet.getString(7);
			//JavaDTO javaDTO=new JavaDTO();
			//javaDTO.setMainThread(mainThread2);
			 
			return mainThread2;
			
				
				
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public String findParentByidAndMainThread(int id, String mainThread) {
		try (Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());){
			String select = "SELECT * FROM java.java_inf where id=? and mainThread=?";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2, mainThread);
			ResultSet resultSet=preparedStatement.executeQuery();
			System.out.println("🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️");
			while(resultSet.next()) {
				System.out.println("🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️");
			String parent3 =resultSet.getString(3);
			
				return parent3;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getTotal() {
		try (	Connection connection =DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());){
			String select ="SELECT * FROM java.java_inf";
			PreparedStatement preparedStatement=connection.prepareCall(select);
			  ResultSet resultSet=preparedStatement.executeQuery();
			  AtomicInteger atomicInteger=new AtomicInteger();
			  while(resultSet.next()) {
				  atomicInteger.incrementAndGet();
				  
				  
			  }
			  System.err.println(atomicInteger.get());	  
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public JavaDTO findClassNameByMaxNoOfMethod() {
		
		try(Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {
			String select="SELECT * FROM java.java_inf ";
			PreparedStatement preparedStatement= connection.prepareCall(select);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				 Integer id1=resultSet.getInt(1);
				 String className1=resultSet.getString(2);
				  String parent1=resultSet.getString(3);
				  String mainParent1=resultSet.getString(4);
				  String  oneMethodName1=resultSet.getString(5);
				  Integer noOfmethods1=resultSet.getInt(6);
				  String mainThread1=resultSet.getString(7);
				  String methodsModifier1=resultSet.getString(8);
				  String returnType1=resultSet.getString(9);
				  String argType1=resultSet.getString(10);
				  Integer defaultConstructor1=resultSet.getInt(11);
				  String classModifie=resultSet.getString(12);
				  Integer noOfClassModifier1=resultSet.getInt(13);
				  Integer noOfMethodModifier1=resultSet.getInt(14);
				  Integer noOfConstructorModifier1=resultSet.getInt(15);
				  String constructorReturnType1=resultSet.getString(16);
				  String constructorType1=resultSet.getString(17);
				  String childClass1=resultSet.getString(18);
				  Integer noOfChildClass1=resultSet.getInt(19);
				  Integer noOfParent1=resultSet.getInt(20);
				  String defaultParent1=resultSet.getString(21);
				  JavaDTO javaDTO=new JavaDTO();
				  javaDTO.setId(id1);
				  javaDTO.setClassName(ClassNames.getByName(className1));
				  javaDTO.setParent(parent1);
				  javaDTO.setMainParent(mainParent1);
				  javaDTO.setOneMethodName(oneMethodName1);
				  javaDTO.setNoOfmethods(noOfmethods1);
				  javaDTO.setMainThread(mainThread1);
				  javaDTO.setMethodsModifier(MethodModifier.getByModifier(methodsModifier1));
				  javaDTO.setReturnType(returnType1);
				  javaDTO.setArgType(argType1);
				  javaDTO.setDefaultConstructor(defaultConstructor1);
				  javaDTO.setClassModifier(ClassModifier.getbyname(classModifie));
				  javaDTO.setNoOfClassModifier(noOfClassModifier1);
				  javaDTO.setNoOfMethodModifier(noOfMethodModifier1);
				  javaDTO.setNoOfConstructorModifier(noOfConstructorModifier1);
				  javaDTO.setConstructorReturnType(constructorReturnType1);
				  javaDTO.setConstructorType(constructorType1);
				  javaDTO.setChildClass(childClass1);
				  javaDTO.setNoOfChildClass(noOfChildClass1);
				  javaDTO.setNoOfParent(noOfParent1);
				  javaDTO.setDefaultParent(defaultParent1);
				  
				return javaDTO;  
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}


	}




