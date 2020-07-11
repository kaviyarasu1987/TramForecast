# TramForecast
Small Luas App to get forecast details based on timings A.M and P.M for two locations such as Marlborough and Stillorgan using clean architecture components and MVVM  

![TramForecast](https://media.giphy.com/media/MbLg46ANUnauqm1Tz2/giphy.gif)

# Does it have a good architecture and design patterns?
Yes,I have integrated using clear GoogleIO recommended architecture components for this task to satisfy myself :)
  * api- It has Retrofit2 xml forecast service consumption declaration class and  constants.
  * data- It has all forecast sealed forecast time based queries,repostories,connectors,view models,dagger2 modules to achieve best practices using    Dagger2,MVVM,Publish Relay,Flowable with buffer strategy,required injections for all classes.
  * scheduler- Thread schedulers to schedule Rx tasks
  * view- It has Dagger component,fragments,activity,application injections.
  
# Does it have a good way for data handling?
Yes, it has great way to handle the data transition based on query time meridium to filter out correct bound tram details from service.**Query** class
contains time based singleton meridium decider object to let to get correct bound and stopping details in to **ForecastRepository**  which helps to reduce lot boiler plat codes.

# Does it have unit tests?
Yes it has few unit test only due to time constraint but we can integrate lot in future.
 In TimeForecast test class with below methods to do quick unit test for stopping and meridium
  * show inbound and stopping from view model  from mock forecast response
  * show outbound and stopping from view model  from mock forecast response
  * check after meridium and post meridium based on current hour
  
# Notes
Please note: it is just a small task app as of now but it has plenty of ways to improve in design,performance,best practices,requirements and app functionalites :),Also i didn't get a chance to implemente Room and Dao Sqlite integrations due to time constraints as of now but i will integrate in future by integrating with current repositories. 
    
    
