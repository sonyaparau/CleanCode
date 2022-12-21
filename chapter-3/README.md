## Chapter 3: Functions
Write functions/methods well.

#### Summary
- keep functions small
- do one thing
- one level of abstractions per function
- use descriptive names
- prefer exceptions to returning error codes
- don't repeat yourself

#### Important ideas
- Functions should be (very) small.
- Each function and each line should tell a story.
- Functions should hardly ever be 20 lines long.
- The blocks within if/ else/ while statements should be one line long. Probably that line should be a method call. Not
only does this keep the enclosing function small, but it also adds documentary value because the method called within 
the block can have a nicely descriptive name.
- The function must do ONE (simple) thing. It should do it well. It should do it only.
- A way to know that a method is doing more than one thing is if you can extract another method from it with a name that
is not merely a restatement of its implementation.
- If a method does only those steps that are one level below the stated name of the method, then the method is doing one
thing. The reason we write methods is to decompose a larger concept into a set of steps at the next level of
 abstraction.
- A method should not be divided into sections. This is an obvious symptom of doing more than one thing. Methods doing one 
thing cannot be divided into sections. Example of sections within a method:
```
    // declarations
    ...
    
    // initializations
    ...
    
    // sieve
    ...
```
- Switch statements: it's hard to make a switch statement that does one thing. They do N things. Unfortunately switch
statements cannot always be avoided, but we can make sure that each switch statement is buried in a low-level class and 
is never repeated. This can be done with polymorphism (see example 2). Solution is to bury the switch statement in an
ABSTRACT FACTORY. The factory will use the switch statement to create appropriate instances.
- The smaller and more focused a function is, the easier it is to choose a descriptive name.
-Don't be afraid to make a name long. A long descriptive name is better than a short enigmatic name.
- A long descriptive name is better than a long descriptive comment.
- Don't be afraid to spend time choosing a name.
- Be consistent in your names. Use the same phrases, nouns, and verbs in the function names you choose for your modules.


#### Bibliography
- Clean Code - A Handbook of Agile Software Craftsmanship: Robert C. Martin
