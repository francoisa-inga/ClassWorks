package lesson3;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Lesson3 {
    private int sum (int y, String b) {
        System.out.println("sum executed for "+this.defaultName);
        return y;
    }
    protected String defaultName;
    public int myInt = 5;
    protected boolean myFlag = true;
    protected String comitting = "commit";
/**
    public Lesson3(){}

    public Lesson3(String name){
        this.defaultName = name;
    }*/
}
