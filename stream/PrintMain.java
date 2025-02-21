package com.stream;
import java.util.ArrayList;
import java.util.List;
public class PrintMain {
	

	
	
		public static void main(String[] args) {
			List<Print> obj=new ArrayList<Print>();
			obj.add(new Print("bajaj","pulsar",180000));
			obj.add(new Print("tesle","car",183000));
			obj.add(new Print("tedy","bike",830000));
		
			obj.stream().filter(s->s.score>200000).forEach(sr->System.out.println(sr.tname+"-"+sr.pname+"-"+sr.score));
		}
	}

