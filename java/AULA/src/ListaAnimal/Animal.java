package ListaAnimal;

public class Animal {
			private String name;
			private int age;
			private boolean emiteSom = false; 
			private boolean correr = false;

			public Animal(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			public void emitirSom() {
				System.out.println("Emitindo som..");
			}
			public void correr(){
				System.out.println("Correndo..");
			}
	
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}
			
			@Override
			public String toString() {
				return "Animal [name=" + name + ", age=" + age + ", emiteSom=" + emiteSom + ", correr=" + correr + "]";
			}

			
		}


