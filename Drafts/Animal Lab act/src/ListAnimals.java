public class ListAnimals {
    Animal[] animals;
    int count;

    public ListAnimals(int maxArray){
        animals = new Animal[maxArray];
    }

    public boolean addAnimal(Animal a){
        String temp1 = ((Pet) a).getName();
        String temp2 = null;
        for(int i = 0; i < count; i++){
            temp2 = ((Pet)animals[i]).getName();
            if(temp1.equals(temp2)){
                System.out.println("Name must be Unique");
                return false;
            }
        }
        animals[count] = a;
        count++;
        return true;
    }

    public Animal searchByName(String name){
//        for(Animal a : animals){
//            Pet p = (Pet) a;
//            if(p.getName().equals(name)){
//                return a;
//            }
//        }

        for(int i = 0; i < count; i++){
            if(animals[i] instanceof Pet){
                if(((Pet) animals[i]).getName().equals(name)){
                    return animals[i];
                }
            }
        }
        System.out.printf("Animal is not in the list");
        return null;
    }

    public Animal deleteAnimal(String name){
        Animal temp = null;
        for(int i = 0; i <= count-1; i++){
            if(searchByName(name)!=null){
                temp = searchByName(name);
                animals[i] = animals[i+1];
                animals[count-1] = null;
                count--;
                return temp;
            }
        }
        System.out.printf("Animal is not in the list");
        return null;
    }

    public void display(){
        for(int i = 0; i < count; i++){

            System.out.println( ((Pet) animals[i]).getName() + " the " + animals[i].getClass().getSimpleName() + " is in the list.");
        }

    }
}
