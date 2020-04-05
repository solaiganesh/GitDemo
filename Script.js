	//function that display value 
		function dis(val) 
		{ 
			document.form.monitor.value+=val 
		} 
		
		//function that evaluates the digit and return result 
		function solve() 
		{ 
			let exp=document.form.monitor.value;
			if(eval(document.form.monitor.value))
				document.form.monitor.value =eval(exp) ;

		} 
		
		//function that clear the display 
		function clr() 
		{ 
			document.form.monitor.value = "" 
		} 

		function back()

		{
			let exp=document.form.monitor.value;
			document.form.monitor.value = exp.substring(0,exp.length-1)
		}