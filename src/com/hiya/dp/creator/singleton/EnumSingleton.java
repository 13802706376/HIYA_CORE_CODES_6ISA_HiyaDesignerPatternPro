package com.hiya.dp.creator.singleton;
public class EnumSingleton
{
    public static EnumSingleton getSigleInstance()
    {
        return SigleInstance.INSTANCE.instance;
    }
    
    public enum SigleInstance
    {
        INSTANCE;
        private EnumSingleton instance;

        SigleInstance()
        {
            instance = new EnumSingleton();
        }

        public EnumSingleton getInstance()
        {
            return instance;
        }
    }
}
