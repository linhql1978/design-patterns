package visitor.useReflection.visitor;

import visitor.useReflection.book.Book;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class Visitor {
    public void visit(Book book) {
        Method method = getMethod(book.getClass());

        if(method==null){
            defaultVisit(book);
        }else{
            try {
                method.invoke(this,book);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    protected Method getMethod(Class<?> clazz){
        for(Class<?> anInterface : clazz.getInterfaces()){
            try {
                return this.getClass().getDeclaredMethod("visit", anInterface);
            } catch (NoSuchMethodException e) {
                // ignore
            }
        }

        while (!clazz.equals(Object.class)){
            try {
                return this.getClass().getDeclaredMethod("visit",clazz);
            } catch (NoSuchMethodException e) {
                clazz = clazz.getSuperclass();
            }
        }

        return null;
    }

    protected void defaultVisit(Book book){
        System.out.println("DefaultVisit: "+book);
    }
}
