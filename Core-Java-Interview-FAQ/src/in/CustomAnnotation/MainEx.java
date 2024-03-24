package in.CustomAnnotation;

import java.lang.annotation.Annotation;

public class MainEx {
	
	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		Class c=d.getClass();
		System.out.println(c.getName());
		
		Annotation ann = c.getAnnotation(MyAnno.class);
		
//		System.out.println(ann);
//		Value get karne keliye Data Show 
		MyAnno an = (MyAnno)c.getAnnotation(MyAnno.class);
		
		System.out.println(an.city());
	}

}
