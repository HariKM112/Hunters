int sensor=A0;
int sensorValue=0;
int pin1=4,pin2=5,pin3=6;
int y;
void setup()
{ 
    Serial.begin(9600);   //Sets the baud for serial data transmission                               
    pinMode(13, OUTPUT);  //Sets digital pin 13 as output pin
 
}
void loop()
{ 
  y = map(sensorValue, 0, 400, 50,120);
  sensorValue=analogRead(sensor);
 // if(pin1==HIGH)
  //{
 //   String stringOne = "a";
 // String stringTwo = stringOne + sensorValue;
  Serial.println(y);  
/*
  }
  if(pin2==HIGH)
  {String stringOne = "b";
  String stringTwo = stringOne + sensorValue;
  Serial.println(stringTwo);  

  }
  if(pin3==HIGH)
  {String stringOne = "c";
  String stringTwo = stringOne + sensorValue;
  Serial.println(stringTwo);  

  }
          */
          delay(1000);
 
}
