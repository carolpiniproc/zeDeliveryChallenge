# zeDeliveryChallenge
E2E automation test. Using Java + Selenium + Junit + Cucumber

## Requirements  
1 - JDK > 1.8  
2 - Maven project  
3 - ChromeDriver file must be the same version as your Chrome browser's   
4 - Framework : [frameworkWebAutomation](https://github.com/carolpiniproc/frameworkWebAutomation)  

### Steps
mvn test
___________________________________________________
#### Identify critical flows
- [x] Flow #1 : Select address and register it   
Flow #2 : Search product and add to the shopping cart  
Flow #3 : Choose payment method and finish order process 
___________________________________________________

Flow #1 : Select address and register it 
Since Ze Delivery works delivering products, the system needs a very accurate process to search, 
set, validate and save customer's address. Otherwise, the system cannot check if customer’s address  
is near enough to receive the products in a fair time and in the correct location. 

Flow #2 : Include products into the shopping cart
Like every e-commerce or app which sells products, the system needs a page which shows the products 
and the customer can search for one specific item and select and add it to the shopping cart. The  
shopping cart must be visible, easy to access, clear and objective. Users should not be confused while 
navigating on this page or they can give up on the purchase very close to the conclusion of the process. 
On the shopping cart customers should be able to include, remove and check product information. 

Flow #3 : Choose payment method and finish order process
As soon as the customer selects all the products he/she wishes to be delivered, the customer needs a 
quick and nice experience paying for it as well. In this flow, the customer can select the payment  
method among some options and pay for the products accordingly. The order is closed and the delivery 
process begins. Customer should receive a payment confirmation note and, after that, the customer should  
be able to follow the delivery status.  

