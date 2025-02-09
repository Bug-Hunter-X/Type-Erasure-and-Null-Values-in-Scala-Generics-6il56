# Scala Generics and Nulls: A Subtle Bug

This repository showcases a common yet easily overlooked error when working with generics and null values in Scala. The `MyClass` class demonstrates how using null with type parameters can cause runtime problems.  The solution shows how to avoid this using more robust type handling.

**Problem:** Type erasure in Scala can mask issues when using null with generics. If the type parameter T is not a nullable type, assigning null will throw a `NullPointerException` at runtime or cause subtle, hard-to-debug issues. 

**Solution:** Avoiding nulls altogether or using an `Option[T]` to explicitly handle the possibility of a missing value is the preferred approach. 