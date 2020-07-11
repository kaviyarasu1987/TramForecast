# TramForecast
Small Luas App to get forecast details based on timings A.M and P.M for two locations such  were Marlborough and Stillorgan using clean architecture components and MVVM  

![TramForecast](https://media.giphy.com/media/MbLg46ANUnauqm1Tz2/giphy.gif)

# Does it have a good architecture?
Yes,I have integrated using clear GoogleIO recommended architecture components for this small task to satisfy myself :)
  * api- It has Retrofit2 xml forecast service consumption declaration class and  constants.
  * data- It has all forecast sealed forecast time based queries,repostories,connectors,models,dagger2 modules to achieve best practices using    Dagger2,MVVM,Publish Relay,Flowable with buffer strategy,injection
  * scheduler- Thread schedulers to schedule Rx tasks
  * view- It has Dagger components,fragments,activity,application injections.
  
# Does it have a good way for data handling?
Yes, it has great way to handle the data transtion based on query time meridium to filter out correct bound tram details from service.-Query class
contains time based singleton meridium decider object to let to get correct bound and stopping details in to -ForecastRepository based on the task which helps to reduce lot boiler plat codes.

# Does it have unit tests?
Yes it has few unit test only due to time constraint but we can integrate lot in future
 In TimeForecast test class with below methods to do quick unit test for stopping and meridium
  * show inbound and stopping from view model  from mock forecast response
  * show outbound and stopping from view model  from mock forecast response
  * check after meridium and post meridium based on current hour
  
# Notes
Please note it is just a small task app as of now but it has plenty ways to improve in best practices,requirements and app functionalites 
    
    
