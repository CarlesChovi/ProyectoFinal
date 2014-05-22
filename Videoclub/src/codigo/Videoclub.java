package codigo;

public class Videoclub {
	
		private String titulo;
		private String director;
		private String año;
		private String actores;
		private String genero;
		

		public Videoclub(){
			titulo="";
			director="";
			año="";
			actores="";
			genero="";
		}

		public void setTitulo(String a){
			titulo=a;
		}
		public void setDirector(String b){
			director=b;
		}
		public void setAño(String c){
			año=c;
		}
		public void setActores(String d){
			actores=d;
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
		public String getAño(){
			return año;
		}
		public String getActores(){
			return actores;
		}
		public String getGenero(){
			return genero;
		}
		
		//en el JComboBox aparecera el titulo
		public String toString(){
			return titulo;
		}

}
