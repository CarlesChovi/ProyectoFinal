package codigo;

public class Videoclub {
	
		private String titulo;
		private String director;
		private int año;
		private String genero;
		

		public Videoclub(){
			titulo="";
			director="";
			año=0;
			genero="";
		}

		public void setTitulo(String a){
			titulo=a;
		}
		public void setDirector(String b){
			director=b;
		}
		public void setAño(int c){
			año=c;
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
		public int getAño(){
			return año;
		}
		public String getGenero(){
			return genero;
		}
		
		//en el JComboBox aparecera el titulo
		public String toString(){
			return titulo;
		}

}
