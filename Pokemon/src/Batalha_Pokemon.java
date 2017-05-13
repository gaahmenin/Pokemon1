abstract class Pokemon
{
	String NomePoke;
	double HP;
	int Tipo;//Tipo 1= Dragao,2=Fogo, 3=gelo, agua=4, eletrico = 5, psiquico=6, fantasma=7, dark = 8, normal=9,lutador = 10;
	int Fraquesa;
	double Ataque1;
	double Ataque2;
	double Ataque3;
	double Ataque4;
	String NoAtaque1;
	String NoAtaque2;
	String NoAtaque3;
	String NoAtaque4;
}
class Dragonite extends Pokemon
{
	public Dragonite()
	{
		this.NomePoke="Dragonite";
		this.HP=386.0;
		this.Tipo=1;
		this.Fraquesa=3;
		this.NoAtaque1="Outrage";
		this.NoAtaque2="Dragon Rush";
		this.NoAtaque3="Dragon Tail";
		this.NoAtaque4="Twister";
		this.Ataque1=120.0;
		this.Ataque2=100.0;
		this.Ataque3=60.0;
		this.Ataque4=40.0;
	}
}
class Charizard extends Pokemon
{
	public Charizard(){
		this.NomePoke="Charizard";
		this.HP=360.0;
		this.Tipo=2;
		this.Fraquesa=4;
		this.NoAtaque1="Flare Blitz";
		this.NoAtaque2="Heat Wave";
		this.NoAtaque3="Inferno";
		this.NoAtaque4="Flamethrower";
		this.Ataque1=120.0;
		this.Ataque2=95.0;
		this.Ataque3=100.0;
		this.Ataque4=90.0;
	}
}
class Lapras extends Pokemon
{
	public Lapras(){
		this.NomePoke="Lapras";
		this.HP=464.0;
		this.Tipo=3;
		this.Fraquesa = 2;
		this.NoAtaque1="Blizzard";
		this.NoAtaque2="Frost Breath";
		this.NoAtaque3="Ice Beam";
		this.NoAtaque4="Freeze-Dry";
		this.Ataque1=110.0;
		this.Ataque2=60.0;
		this.Ataque3=90.0;
		this.Ataque4=70.0;
	}
}
class Gyarados extends Pokemon
{
	public Gyarados(){
		this.NomePoke="Gyarados";
		this.HP=394.0;
		this.Tipo=4;
		this.Fraquesa =5;
		this.NoAtaque1="Hydro Pump";
		this.NoAtaque2="Aqua Tail";
		this.NoAtaque3="Scald";
		this.NoAtaque4="Surf";
		this.Ataque1=110.0;
		this.Ataque2=90.0;
		this.Ataque3=80.0;
		this.Ataque4=90.0;
	}
}
class Alakazam extends Pokemon
{
	public Alakazam(){
		this.NomePoke="Alakazam";
		this.HP=314.0;
		this.Tipo=6;
		this.Fraquesa =7;
		this.NoAtaque1="Future Sight";
		this.NoAtaque2="Psychic";
		this.NoAtaque3="Psycho Cut";
		this.NoAtaque4="Psybeam";
		this.Ataque1=120.0;
		this.Ataque2=90.0;
		this.Ataque3=70.0;
		this.Ataque4=65.0;
	}
}
class Gengar extends Pokemon
{
	public Gengar(){
		this.NomePoke="Gengar";
		this.HP=324.0;
		this.Tipo=7;
		this.Fraquesa =8;
		this.NoAtaque1="Hex";
		this.NoAtaque2="Shadow Ball";
		this.NoAtaque3="Shadow Punch";
		this.NoAtaque4="Shadow Claw";
		this.Ataque1=65.0;
		this.Ataque2=80.0;
		this.Ataque3=60.0;
		this.Ataque4=70.0;
	}
}
class Snorlax extends Pokemon
{
	public Snorlax(){
		this.NomePoke="Snorlax";
		this.HP=524.0;
		this.Tipo=9;
		this.Fraquesa =10;
		this.NoAtaque1="Giga Impact";
		this.NoAtaque2="Hyper Beam";
		this.NoAtaque3="Facade";
		this.NoAtaque4="Chip Away";
		this.Ataque1=150.0;
		this.Ataque2=150.0;
		this.Ataque3=70.0;
		this.Ataque4=70.0;
	}
}
class Machamp extends Pokemon
{
	public Machamp(){
		this.NomePoke="Machamp";
		this.HP=384.0;
		this.Tipo=10;
		this.Fraquesa =6;
		this.NoAtaque1="Dynamic Punch";
		this.NoAtaque2="Cross Chop";
		this.NoAtaque3="Submission";
		this.NoAtaque4="Vital Throw";
		this.Ataque1=100.0;
		this.Ataque2=100.0;
		this.Ataque3=80.0;
		this.Ataque4=70.0;
	}
}
class Arcanine extends Pokemon
{
	public Arcanine(){
		this.NomePoke="Arcanine";
		this.HP=384.0;
		this.Tipo=2;
		this.Fraquesa =4;
		this.NoAtaque1="Overheat";
		this.NoAtaque2="Fire Blast";
		this.NoAtaque3="Flamethrower";
		this.NoAtaque4="Fire Fang";
		this.Ataque1=130.0;
		this.Ataque2=110.0;
		this.Ataque3=90.0;
		this.Ataque4=65.0;
	}
}
class Mewtwo extends Pokemon
{
	public Mewtwo(){
		this.NomePoke="Mewtwo";
		this.HP=416.0;
		this.Tipo=6;
		this.Fraquesa =7;
		this.NoAtaque1="Future Sight";
		this.NoAtaque2="Psystrike";
		this.NoAtaque3="Dream Eater";
		this.NoAtaque4="Psychic";
		this.Ataque1=120.0;
		this.Ataque2=100.0;
		this.Ataque3=100.0;
		this.Ataque4=90.0;
	}
}
abstract class Treinador
{
	String NomeTreinador;
	int QuantPoke;
	int PokeVivos;
	Pokemon []Vet=new Pokemon[6];
	int acoes[];
}
class Ash extends Treinador
{
	public Ash(){
		this.NomeTreinador="Ash";
		this.QuantPoke=6;
		this.Vet[0]=new Charizard();
		}

}
class Trash extends Treinador
{
	public Trash(){
		this.NomeTreinador="Trash";
		this.QuantPoke=6;
		this.Vet[0]=new Dragonite();
		}

}



