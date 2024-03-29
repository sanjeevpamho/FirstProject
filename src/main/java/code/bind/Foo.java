package code.bind;

//import com.google.common.base.Preconditions;

public class Foo {
	
	private final String s;

    public Foo(String s) {
    //	Preconditions.checkNotNull(s, "String can not be null");
   
    
        this.s = s;
    }

    public int getStringLength() {
        return s.length();
    }
}
