package DesignPatterns.PlayerRole;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Player {
    Set<AbstractRole> roles=new HashSet<>();

    public Player() {}

    public AbstractRole addRole(Class<?> role, Object...objects ){
        AbstractRole result=null;
        try {
            Constructor c = Class.forName(role.getName()).getConstructor(String.class, Integer.TYPE);
            result = (AbstractRole) c.newInstance("example", 34);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            System.exit(1);
        }
        result.configure(objects);
        roles.add(result);
        return result;
    }

    public void removeRole(Class<?> role){
        assert role!=null;

        roles.removeIf(new Predicate<AbstractRole>() {

            @Override
            public boolean test(AbstractRole t) {
                return t.getClass().equals(role);
            }

        });

    }

    public AbstractRole getRole(Class<?> role){
        assert role!=null;

        for (AbstractRole r: roles){
            if (r.getClass().equals(role)){
                return r;
            }
        }
        return null;
    }
}