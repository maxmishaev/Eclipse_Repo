package maxmishaev.Lesson10;


public class Cat {
   private String name;
   private int age;

   public Cat(String name, int age) {
       this.name = name;
       this.age = age;
   }
   /*
   public int compareTo(Object o) {
       Cat another = (Cat)o;
       if (this.age > another.age) {
           return 1;
       }
       if (this.age < another.age) {
           return -1;
       }
       return 0;
   }
*/
   
   public int compareTo(Object o) {
       return this.age - ((Cat)o).age;
   }


   @Override
   public String toString() {
       return "Cat [" + name + "]";
   }
}

