package OopsConcepts;
 class ObjectDemo3 {
	 String FirstString = "Hello World";
		   public static void main(String[] args)
		   {
		       try
		       {
		           Class Message = Class.forName("ObjectDemo2");
		           ObjectDemo2 obj =
		                   (ObjectDemo2) Message.newInstance();
		           System.out.println(obj.FirstString);
		       }
		       catch (ClassNotFoundException e)
		       {
		           e.printStackTrace();
		       }
		       catch (InstantiationException e)
		       {
		           e.printStackTrace();
		       }
		       catch (IllegalAccessException e)
		       {
		           e.printStackTrace();
		       }
		   }
}
