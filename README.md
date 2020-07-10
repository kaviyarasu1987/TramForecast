# TramForecast
Small Luas App to get forecast details based on timings A.M and P.M for two locations such  were Marlborough and Stillorgan using clean architecture components and MVVM  

![TramForecast](https://media.giphy.com/media/MbLg46ANUnauqm1Tz2/giphy.gif)

# Does it have a good architecture?
Yes,I have integrated using clear GoogleIO recommended architecture components for this small task to satisfy myself :)
  * api- It has Retrofit2 forecast service consumption declation class and its constants
  * data- It has all forecast sealed forecast time based queries,repostories,connectors,models,dagger2 modules to achieve best practices
    
# Does it have unit tests?
Yes it has few unit test only due to time constraint but we can integrate lot in future
 In TimeForecast test class and below methods to do quick unit test for stopping and meridium
    * `show inbound and stopping from view model  from mock forecast response`
    * `show outbound and stopping from view model  from mock forecast response`
    * `check after meridium and post meridium based on current hour`


