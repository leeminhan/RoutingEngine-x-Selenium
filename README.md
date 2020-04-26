# <img src="https://cdn.worldvectorlogo.com/logos/selenium-logo.svg" width="100px" /> Front End Testing

## Description
All of thetest scripts utilises the selenium framework to test the front end of our web application. These test script are used  either for system tests or robustness tests. 

## Usage

1. The library folder contains a set of jar files that have to be added to the java build path.

2. Change the location of the chrome driver to where you have stored your chrome driver.  Also ensure that the version of your chrome driver matches the version of your chrome browser.
```
System.setProperty("webdriver.chrome.driver", "your location");
```

3. Ensure that the website directory is set to the correct url. In all the test cases, it is set to default http://localhost:3000/. 
``` 
driver.get("website url/");
```


## Test Cases

### NullInput.java - Robustness Test
Leaves a field blank at random and fills up the rest. On submit, it checks that a warning toast has been displayed. 

### MultipleSubmit.java - Robustness Test
Fills up all fields and submits twice. Checks that a warning toast has been displayed.

### SpamMessage.java - Robustness Test
Rapidly sends 11 messages in the chat window. Checks that a warning toast has been displayed. 

### ChatWindow.java - System Test
Types and sends messages in the chat window. Checks that the messages displayed in the chat window matches the messages sent.

### TestValues.java - System Test
Fills up the text field elements and clicks every radiobutton. Checks that the value stored in the elements matches the input. 