abstract class Event {
	abstract public void action();
	abstract public String description();
}

class EventSet {
	private Event[] events = new Event[100];
	private int index = 0;
	private int next = 0;
	public void add(Event e) {
		if(index >= events.length)
			return; // (In real life, throw exception)
		events[index++] = e;
	}
}

public class Batalha_Pokemon extends Event{
	static int i=0;
	static int j=0;
	String vencedor;
	boolean acabou;
	Treinador treinadorA;
	Treinador treinadorB;
	Pokemon PokemonA;
	Pokemon PokemonB;
	
	public Batalha_Pokemon(Treinador a, Treinador b){
		this.treinadorA=a;
		this.treinadorB=b;
		this.PokemonA= a.Vet[i];
		this.PokemonB= b.Vet[j];	
	}
	public void getAction (Treinador a,Treinador b){
		while (acabou = false){
			int m=0;
			int n=0;
			int acaoA,acaoB;
		acaoA=a.acoes[m];
		acaoB=b.acoes[n];
		}
	}
	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}
	public void action(Treinador a, Treinador b){
		acabou = false;
	}
	public String description(Treinador a, Treinador b){
		return a.NomeTreinador +" inicia batalha com o "+b.NomeTreinador;
	}
	

}
class Fuga extends Batalha_Pokemon{
	
