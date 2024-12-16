# Implicit Conversion Issue in Scala Auxiliary Constructor with Type Parameters

This repository demonstrates a subtle bug related to implicit conversions in Scala when using auxiliary constructors with type parameters.

## Description
The `MyClass` class defines an auxiliary constructor that attempts to convert an `Int` to a `String` implicitly.  This approach is generally discouraged and can lead to unexpected behavior or compile-time errors depending on the specific use case.

## Bug
The primary problem arises from the implicit conversion within the auxiliary constructor.  While it might work in some cases, it can be problematic if you later expect the class to behave differently when instantiated with a String versus an Int. In this particular case, even though it compiles without error, it might not produce the expected runtime behavior.

## Solution
The solution is to avoid implicit conversions within the auxiliary constructor by explicitly handling the type conversions: 