Consider the scenario of encryption and decryption of data. 
The below image provides a bunch of classes used for encryption. 
Those are the complicated classes discussed above.

These functionalities are implemented at the facade class without exposing the code 
related to the functions. The facade class will utilise the objects of the relevant class 
within it and make the necessary function calls. In this manner, the author of actual 
classes just need to convey the functions written to serve the purpose.

Now, let us jump into coding an implementation using the Facade design pattern. 
We will be using the same example as discussed above. We will follow the below steps:

Create the Encryptor classes
Create the Facade class to expose its functionality
Create the Client class to consume the Facade class