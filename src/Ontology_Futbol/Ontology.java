package Ontology_Futbol;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Iterator;

import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.vocabulary.XSD;

public class Ontology {
	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main (String [] args) throws IOException{
		OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
		
		String NS = "futbol";
		model.setNsPrefix(NS, "http://www.owl-ontologies.com/OntologyFutbol.owl");
		
		OntClass futbol = model.createClass(NS+":"+"Futbol");
		OntClass accesorio = model.createClass(NS+":"+"Accesorio");
		OntClass torneo = model.createClass(NS+":"+"Torneo");
		OntClass reglas = model.createClass(NS+":"+"Reglas");
		OntClass persona = model.createClass(NS+":"+"Persona");
		
		futbol.addSubClass(accesorio);
		futbol.addSubClass(torneo);
		futbol.addSubClass(reglas);
		futbol.addSubClass(persona);
		
		OntClass futbolista = model.createClass(NS+":"+"Futbolista");
		OntClass tecnico = model.createClass(NS+":"+"Tecnico");
		OntClass equipo = model.createClass(NS+":"+"Equipo");

		persona.addSubClass(futbolista);
		persona.addSubClass(tecnico);
		torneo.addSubClass(equipo);
		
		
		//Propieded Descripcion
		DatatypeProperty descripcion_Futbol = model.createDatatypeProperty(NS+":"+"descripcion");
		descripcion_Futbol.addDomain(futbol);
		descripcion_Futbol.addRange(XSD.xstring); 
		descripcion_Futbol.convertToFunctionalProperty();
		
		DatatypeProperty descripcion_Torneo = model.createDatatypeProperty(NS+":"+"descripcion");
		descripcion_Torneo.addDomain(torneo);
		descripcion_Torneo.addRange(XSD.xstring); 
		descripcion_Torneo.convertToFunctionalProperty();
		
		DatatypeProperty descripcion_Reglas = model.createDatatypeProperty(NS+":"+"descripcion");
		descripcion_Reglas.addDomain(reglas);
		descripcion_Reglas.addRange(XSD.xstring); 
		descripcion_Reglas.convertToFunctionalProperty();
		
		DatatypeProperty descripcion_Tecnico = model.createDatatypeProperty(NS+":"+"descripcion");
		descripcion_Tecnico.addDomain(tecnico);
		descripcion_Tecnico.addRange(XSD.xstring); 
		descripcion_Tecnico.convertToFunctionalProperty();
		
		
		//Propiedad nombre
		
		DatatypeProperty nombre_Accesorio = model.createDatatypeProperty(NS+":"+"nombre");
		nombre_Accesorio.addDomain(accesorio);
		nombre_Accesorio.addRange(XSD.xstring); 
		nombre_Accesorio.convertToFunctionalProperty();
		
		DatatypeProperty nombre_Torneo = model.createDatatypeProperty(NS+":"+"nombre");
		nombre_Torneo.addDomain(torneo);
		nombre_Torneo.addRange(XSD.xstring); 
		nombre_Torneo.convertToFunctionalProperty();
		
		DatatypeProperty nombre_Reglas = model.createDatatypeProperty(NS+":"+"nombre");
		nombre_Reglas.addDomain(reglas);
		nombre_Reglas.addRange(XSD.xstring); 
		nombre_Reglas.convertToFunctionalProperty();
		
		DatatypeProperty nombre_Persona = model.createDatatypeProperty(NS+":"+"nombre");
		nombre_Persona.addDomain(persona);
		nombre_Persona.addRange(XSD.xstring); 
		nombre_Persona.convertToFunctionalProperty();
		
		DatatypeProperty nombre_Futbolista = model.createDatatypeProperty(NS+":"+"nombre");
		nombre_Futbolista.addDomain(futbolista);
		nombre_Futbolista.addRange(XSD.xstring); 
		nombre_Futbolista.convertToFunctionalProperty();
		
		DatatypeProperty nombre_Tecnico = model.createDatatypeProperty(NS+":"+"nombre");
		nombre_Tecnico.addDomain(tecnico);
		nombre_Tecnico.addRange(XSD.xstring); 
		nombre_Tecnico.convertToFunctionalProperty();
		
		//Propiedad duracion
		DatatypeProperty duracion_Futbol = model.createDatatypeProperty(NS+":"+"duracion");
		duracion_Futbol.addDomain(futbol);
		duracion_Futbol.addRange(XSD.xstring); 
		duracion_Futbol.convertToFunctionalProperty();
		
		//Propiedad tamaño_equipo_Futbol
		DatatypeProperty tamanoEquipo_Futbol = model.createDatatypeProperty(NS+":"+"tamano_equipo");
		tamanoEquipo_Futbol.addDomain(futbol);
		tamanoEquipo_Futbol.addRange(XSD.xstring); 
		tamanoEquipo_Futbol.convertToFunctionalProperty();	
		
		//propiedad bibliografia
		DatatypeProperty bibliografia_Persona = model.createDatatypeProperty(NS+":"+"bibliografia_Persona");
		bibliografia_Persona.addDomain(persona);
		bibliografia_Persona.addRange(XSD.xstring); 
		bibliografia_Persona.convertToFunctionalProperty();
		
		DatatypeProperty bibliografia_Futbolista = model.createDatatypeProperty(NS+":"+"bibliografia_Futbolista");
		bibliografia_Futbolista.addDomain(futbolista);
		bibliografia_Futbolista.addRange(XSD.xstring); 
		bibliografia_Futbolista.convertToFunctionalProperty();
		
		DatatypeProperty bibliografia_Tecnico = model.createDatatypeProperty(NS+":"+"bibliografia_Tecnico");
		bibliografia_Tecnico.addDomain(tecnico);
		bibliografia_Tecnico.addRange(XSD.xstring); 
		bibliografia_Tecnico.convertToFunctionalProperty();
		
		//propiedad fecha de nacimiento
		DatatypeProperty fechaNaciento_Persona = model.createDatatypeProperty(NS+":"+"fechaNaciento_Persona");
		fechaNaciento_Persona.addDomain(persona);
		fechaNaciento_Persona.addRange(XSD.xstring); 
		fechaNaciento_Persona.convertToFunctionalProperty();
		
		DatatypeProperty fechaNaciento_Futbolista = model.createDatatypeProperty(NS+":"+"fechaNaciento_Futbolista");
		fechaNaciento_Futbolista.addDomain(futbolista);
		fechaNaciento_Futbolista.addRange(XSD.xstring); 
		fechaNaciento_Futbolista.convertToFunctionalProperty();
		
		DatatypeProperty fechaNaciento_Tecnico = model.createDatatypeProperty(NS+":"+"fechaNaciento_Entrenador");
		fechaNaciento_Tecnico.addDomain(tecnico);
		fechaNaciento_Tecnico.addRange(XSD.xstring); 
		fechaNaciento_Tecnico.convertToFunctionalProperty();
		
		//Numero de jugador
		DatatypeProperty numero_Futbolista = model.createDatatypeProperty(NS+":"+"numero_Futbolista");
		numero_Futbolista.addDomain(futbolista);
		numero_Futbolista.addRange(XSD.xstring); 
		numero_Futbolista.convertToFunctionalProperty();
		
		
		//Equipos
		DatatypeProperty descripcion_Equipo = model.createDatatypeProperty(NS+":"+"descripcion");
		descripcion_Equipo.addDomain(equipo);
		descripcion_Equipo.addRange(XSD.xstring); 
		descripcion_Equipo.convertToFunctionalProperty();
		
		DatatypeProperty nombre_Equipo = model.createDatatypeProperty(NS+":"+"nombre");
		nombre_Equipo.addDomain(equipo);
		nombre_Equipo.addRange(XSD.xstring); 
		nombre_Equipo.convertToFunctionalProperty();
		
		DatatypeProperty fundacion_Equipo = model.createDatatypeProperty(NS+":"+"fundacion");
		fundacion_Equipo.addDomain(equipo);
		fundacion_Equipo.addRange(XSD.xstring); 
		fundacion_Equipo.convertToFunctionalProperty();
		
	
		
		//POBLAR ONTOLOGIA
		Individual soccer = model.createIndividual(NS+":"+"Futbol",futbol);
		soccer.setPropertyValue(descripcion_Futbol, model.createTypedLiteral(Query.DataDbPedia("descripcion_Futbol")));
		
		Individual teamSize = model.createIndividual(NS+":"+"TeamSize",futbol);
		teamSize.setPropertyValue(tamanoEquipo_Futbol, model.createTypedLiteral(Query.DataDbPedia("tamanoEquipo_Futbol")));

		
		//instancias jugadores
		//Blibliografia jugadores Messi
		Individual Messi = model.createIndividual(NS+":"+"Messi",futbolista);
		Messi.setPropertyValue(bibliografia_Futbolista, model.createTypedLiteral(Query.DataDbPedia("bibliografia_Futbolista_Messi")));
		Messi.setPropertyValue(nombre_Futbolista, model.createTypedLiteral(Query.DataDbPedia("nombre_Futbolista_Messi")));
		Messi.setPropertyValue(fechaNaciento_Futbolista, model.createTypedLiteral(Query.DataDbPedia("fechaNaciento_Futbolista_Messi")));
		Messi.setPropertyValue(numero_Futbolista, model.createTypedLiteral(Query.DataDbPedia("numero_Futbolista_Messi")));
		
		
		//Blibliografia jugadores CR7
		Individual CR7 = model.createIndividual(NS+":"+"CR7",futbolista);
//		CR7.setPropertyValue(bibliografia_Futbolista, model.createTypedLiteral(Query.DataDbPedia("bibliografia_Futbolista_CR7")));
		CR7.setPropertyValue(nombre_Futbolista, model.createTypedLiteral(Query.DataDbPedia("nombre_Futbolista_CR7")));
		CR7.setPropertyValue(fechaNaciento_Futbolista, model.createTypedLiteral(Query.DataDbPedia("fechaNaciento_Futbolista_CR7")));
		CR7.setPropertyValue(numero_Futbolista, model.createTypedLiteral(Query.DataDbPedia("numero_Futbolista_CR7")));
		//Blibliografia jugadores Neymar
		Individual Neymar = model.createIndividual(NS+":"+"Neymar",futbolista);
		Neymar.setPropertyValue(bibliografia_Futbolista, model.createTypedLiteral(Query.DataDbPedia("bibliografia_Futbolista_Neymar")));
		Neymar.setPropertyValue(nombre_Futbolista, model.createTypedLiteral(Query.DataDbPedia("nombre_Futbolista_Neymar")));
		Neymar.setPropertyValue(fechaNaciento_Futbolista, model.createTypedLiteral(Query.DataDbPedia("fechaNaciento_Futbolista_Neymar")));
		Neymar.setPropertyValue(numero_Futbolista, model.createTypedLiteral(Query.DataDbPedia("numero_Futbolista_Neymar")));
		
		
		//instancias tecnicos
		//Blibliografia tecnicos
		Individual Zinedine_Zidane = model.createIndividual(NS+":"+"Zinedine_Zidane",tecnico);
		Zinedine_Zidane.setPropertyValue(bibliografia_Tecnico, model.createTypedLiteral(Query.DataDbPedia("bibliografia_Tecnico_Zinedine_Zidane")));
		Zinedine_Zidane.setPropertyValue(nombre_Tecnico, model.createTypedLiteral(Query.DataDbPedia("nombre_Tecnico_Zinedine_Zidane")));
		Zinedine_Zidane.setPropertyValue(fechaNaciento_Tecnico, model.createTypedLiteral(Query.DataDbPedia("fechaNaciento_Tecnico_Zinedine_Zidane")));
				
		//Blibliografia tecnicos
		Individual Jurgen_Klopp = model.createIndividual(NS+":"+"Jurgen_Klopp",tecnico);
		Jurgen_Klopp.setPropertyValue(bibliografia_Tecnico, model.createTypedLiteral(Query.DataDbPedia("bibliografia_Tecnico_Jurgen_Klopp")));
		Jurgen_Klopp.setPropertyValue(nombre_Tecnico, model.createTypedLiteral(Query.DataDbPedia("nombre_Tecnico_Jurgen_Klopp")));
		Jurgen_Klopp.setPropertyValue(fechaNaciento_Tecnico, model.createTypedLiteral(Query.DataDbPedia("fechaNaciento_Tecnico_Jurgen_Klopp")));
		
		
		//intancias para torneos
		Individual Copa_Mundial_Futbol = model.createIndividual(NS+":"+"CopaMundialFutbol",torneo);
		Copa_Mundial_Futbol.setPropertyValue(descripcion_Torneo, model.createTypedLiteral(Query.DataDbPedia("descripcion_Copa_Mundial_Futbol")));
		Copa_Mundial_Futbol.setPropertyValue(nombre_Torneo, model.createTypedLiteral(Query.DataDbPedia("nombre_Copa_Mundial_Futbole")));
		
		Individual UEFA = model.createIndividual(NS+":"+"UEFA",torneo);
		UEFA.setPropertyValue(descripcion_Torneo, model.createTypedLiteral(Query.DataDbPedia("descripcion_UEFA")));
		UEFA.setPropertyValue(nombre_Torneo, model.createTypedLiteral(Query.DataDbPedia("nombre_UEFA")));
		
		
		//instancia para equipos
		Individual juventus = model.createIndividual(NS+":"+"Juventus",equipo);
		juventus.setPropertyValue(descripcion_Equipo, model.createTypedLiteral(Query.DataDbPedia("descripcion_Juventus")));
		juventus.setPropertyValue(nombre_Equipo, model.createTypedLiteral(Query.DataDbPedia("nombre_Juventus")));
		juventus.setPropertyValue(fundacion_Equipo, model.createTypedLiteral(Query.DataDbPedia("fundacion_juventus")));
		
		Individual manchester_City = model.createIndividual(NS+":"+"Manchester_City",equipo);
		manchester_City.setPropertyValue(descripcion_Equipo, model.createTypedLiteral(Query.DataDbPedia("descripcion_Manchester_City")));
		manchester_City.setPropertyValue(nombre_Equipo, model.createTypedLiteral(Query.DataDbPedia("nombre_Manchester_City")));
		manchester_City.setPropertyValue(fundacion_Equipo, model.createTypedLiteral(Query.DataDbPedia("fundacion_Manchester_City")));
		
		Individual barcelona = model.createIndividual(NS+":"+"Barcelona",equipo);
		barcelona.setPropertyValue(descripcion_Equipo, model.createTypedLiteral(Query.DataDbPedia("descripcion_Barcelona")));
		barcelona.setPropertyValue(nombre_Equipo, model.createTypedLiteral(Query.DataDbPedia("nombre_Barcelona")));
		barcelona.setPropertyValue(fundacion_Equipo, model.createTypedLiteral(Query.DataDbPedia("fundacion_Barcelona")));
		
		Individual Germany_national_football_team = model.createIndividual(NS+":"+"Germany_national_football_team",equipo);
		Germany_national_football_team.setPropertyValue(descripcion_Equipo, model.createTypedLiteral(Query.DataDbPedia("descripcion_Germany_national_football_team")));
		Germany_national_football_team.setPropertyValue(nombre_Equipo, model.createTypedLiteral(Query.DataDbPedia("nombre_Germany_national_football_team")));
		
		
		File file = new File ("D:/Material_Materias/Web_Semanticas/Ontologia/futbol.owl");
		if(!file.exists()){
			file.createNewFile();
		}
		model.write(new PrintWriter(file));	
		
		//motrar nombre de clases e instancias
		for(Iterator<OntClass> i=model.listClasses(); i.hasNext();) {
			OntClass cls=i.next();
			System.out.print(cls.getLocalName()+": ");
				for(Iterator it = cls.listInstances(true);it.hasNext();) {
					Individual ind = (Individual)it.next();
					if(ind.isIndividual()) {
						System.out.print(ind.getLocalName()+" ");;
					}
				}
				System.out.println();
		}
	}

}
