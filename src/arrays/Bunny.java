import java.util.ArrayList;

public class Bunny {
	String name;

	public Bunny(String call) {
		this.name = call;
	}    

	public void hop() {
		System.out.println(name + " hopped!");
	}

	public static void main(String[] args) {
		ArrayList<Bunny> bunnies = new ArrayList<Bunny>();
		Bunny peter = new Bunny("peter");
		Bunny rudolph = new Bunny("rudolph");
		Bunny mike = new Bunny("mike");
		Bunny tyler = new Bunny("tyler");
		Bunny tristan = new Bunny("tristan");
		Bunny karen = new Bunny("karen");
		Bunny steven = new Bunny("steven");

		bunnies.add(peter);
		bunnies.add(rudolph);
		bunnies.add(mike);
		bunnies.add(tyler);
		bunnies.add(tristan);
		bunnies.add(karen);
		bunnies.add(steven);

		int i = 2;
		for(Bunny b : bunnies) {
			int decide = i % 2;
			if(decide == 0)
				b.hop();
		    	i++;	
		}
	}	
}    
