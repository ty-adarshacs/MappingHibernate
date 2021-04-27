package com.ty.hibernate.demo5.hibernateonetoonemappinglock;

import com.tyss.hibernate.main.ManytoMany;
import com.tyss.hibernate.main.OnetoOne;
import com.tyss.hibernate.main_onetomany.Main;

public class Switch_Mapping 
{
    public static void main( String[] args )
    {
    	ManytoMany mm=new ManytoMany();//	MANY TO MANY
    	OnetoOne oo=new OnetoOne();    //ONT TO ONE
    	Main m=new Main();             //ONE TO MANY
        char ch='m';
        switch(ch) {
        case 'm' : mm.manytomany();
        break;
        case 'a' :m.onetomanymapping();
        break;
        case 'o' : oo.onetoonemappinghibernate();
        break;
        default : System.out.println(" invalid characyer");
        break;
        }
    }
}
