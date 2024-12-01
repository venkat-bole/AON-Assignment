I'll create a decorator class that wraps an existing IncDec implementation and measures the time taken for each method invocation while maintaining the IncDec interface.

## Here's how this implementation works:

1. The TimedIncDec class implements the IncDec interface, ensuring it can be used seamlessly with existing code.
2. It takes an IncDec object in its constructor, storing it as a private final field.
3. In both increment() and decrement() methods:
   * It captures the start time before calling the original method
   * Invokes the original method on the wrapped object
   * Captures the end time after the method call
   * Prints out the time taken in milliseconds

## Benefits of this approach

* Follows the Decorator design pattern
* Maintains the original IncDec interface
* Can be applied to any IncDec implementation
* Adds timing functionality without modifying existing classes
* Provides transparent time measurement