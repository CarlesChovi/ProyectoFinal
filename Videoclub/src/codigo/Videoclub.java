package codigo;

public class Videoclub {
	
		private String titulo;
		private String director;
		private int a�o;
		private String genero;
		

		public Videoclub(){
			titulo="";
			director="";
			a�o=0;
			genero="";
		}

		public void setTitulo(String a){
			titulo=a;
		}
		public void setDirector(String b){
			director=b;
		}
		public void setA�o(int c){
			a�o=c;
		}
		public void setGenero(String e){
			genero=e;
		}
		
		public String getTitulo(){
			return titulo;
		}
		public String getDirector(){
			return director;
		}
		public int getA�o(){
			return a�o;
		}
		public String getGenero(){
			return genero;
		}
		
		//en el JComboBox aparecera el titulo
		public String toString(){
			return titulo;
		}

}
