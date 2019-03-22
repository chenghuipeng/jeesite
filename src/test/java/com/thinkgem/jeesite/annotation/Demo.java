package com.thinkgem.jeesite.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class Demo {




    public static String query(Person person){
        StringBuffer sb  = new StringBuffer();

        Class c = person.getClass();
        boolean exist = c.isAnnotationPresent(Table.class);
        if(!exist)
            return null;
        Table table = (Table) c.getAnnotation(Table.class);
        String tableName = table.value();
        sb.append(" select * from ").append(tableName).append("  where 1=1  ");
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            boolean   fExist = field.isAnnotationPresent(Column.class);
            if(!fExist)
                return null;
            Column column = field.getAnnotation(Column.class);
            String columnName = column.value();
            String fieldName  = field.getName();
            Object fieldValue = null;

            String getMethodName = "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
            try{
                Method method = c.getMethod(getMethodName);
                fieldValue  = method.invoke(person);
            }catch (Exception e){
                e.printStackTrace();
            }
            //sb.append(" and ").append(columnName).append("=").append("'").append(fieldValue).append("'");
            if(fieldValue == null )
                continue;
            sb.append("  and  ").append(fieldName);
            if(fieldValue instanceof  String){
                if(((String) fieldValue).contains(",")){
                    String[] values = ((String) fieldValue).split(",");
                    sb.append(" in( ");
                    for (String value : values) {
                        sb.append("'").append(value).append("'").append(",");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    sb.append(")");
                }else {
                    sb.append("=").append("'").append(fieldValue).append("'");
                }
            }else  if(fieldValue instanceof  Integer){
                sb.append("=").append(fieldValue);
            }

        }
        return  sb.toString();
    }


    public static void main(String[] args) {


        Person p = new Person();
        p.setId(122);
        p.setName("a");
        p.setUserName("abc");

        String str = query(p);
        System.out.println(str);








    }









}
