package ru.orlov.utilites;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.orlov.utilites.model.JrnMemo;

class Utilites {
    
    public static void callMethods(){
        JrnMemo jrnMemo = new JrnMemo();
        //jrnMemo.setMemo("testString");
        
        System.out.println(isEmptyObject(jrnMemo));
        
    }    
    
    
    public static boolean isEmptyObject(Object className){
        Method[] method = className.getClass().getMethods();
        for (Method methodName : method) {
            try {
                if (methodName.getName().contains("get") && !((methodName.getName().equals("getClass")))) {
                    if (!(methodName.invoke(className, new Object[]{}) == null)) {
                        return false;
                    }
                }
            }catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
                Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return true;
    }

   
}
