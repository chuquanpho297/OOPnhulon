package com.javaproject.helper;

import com.javaproject.constant.DirContanst;
import com.javaproject.constant.PrefixConstant;
import com.javaproject.constant.QueryUrlConstant;
import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.sparql.resultset.ResultsFormat;

public class Utility {
	public static void setNsPrefix(ParameterizedSparqlString queryStr) {
		queryStr.setNsPrefix("wikibase", PrefixConstant.wikibase);
		queryStr.setNsPrefix("bd", PrefixConstant.bd);
		queryStr.setNsPrefix("dbp", PrefixConstant.dbp);
		queryStr.setNsPrefix("rdf", PrefixConstant.rdf);
		queryStr.setNsPrefix("wd", PrefixConstant.wd);
		queryStr.setNsPrefix("wdt", PrefixConstant.wdt);
		queryStr.setNsPrefix("yago", PrefixConstant.yago);
		queryStr.setNsPrefix("schema", PrefixConstant.schema);
		queryStr.setNsPrefix("dbo", PrefixConstant.dbo);
		queryStr.setNsPrefix("xsd", PrefixConstant.xsd);
		queryStr.setNsPrefix("foaf", PrefixConstant.foaf);
		queryStr.setNsPrefix("rs", PrefixConstant.rs);
	}
	public static void setNsPrefix(Model model) {
		model.setNsPrefix("wikibase", PrefixConstant.wikibase);
		model.setNsPrefix("bd", PrefixConstant.bd);
		model.setNsPrefix("dbp", PrefixConstant.dbp);
		model.setNsPrefix("rdf", PrefixConstant.rdf);
		model.setNsPrefix("wd", PrefixConstant.wd);
		model.setNsPrefix("wdt", PrefixConstant.wdt);
		model.setNsPrefix("yago", PrefixConstant.yago);
		model.setNsPrefix("schema", PrefixConstant.schema);
		model.setNsPrefix("dbo", PrefixConstant.dbo);
		model.setNsPrefix("xsd", PrefixConstant.xsd);
		model.setNsPrefix("foaf", PrefixConstant.foaf);
		model.setNsPrefix("rs", PrefixConstant.rs);
	}

	public static ResultsFormat checkFormat(String format){
		ResultsFormat resultsFormat = null;
		System.out.println(format.length());
		switch (format){
			case "Turtle":
				resultsFormat = ResultsFormat.FMT_RDF_TURTLE;
				break;
			case "N-Triples":
				resultsFormat = ResultsFormat.FMT_RDF_NT;
				break;
			case "RDF/XML":
				resultsFormat = ResultsFormat.FMT_RDF_XML;
				break;
			case "JSON":
				resultsFormat = ResultsFormat.FMT_RS_JSON;
				break;
			default:
		}
		System.out.println(resultsFormat);
		return resultsFormat;
	}

	public static String checkQueryAdd(String queryAdd){
		String sparqlUrl = null;
		System.out.println(queryAdd.length());
		if(queryAdd.equals("Wikidata")){
			sparqlUrl = QueryUrlConstant.wikidataQueryUrl;
		}
		if (queryAdd.equals("Dbpedia")){
			sparqlUrl = QueryUrlConstant.dbpediaQueryUrl;
		}
		System.out.println(sparqlUrl);
		return sparqlUrl;
	}
	public static String checkFileExtend(String formatFile){
		String fileExtend = null;
		System.out.println(formatFile.length());
		switch (formatFile){
			case "Turtle":
				fileExtend = ".ttl";
				break;
			case "N-Triples":
				fileExtend = ".nt";
				break;
			case "RDF/XML":
				fileExtend = ".rdf";
				break;
			case "JSON-LD":
				fileExtend = ".jsonld";
				break;
			default: fileExtend = ".txt";
		}
		System.out.println(fileExtend);
		return fileExtend;
	}
}
