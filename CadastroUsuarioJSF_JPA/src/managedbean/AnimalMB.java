package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.AnimalDAO;
import model.Animal;

@ManagedBean
@SessionScoped
public class AnimalMB {
	private ArrayList<Animal> animais;
	private Animal animal;
	private AnimalDAO dao;
	
	public AnimalMB() {
		animais = new ArrayList<>();
		animal = new Animal();
		dao = new AnimalDAO();
	}

	/*public ArrayList<Animal> geraAnimais() {
		ArrayList<Animal> animais = new ArrayList<>();
		animais.add(new Animal("Mamifero", "Rex", 10.5f));
		animais.add(new Animal("Mamifero", "Mimi", 20f));
		animais.add(new Animal("Mamifero", "Pipa", 5f));
		animais.add(new Animal("Mamifero", "Draco", 11f));
		animais.add(new Animal("Mamifero", "JJ", 3.7f));
		animais.add(new Animal("Mamifero", "Pipa", 2f));
		return animais;
	}
*/
	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public String addAnimalLista() {
		dao.save(this.animal);
		animais.add(this.animal);
		animal = new Animal();
		return "listaAnimais";
	}

}
