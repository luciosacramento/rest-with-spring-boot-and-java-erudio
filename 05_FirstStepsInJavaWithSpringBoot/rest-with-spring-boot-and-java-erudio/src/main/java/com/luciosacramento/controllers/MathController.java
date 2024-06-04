package com.luciosacramento.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luciosacramento.converters.NumberConverter;
import com.luciosacramento.math.SimpleMath;


@RestController
public class MathController {

	private SimpleMath math = new SimpleMath();
	
	//Soma
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo) throws Exception{ 
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
					throw new UnsupportedOperationException("Please set a numeric value!");
				}
				
				return math.sum(NumberConverter.convertTodouble(numberOne), NumberConverter.convertTodouble(numberTwo));
			}

	//Multiplicação
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo) throws Exception{ 
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
					throw new UnsupportedOperationException("Please set a numeric value!");
				}
				
				return math.mult( NumberConverter.convertTodouble(numberOne), NumberConverter.convertTodouble(numberTwo));
			}

	//Subtração		
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo) throws Exception{ 
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
					throw new UnsupportedOperationException("Please set a numeric value!");
				}
				
				return  math.sub(NumberConverter.convertTodouble(numberOne) , NumberConverter.convertTodouble(numberTwo));
			}
	
	//Divisão		
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo) throws Exception{ 
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
					throw new UnsupportedOperationException("Please set a numeric value!");
				}
				
				return math.div(NumberConverter.convertTodouble(numberOne) , NumberConverter.convertTodouble(numberTwo));
			}
			
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(
			@PathVariable(value="numberOne") String numberOne,
			@PathVariable(value="numberTwo") String numberTwo) throws Exception{ 
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
					throw new UnsupportedOperationException("Please set a numeric value!");
				}
				
				return math.mean(NumberConverter.convertTodouble(numberOne), NumberConverter.convertTodouble(numberTwo));
			}		

	@RequestMapping(value = "/squareRoot/{numberOne}", method = RequestMethod.GET)
	public Double mean(
			@PathVariable(value="numberOne") String numberOne) throws Exception{ 
		
				if(!NumberConverter.isNumeric(numberOne)) {
					throw new UnsupportedOperationException("Please set a numeric value!");
				}
				
				return  math.squareRoot(NumberConverter.convertTodouble(numberOne)) ;
			}			


	

}
