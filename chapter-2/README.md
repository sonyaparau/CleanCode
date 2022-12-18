## Chapter 2: Meaningful names
Give meaningful names to classes, variables, methods, arguments, packages etc.

#### Summary
- use intention-revealing names
- avoid disinformation
- make meaningful distinctions
- use pronounceable names
- use searchable names
- avoid encodings (use naming conventions like CamelCase)
- avoid mental mapping
- pick one word per concept
- add meaningful context

#### Important ideas
- We name and name and name. Because we do so much of it, we'd better do it well.
- Choosing good names takes time but saves more than it takes.
- If a name requires a comment, then the name does not reveal its intent.
- Choosing names that reveal intent can make it much easier to understand and change code.
- Avoid misspelling intentionally a variable because you can't use the same name to refer to two different things in the
 same scope. This can lead to a situation where correcting spelling errors leads to an inability to compile and to 
 confusion. Adding noise words are not sufficient. If names must be different, then they should also mean something 
 different. (e.g. class vs. clazz vs. klass)
- Avoid disinformative variable names like: hp (from hypotenuse), a, a1, b etc.
- Do not refer to a grouping of accounts as an "accountList". It should be named "accounts". Same for sets or other 
collections.
- Avoid noise words. Imagine having a class "Product" and others called "ProductInfo" and "ProductData". The names are
different but the meaning is the same. "Info" and "Data" are indistinct noise words like "a", "an" and "the".
- Make your names pronounceable. If you can't pronounce it, you can't discuss it without sounding like an idiot.
- Avoid single-letter names (e.g. i, j - maybe JUST in loops). They barely reveal the intention and can hardly be found
 in the project. There can be no worse reason or using the name "c" than because "a" and "b" were already taken.
- Use searchable names. Longer names trump shorter names, and any searchable name trumps a constant in code.
- If a variable or constant might be seen or used in multiple places in a ody of code, it is imperative to give it a 
search-friendly name. (see example 4)
- Use naming conventions (e.g. Camel Case naming convention for Java).
- One difference between a smart programmer and a professional programmer is that the professional understands that
clarity is king. Professionals use their powers for good and write code that others can understand.
- Classes and objects should have noun or phrase names like "Customer", "WikiPage", "Account", "AddressParser". Avoid 
words like "Manager", "Processor", "Data" or "Info" in the name of a class. A class name should not be a verb!
- Methods should have verb or phrase names like "postPayment", "deletePage" or "save". Accessors, mutators and 
predicates should be named for their value and prefixed with "get", "set" or "is". (e.g. Getters and Setters).
- Choose one word for one abstract concept and stick with it.  For instance, it's confusing to have "fetch", "retrieve" 
and "get" as equivalent methods of different classes. Likewise, it's confusing to have a "controller", a "manager" and a
"driver" in the same code base. => A consistent lexicon is a great boon to the programmers who must use your code.
- Avoid using the same word for two purposes. => one word per concept
- We want our code to be a quick skim, not an intense study.
- Add no more context to a name that is necessary.


#### Bibliography
- Clean Code - A Handbook of Agile Software Craftsmanship: Robert C. Martin
