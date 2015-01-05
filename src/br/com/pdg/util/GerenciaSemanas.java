package br.com.pdg.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerenciaSemanas {
	
	//Esse método recebe uma data em String e transforma no tipo Date	
	public static Date stringToDate(String dataInicial) throws ParseException{		

		//inicia o calendar
		Calendar c = Calendar.getInstance();
		//obtem a data
		Date data = (Date) c.getTime(); 
		//indica o formato que a data sera informada
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data1 = sdf.parse(dataInicial);
			
	return data1;
	}
	

	//devolve a data atual do sistema no formato Date
	public Date getDataAtual() throws ParseException{    

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");    
	    Calendar c = Calendar.getInstance();
	    String dataAtual = df.format(c.getTime()); 	    
	    //
	    DateFormat f = DateFormat.getDateInstance();
	    Date data = f.parse(dataAtual);
	   
	return data;   
	    
	} 
	
	//Recebe uma data no formato Date e devolove a segunda-feira da semana que esta data esta contida
	public static Date obtemSegunda(Date dataInicial){
		
		Calendar cal = Calendar.getInstance();  
		cal.setTime(dataInicial);  
		int day = cal.get(Calendar.DAY_OF_WEEK);  
		
		switch (day) {  
		    
		    case Calendar.SUNDAY:  
		        cal.add(Calendar.DAY_OF_WEEK, 1);  
		        System.out.println(day);
		    break; 
		    
			    case Calendar.MONDAY:  
			        cal.add(Calendar.DAY_OF_WEEK, 0);
			        System.out.println(day);
			    break;
		    
				    case Calendar.TUESDAY:  
				        cal.add(Calendar.DAY_OF_WEEK, -1);
				        System.out.println(day);
				    break;
				    
					    case Calendar.WEDNESDAY:  
					        cal.add(Calendar.DAY_OF_WEEK, -2);
					        System.out.println(day);
					    break;
					    
						    case Calendar.THURSDAY:  
						        cal.add(Calendar.DAY_OF_WEEK, -3);
						        System.out.println(day);
						    break;
						    
							    case Calendar.FRIDAY:  
							        cal.add(Calendar.DAY_OF_WEEK, -4);
							        System.out.println(day);
							    break;
							    
								    case Calendar.SATURDAY:  
								        cal.add(Calendar.DAY_OF_WEEK, -5);
								        System.out.println(day);
								    break;
			    			    
									    default:  
									        break;  
			}  
		Date dataSemana = (Date) cal.getTime();
		//System.out.println(dataSemana);
		return dataSemana;
	}
	
	//Calcula a quantidade de dias entre duas datas no formato Date
	public static int calcDiasEntreDatas(Date ini, Date end){
		
		Long a = ini.getTime();
		Long b = end.getTime();
		int dias = (int) ((b - a) / (24*60*60*1000));
				
		return dias;		
	}
	
	//recebe uma data no formato Date e transforma em String "dd/MM/yyyy"
	public static String dateToString(Date data){
		
		//Date data = null;        
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        String data1 = formatar.format(data);
        
        return data1;
	}
	
}