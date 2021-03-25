* Let's design a __Cipher__ class that encrypts and decrypts words
* The class has two methods _encrypt_ and _decrypt_
* The methods will take a __single word__ and encrypt or decrypt them. 
* While creating a cipher you pass information if it's a __simple or complex__ cipher
* Simple cipher and complex ciphers have different ways of encrypting and decrypting words


### Simple Cipher's encrypt

* The Simple cipher's __encrypt()__ method should replace each letter of a word with its substitute ie., the next letter in the alphabet list
* For example if the word is __hello__ encrypted word is __ifmmp__
* __decrypt__ will return the original word


### Complex Cipher's encrypt

* The Complex cipher's __encrypt()__ method should jumble the letters of the word. For example if the word is __hello__ encrypted word is __olehl__
* * __decrypt__ will return the original word


## ToDO
* Design the Cipher class with appropriate members
* Add constructors and methods wherever required
* Use Access specifiers appropriately
* Use interfaces if required
* Create __Lab09.java__ in a package __com.intuit.lab09__ and create different instances of Ciphers and call the __encyrpt and decrypt__ methods by passing different words
