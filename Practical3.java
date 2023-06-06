/*
	a) create a class Time with the data members hurs and minutes. add functionalities to add, subtract two time objects.
	b) greatclock (a scientific research company) wants advanced time objects which will also provide funtionalities of 	addition and subtraction of seconds and miliseconds along with hours and minutes. How will you add this feature 		without changing the time class?
	c) crete a class TimeZone which will add functionality to convert the time from one timezone to another timezone. 		Note that class TimeZone uses the time object and uses add subtract methods of 
*/

class Time {
	int hours;
	int minutes;
	Time(){
		
	}
	Time(int x, int y){
		hours = x;
		minutes = y;
	}
	void Add(Time o1, Time o2){
		this.hours = o1.hours + o2.hours;
		this.minutes = o1.minutes + o2.minutes;
		if(this.minutes>=60){
			this.minutes -= 60;
			this.hours += 1;
		}
		if (this.hours>=24){
			this.hours -= 24;
			System.out.println(+this.hours+":"+this.minutes);
		}
		else if(this.hours<24){
			System.out.println(+this.hours+":"+this.minutes);
		}
	}
	void Sub(Time o){
		int tmin=(hours*60+minutes)-(o.hours*60+o.minutes);
		this.hours = tmin/60;
		this.minutes= tmin%60;
		if(tmin<0){
			System.out.println("Invalid");
		}	
		else {
			System.out.println(+this.hours+":"+this.minutes);
		}
	}


class GreatClock extends Time {
	int seconds;
	int milliseconds;
	GreatClock(int hours,int minutes,int seconds,int milliseconds){
		super(hours, minutes);
		this.seconds= seconds;
		this.milliseconds= milliseconds;
	}
	void AddTime(GreatClock o){
		int tmilliseconds=(hours*3600000+ minutes*60000 + seconds*1000 + milliseconds)+(o.hours*3600000+ o.minutes*60000 + o.seconds*1000 + o.milliseconds);
		int nhours = tmilliseconds / 3600000;
		int nminutes = (tmilliseconds % 3600000)/60000;
		int nseconds = tmilliseconds%1000;
		if (nseconds >60){
			nseconds -=60;
			nminutes++;
		}
		if(nminutes>60){
			nminutes-=60;
			nhours++;
		}
		if(nhours >24){
			nhours-=24;
			System.out.println("1 Day and "+nhours+ ":" + nminutes + ":"+ nseconds + ":" + tmilliseconds);
		}
		System.out.println(nhours+ ":" + nminutes + ":"+ nseconds + ":" + tmilliseconds);
	}
}
}
class Main2{

	public static void main(String[] args){
		Time t1 = new Time(10, 15);
		Time t2 = new Time(11, 25);
		Time t3 = new Time();
		t3.Add(t1,t2);
		t3.Sub(t2);
			
		GreatClock t4 = new GreatClock(5,15,30,77);
		GreatClock t5 = new GreatClock(4,35,50,87);
			
		t4.AddTime(t5);
	}

}



