package com.xworkz.java.dto;

import java.io.Serializable;

import com.xworkz.java.constant.ClassModifier;
import com.xworkz.java.constant.ClassNames;
import com.xworkz.java.constant.MethodModifier;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class JavaDTO implements Serializable {
	
private Integer id;
private ClassNames className;
private String parent;
private String mainParent;
private String  oneMethodName;
private Integer noOfmethods;
private String mainThread;
private MethodModifier methodsModifier;
private String returnType;
private String argType;
private Integer defaultConstructor;
private ClassModifier classModifier;
private Integer noOfClassModifier;
private Integer noOfMethodModifier;
private Integer noOfConstructorModifier;
private String constructorReturnType;
private String constructorType;
private String childClass;
private Integer noOfChildClass;
private Integer noOfParent;
private String defaultParent;
}
