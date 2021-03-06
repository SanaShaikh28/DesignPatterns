package com.bridgelabz.creationalSingleton;

import java.io.Serializable;

/**Purpose: This is implementation of  SerializedSingleton class.
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class SerializedSingleton implements Serializable{
	
	public static void main(String[] args)
	{
		System.out.println(""+getInstance());
		//System.out.println(""+SingletonHelper.instance);

	}

    private static final long serialVersionUID = -7604766932017737115L;

    //constructor
    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    //public static method to return object
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
}