import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MagicReflection {
    public Class[] getClasses(){
        return JavaDonLibrary.class.getDeclaredClasses();
    }

    public Method[] getMethods(String className){
        for (Class<?> cls : JavaDonLibrary.class.getDeclaredClasses()) {
            if (cls.getSimpleName().equals(className)) {
                return cls.getDeclaredMethods();
            }
        }
        return new Method[0];
    }

    public String callRevealHiddenSpell() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        SecretsOfFlying secretsOfFlying = new SecretsOfFlying();
        Method method = secretsOfFlying.getClass().getDeclaredMethod("revealHiddenSpell");
        method.setAccessible(true);
        return (String) method.invoke(secretsOfFlying);
    }

    public String callCastSpell(String spellName) throws NoSuchFieldException, IllegalAccessException {
        SecretsOfFlying secretsOfFlying = new SecretsOfFlying();
        Field field = SecretsOfFlying.class.getDeclaredField("spellName");
        field.setAccessible(true);
        field.set(secretsOfFlying,spellName);
        return secretsOfFlying.castSpell();
    }
}
