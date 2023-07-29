# IRCTC-System
Create an IRCTC system: 
 
Train = TrainId, Source, Destination                                                
Passenger = TicketId, TrainId, Date, Age, Gender                                                
FoodOrder = TicketId, TrainId, Price                                                
 
POST API - Add a Passenger with TicketId, TrainId, Date, Age, Gender
POST API - Add a Train with TicketId, Source, Destination
 
1.GET API - Find the Number of passengers traveling from City X and City Y on Date D.
2.GET API - Find the total No of female passengers of age between X and Y(X < = Y) who ended at their destination at city C.
3.GET API - Get the total price of the orders placed by Customers on Date D in TrainId T.
