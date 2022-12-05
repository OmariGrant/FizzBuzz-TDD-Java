# Fizz buzz TDD

TDD process:

#### FizzBuzz.java

```java
    public static String run(Integer i){
        return i.toString();
    }
```

#### FizzBuzzTest.java

```java
    @Test
    @DisplayName("Given one return a string")
    void givenOne_Return_String(){
        Assertions.assertEquals("1", FizzBuzz.run(1));
    }

    @ParameterizedTest
    @CsvSource({"41, 41", "2, 2", "1, 1", "24, 24"})
    @DisplayName("Given a number return as a string")
    void givenNumber_Return_String(int i, String expected){
        assertEquals(expected, FizzBuzz.run(i));
    }
```

## Given 3 return Fizz

#### FizzBuzzTest.java

```java
    @Test
    @DisplayName("Given 3 return Fizz")
    void givenThree_Return_Fizz(){
        assertEquals("Fizz", FizzBuzz.run(3));
    }

```
#### Result

org.opentest4j.AssertionFailedError:

Expected :Fizz

Actual   :3

#### FizzBuzz.java - changes to pass test

```java
    public static String run(Integer i){
        String result = i.toString();
        if (i == 3){
            result = "Fizz";
        }

        return result;
    }
    
```

## Divisible by 3 return Fizz

#### FizzBuzzTest.java

```java
    @ParameterizedTest
    @CsvSource({"3, Fizz", "6, Fizz", "9, Fizz"})
    @DisplayName("Given a number divisible by 3 (not 5) return Fizz")
    void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input, String expected){
        assertEquals(expected, FizzBuzz.run(input));
    }
```

#### Result

org.opentest4j.AssertionFailedError:

Expected :Fizz

Actual   :6

#### FizzBuzz.java - changes to pass test

```java
    public static String run(Integer i){
        String result = i.toString();
        if (i % 3 == 0){
            result = "Fizz";
        }

        return result;
    }
```

#### failed tests

at org.example.FizzBuzzTest.givenNumber_Return_String(FizzBuzzTest.java:27)

org.opentest4j.AssertionFailedError:

Expected :24

Actual   :Fizz

##### Why
24 would return Fizz

##### Solution

Removed 24 from the test 

## Given 5 return Buzz

#### FizzBuzzTest.java

````java

    @Test
    @DisplayName("Given 5 return Buzz")
    void givenFive_Return_Fizz(){
        assertEquals("Buzz", FizzBuzz.run(5));
    }
    
````

#### FizzBuzz.java - changes to pass the test

```java
    public static String run(Integer i){
        String result = i.toString();
        if (i % 3 == 0){
            result = "Fizz";
        } else 
            if (i ==5){
                result = "Buzz";
            }

        return result;
    }
```

## Divisible by 5 return Buzz

#### FizzBuzzTest.java

#### Result

org.opentest4j.AssertionFailedError:

Expected :Buzz

Actual   :10

#### FizzBuzz.java - changes to pass test

```java
    public static String run(Integer i){
        String result = i.toString();
        if (i % 3 == 0){
            result = "Fizz";
        } else
            if (i % 5==0){
                result = "Buzz";
            }

        return result;
    }
```

## Give 15 return FizzBuzz

#### FizzBuzzTest.java

```java

    @Test
    @DisplayName("Given 15 return FizzBuzz")
    void givenFifteen_Return_FizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzz.run(15));
    }
```

#### FizzBuzz.java - changes to pass test

```java
    public static String run(Integer i){
        String result = i.toString();
        if (i == 15){
            result = "FizzBuzz";
        } else
            if (i % 3 == 0){
            result = "Fizz";
        } else
            if (i % 5==0){
                result = "Buzz";
            }
            
        return result;
    }
```

## Given a number divisible to 15 return FizzBuzz

#### FizzBuzzTest.java

```java
    @ParameterizedTest
    @CsvSource({"15, FizzBuzz", "30, FizzBuzz", "45, FizzBuzz"})
    @DisplayName("Given a number divisible by 15 return FizzBuzz")
    void givenANumberDivisibleByFifteen_Return_FizzBuzz(int input, String expected){
        assertEquals(expected, FizzBuzz.run(input));
    }
```

#### FizzBuzz.java - changes to pass test

```java
    public static String run(Integer i){
        String result = i.toString();
        if (i % 15 == 0){
            result = "FizzBuzz";
        } else
            if (i % 3 == 0){
            result = "Fizz";
        } else
            if (i % 5==0){
                result = "Buzz";
            }

        return result;
    }
```

