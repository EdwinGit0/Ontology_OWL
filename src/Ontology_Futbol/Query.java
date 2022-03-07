package Ontology_Futbol;

import java.io.ByteArrayOutputStream;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;



public class Query {
	
	private static boolean en;
	public static String TestDBpedia(String query) {

		String service = "http://dbpedia.org/sparql";

		QueryExecution qe = QueryExecutionFactory.sparqlService(service, query);
		ResultSet resultado = qe.execSelect();
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ResultSetFormatter.out(baos, resultado);
		String retval = baos.toString();
		return conversor(retval);
	}
	public static String conversor(String query) {
		String[] parte = query.split("\"");
			return parte[1];
	}
	public static String DataDbPedia(String query){
		
		switch(query){
		case "descripcion_Futbol":
			query="PREFIX dbont: <http://dbpedia.org/ontology/> "
			+"PREFIX dbp: <http://dbpedia.org/property/>"
			+"SELECT ?abstract WHERE {{ <http://dbpedia.org/resource/Association_football> <http://dbpedia.org/ontology/abstract> ?abstract ." +
			"FILTER langMatches( lang(?abstract), 'es') }" 
			+"}";
			break;
		case "tamanoEquipo_Futbol":
			query = "PREFIX dbont: <http://dbpedia.org/ontology/>"+
					"PREFIX dbp: <http://dbpedia.org/property/>"+
					"SELECT ?tamanoEquipo WHERE { <http://dbpedia.org/resource/Association_football> <http://dbpedia.org/ontology/teamSize> ?tamanoEquipo"+
							"}";
			break;
		case "bibliografia_Futbolista_Messi":
			query="PREFIX dbont: <http://dbpedia.org/ontology/> "
					+"PREFIX dbp: <http://dbpedia.org/property/>"
					+"SELECT ?bibliografia WHERE {{ <http://dbpedia.org/resource/Lionel_Messi> <http://dbpedia.org/ontology/abstract> ?bibliografia." +
					"FILTER langMatches( lang(?bibliografia), 'es') }" 
					+"}";
			break;
		case "nombre_Futbolista_Messi":
			query="SELECT ?nombre"+
				     "{ <http://dbpedia.org/resource/Lionel_Messi> <http://xmlns.com/foaf/0.1/name> ?nombre."+
					  "}";
			break;
		case "fechaNaciento_Futbolista_Messi":
			query="SELECT ?FechaNacimiento"+
				     "{ <http://dbpedia.org/resource/Lionel_Messi> <http://dbpedia.org/ontology/birthDate> ?FechaNacimiento."+
					  "}";
			break;
		case "numero_Futbolista_Messi":
			query="SELECT ?numero"+
				     "{ <http://dbpedia.org/resource/Lionel_Messi> <http://dbpedia.org/ontology/number> ?numero."+
					  "}";
			break;	
		case "bibliografia_Futbolista_CR7":
			query="PREFIX dbont: <http://dbpedia.org/ontology/> "
					+"PREFIX dbp: <http://dbpedia.org/property/>"
					+"SELECT ?bibliografia WHERE {{ <http://dbpedia.org/resource/Cristiano_Ronaldo> <http://www.w3.org/2000/01/rdf-schema#comment> ?bibliografia." +
					"FILTER langMatches( lang(?bibliografia), 'en') }" 
					+"}";
			break;
		case "nombre_Futbolista_CR7":
			query="SELECT ?nombre"+
				     "{ <http://dbpedia.org/resource/Cristiano_Ronaldo> <http://xmlns.com/foaf/0.1/name> ?nombre."+
					  "}";
			break;
		case "fechaNaciento_Futbolista_CR7":
			query="SELECT ?FechaNacimiento"+
				     "{ <http://dbpedia.org/resource/Cristiano_Ronaldo> <http://dbpedia.org/ontology/birthDate> ?FechaNacimiento."+
					  "}";
			break;
		case "numero_Futbolista_CR7":
			query="SELECT ?numero"+
				     "{ <http://dbpedia.org/resource/Cristiano_Ronaldo> <http://dbpedia.org/ontology/number> ?numero."+
					  "}";
			break;
		case "bibliografia_Futbolista_Neymar":
			query="PREFIX dbont: <http://dbpedia.org/ontology/> "
					+"PREFIX dbp: <http://dbpedia.org/property/>"
					+"SELECT ?bibliografia WHERE {{ <http://dbpedia.org/resource/Neymar> <http://dbpedia.org/ontology/abstract> ?bibliografia." +
					"FILTER langMatches( lang(?bibliografia), 'es') }" 
					+"}";
			break;
		case "nombre_Futbolista_Neymar":
			query="SELECT ?nombre"+
				     "{ <http://dbpedia.org/resource/Neymar> <http://xmlns.com/foaf/0.1/name> ?nombre."+
					  "}";
			break;
		case "fechaNaciento_Futbolista_Neymar":
			query="SELECT ?FechaNacimiento"+
				     "{ <http://dbpedia.org/resource/Neymar> <http://dbpedia.org/ontology/birthDate> ?FechaNacimiento."+
					  "}";
			break;
		case "numero_Futbolista_Neymar":
			query="SELECT ?numero"+
				     "{ <http://dbpedia.org/resource/Neymar> <http://dbpedia.org/ontology/number> ?numero."+
					  "}";
			break;
	case "bibliografia_Tecnico_Zinedine_Zidane":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?bibliografia WHERE {{ <http://dbpedia.org/resource/Zinedine_Zidane> <http://dbpedia.org/ontology/abstract> ?bibliografia." +
				"FILTER langMatches( lang(?bibliografia), 'es') }" 
				+"}";
		break;
	case "nombre_Tecnico_Zinedine_Zidane":
		query="SELECT ?nombre"+
			     "{ <http://dbpedia.org/resource/Zinedine_Zidane> <http://xmlns.com/foaf/0.1/name> ?nombre."+
				  "}";
		break;
	case "fechaNaciento_Tecnico_Zinedine_Zidane":
		query="SELECT ?FechaNacimiento"+
			     "{ <http://dbpedia.org/resource/Zinedine_Zidane> <http://dbpedia.org/ontology/birthDate> ?FechaNacimiento."+
				  "}";
		break;
	case "bibliografia_Tecnico_Jurgen_Klopp":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?bibliografia WHERE {{ <http://dbpedia.org/resource/Jürgen_Klopp> <http://dbpedia.org/ontology/abstract> ?bibliografia." +
				"FILTER langMatches( lang(?bibliografia), 'es') }" 
				+"}";
		break;
	case "nombre_Tecnico_Jurgen_Klopp":
		query="SELECT ?nombre"+
			     "{ <http://dbpedia.org/resource/Jürgen_Klopp> <http://xmlns.com/foaf/0.1/name> ?nombre."+
				  "}";
		break;
	case "fechaNaciento_Tecnico_Jurgen_Klopp":
		query="SELECT ?FechaNacimiento"+
			     "{ <http://dbpedia.org/resource/Jürgen_Klopp> <http://dbpedia.org/ontology/birthDate> ?FechaNacimiento."+
				  "}";
		break;
	case "descripcion_Copa_Mundial_Futbol":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?descripcion WHERE {{ <http://dbpedia.org/resource/FIFA_World_Cup> <http://dbpedia.org/ontology/abstract> ?descripcion." +
				"FILTER langMatches( lang(?descripcion), 'es') }" 
				+"}";
		break;
	case "nombre_Copa_Mundial_Futbole":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?nombre WHERE {{ <http://dbpedia.org/resource/FIFA_World_Cup> <http://www.w3.org/2000/01/rdf-schema#label> ?nombre." +
				"FILTER langMatches( lang(?nombre), 'es') }" 
				+"}";
		break;
	case "descripcion_UEFA":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?descripcion WHERE {{ <http://dbpedia.org/resource/UEFA_Champions_League> <http://dbpedia.org/ontology/abstract> ?descripcion." +
				"FILTER langMatches( lang(?descripcion), 'es') }" 
				+"}";
		break;
	case "nombre_UEFA":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?nombre WHERE {{ <http://dbpedia.org/resource/UEFA_Champions_League> <http://www.w3.org/2000/01/rdf-schema#label> ?nombre." +
				"FILTER langMatches( lang(?nombre), 'es') }" 
				+"}";
		break;
	case "descripcion_Juventus":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?descripcion WHERE {{ <http://dbpedia.org/resource/Juventus_F.C.> <http://www.w3.org/2000/01/rdf-schema#comment> ?descripcion." +
				"FILTER langMatches( lang(?descripcion), 'en') }" 
				+"}";en=true;
		break;
	case "nombre_Juventus":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?nombre WHERE {{ <http://dbpedia.org/resource/Juventus_F.C.> <http://www.w3.org/2000/01/rdf-schema#label> ?nombre." +
				"FILTER langMatches( lang(?nombre), 'en') }" 
				+"}";
		break;
	case "fundacion_juventus":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?fundacion WHERE { <http://dbpedia.org/resource/Juventus_F.C.> <http://dbpedia.org/property/founded> ?fundacion."
				+"}";
		break;
	case "descripcion_Manchester_City":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?descripcion WHERE {{ <http://dbpedia.org/resource/Manchester_City_F.C.> <http://dbpedia.org/ontology/abstract> ?descripcion." +
				"FILTER langMatches( lang(?descripcion), 'en') }" 
				+"}";
		break;
	case "nombre_Manchester_City":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?nombre WHERE {{ <http://dbpedia.org/resource/Manchester_City_F.C.> <http://www.w3.org/2000/01/rdf-schema#label> ?nombre." +
				"FILTER langMatches( lang(?nombre), 'en') }" 
				+"}";
		break;
	case "fundacion_Manchester_City":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?fundacion WHERE { <http://dbpedia.org/resource/Manchester_City_F.C.> <http://dbpedia.org/property/founded> ?fundacion."
				+"}";
		break;
	case "descripcion_Barcelona":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?descripcion WHERE {{ <http://dbpedia.org/resource/FC_Barcelona> <http://dbpedia.org/ontology/abstract> ?descripcion." +
				"FILTER langMatches( lang(?descripcion), 'es') }" 
				+"}";
		break;
	case "nombre_Barcelona":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?nombre WHERE {{ <http://dbpedia.org/resource/FC_Barcelona> <http://www.w3.org/2000/01/rdf-schema#label> ?nombre." +
				"FILTER langMatches( lang(?nombre), 'en') }" 
				+"}";
		break;
	case "fundacion_Barcelona":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?fundacion WHERE { <http://dbpedia.org/resource/FC_Barcelona> <http://dbpedia.org/property/founded> ?fundacion."
				+"}";
		break;
	case "descripcion_Germany_national_football_team":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?descripcion WHERE {{ <http://dbpedia.org/resource/Germany_national_football_team> <http://dbpedia.org/ontology/abstract> ?descripcion." +
				"FILTER langMatches( lang(?descripcion), 'es') }" 
				+"}";
		break;
	case "nombre_Germany_national_football_team":
		query="PREFIX dbont: <http://dbpedia.org/ontology/> "
				+"PREFIX dbp: <http://dbpedia.org/property/>"
				+"SELECT ?nombre WHERE {{ <http://dbpedia.org/resource/Germany_national_football_team> <http://www.w3.org/2000/01/rdf-schema#label> ?nombre." +
				"FILTER langMatches( lang(?nombre), 'en') }" 
				+"}";
		break;
	}
		return TestDBpedia(query);
	}
}
