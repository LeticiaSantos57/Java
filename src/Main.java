void main(){

            Pet pet = new Pet("Rex");

            IO.println(pet.getNome());
            IO.println(pet.getHumor());

            pet.alimentar(20);
            pet.brincar(10);
            pet.dormir(20);

            IO.println(pet.getHumor());

}




