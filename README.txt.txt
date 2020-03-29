Run on JRE System Library [JavaSE-1.8]

--Java Code--

Contains all the Selenium testing code for each test case and should be run individually.
Two things must be changed:
1) The location of chromedriver.exe file
System.setProperty("webdriver.chrome.driver", "C:/Users/xavierrocker/Downloads/chromedriver_win322/chromedriver.exe");
2)The URL that the website is running on (this can be found in command prompt after npm start, just add ':3000' after the IP address)
driver.get("http://192.168.56.1:3000/");


--Libraries--
Contains jar files which have to be set to java build path in properties in your IDE