	public Fuga(Treinador a, Treinador b) {
		super(a, b);	
	}
	public String description(Treinador a, Treinador b){
		return "Treinador " + a.NomeTreinador + " fugiu da batalha";
	}
	public void action(Treinador a,Treinador b){
		acabou = true;
		vencedor = b.NomeTreinador;
	}
}
class Item extends Batalha_Pokemon{
	public Item (Treinador a,Treinador b){
		super(a,b);
	}
	public String description(Treinador a,Treinador b){
		return "Treinador "+a.NomeTreinador+"usou uma poção"; 
	}
	public void action(Treinador a,Treinador b){
		a.Vet[i].HP +=100.0;
		
	}
}
class Atacar1 extends Batalha_Pokemon{
	int morto; //
	public Atacar1 (Treinador a, Treinador b){
		super(a,b);
	
	}
	public String description(Treinador a, Treinador b){
		return a.Vet[i].NomePoke+ " usou "+a.Vet[i].NoAtaque1;
	}
	public void action(Treinador a, Treinador b){
		if (a.Vet[1].Fraquesa == b.Vet[j].Tipo)
		b.Vet[j].HP -= (2*a.Vet[i].Ataque1);
		else 
			b.Vet[j].HP -= a.Vet[i].Ataque1;
		morto = (Double.compare(b.Vet[j].HP,0.0));
		if (morto <=0){
			PokemonB.HP = 0;
			b.PokeVivos--;
		}
	}
}
class Atacar2 extends Batalha_Pokemon{
	int morto; //
	public Atacar2 (Treinador a, Treinador b){
		super(a,b);
	
	}
	public String description(Treinador a, Treinador b){
		return a.Vet[i].NomePoke+ " usou "+a.Vet[i].NoAtaque2;
	}
	public void action(Treinador a, Treinador b){
		if (a.Vet[1].Fraquesa == b.Vet[j].Tipo)
		b.Vet[j].HP -= (2*a.Vet[i].Ataque2);
		else 
			b.Vet[j].HP -= a.Vet[i].Ataque2;
		morto = (Double.compare(b.Vet[j].HP,0.0));
		if (morto <=0){
			PokemonB.HP = 0;
			b.PokeVivos--;
		}
	}
}
class Atacar3 extends Batalha_Pokemon{
	int morto; //
	public Atacar3 (Treinador a, Treinador b){
		super(a,b);
	
	}
	public String description(Treinador a, Treinador b){
		return a.Vet[i].NomePoke+ " usou "+a.Vet[i].NoAtaque3;
	}
	public void action(Treinador a, Treinador b){
		if (a.Vet[1].Fraquesa == b.Vet[j].Tipo)
		b.Vet[j].HP -= (2*a.Vet[i].Ataque3);
		else 
			b.Vet[j].HP -= a.Vet[i].Ataque3;
		morto = (Double.compare(b.Vet[j].HP,0.0));
		if (morto <=0){
			PokemonB.HP = 0;
			b.PokeVivos--;
		}
	}
}
class Atacar4 extends Batalha_Pokemon{
	int morto; //
	public Atacar4 (Treinador a, Treinador b){
		super(a,b);
	
	}
	public String description(Treinador a, Treinador b){
		return a.Vet[i].NomePoke+ " usou "+a.Vet[i].NoAtaque4;
	}
	public void action(Treinador a, Treinador b){
		if (a.Vet[1].Fraquesa == b.Vet[j].Tipo)
		b.Vet[j].HP -= (2*a.Vet[i].Ataque4);
		else 
			b.Vet[j].HP -= a.Vet[i].Ataque4;
		morto = (Double.compare(b.Vet[j].HP,0.0));
		if (morto <=0){
			PokemonB.HP = 0;
			b.PokeVivos--;
		}
	}
}
class TrocarPokemonA extends Batalha_Pokemon{
	public TrocarPokemonA(Treinador a, Treinador b){
		super(a,b);
	}
	public String description(Treinador a, Treinador b){
		return "Treinador "+a.NomeTreinador+" trocou de pokemon";
	}
	public void action (Treinador a, Treinador b){
		i=i+1;
	}
}
class TrocarPokemonB extends Batalha_Pokemon{
	public TrocarPokemonB(Treinador a, Treinador b){
		super(a,b);
	}
	public String description(Treinador a, Treinador b){
		return "Treinador "+a.NomeTreinador+" trocou de pokemon";
	}
	public void action (Treinador a, Treinador b){
		j=j+1;
	}
}


public void main(String[] args) {
Ash x= new Ash();
Trash y= new Trash();
Batalha_Pokemon z= new Batalha_Pokemon(x, y);


}

