# Overview

* Questions about core object-oriented principles are a traditional part of the interviewing process for junior Java programmers.  The best strategy for answering such questions is usually to give *concrete* examples, rather than trying to use jargon to talk in generalities. Having a number of good examples is therefore most useful, but everyone is sick of examples involving Animals or Cars.

# Requirements

* Create classes and interfaces illustrating: abstraction, encapsulation, polymorphism, and inheritance. For each of the four concepts, include at least one comment identifying an *exact* location in the code where it is utilized. For inheritance, please provide two examples: one extending a concrete class and one extending an abstract class ... for each of these two examples, please ensure that having the parent class be that way is necessary for the example to make sense.
* The examples should be meaningful.  Code such as `class Class1{}; class Class2{};` isn't meaningful. Code should either be useful for actual programming, or be useful for creating models of the real world, or both. But small examples should be small...there's no need for more fields or methods than are necessary to illustrate the role of the class or interface.
* I'm looking for a collection of related classes and interfaces which all collaborate together to solve a single problem, not a collection of disjoint examples.  But if you want to create disconnected examples, that's just more typing for you.
* The Git commit history of your project should prove that your code should be developed using TDD principles. No functionality should be added without a test requiring it, and the change should be the simplest possible. Refactoring (i.e. removing redundancy or increasing clarity without changing functionality at all) should not change tests at all. When refactoring, commit to Git after *every* change as soon as all tests pass. If your Git history doesn't show you're following TDD, I'll ask you to start over. Please feel free to show me your first few commits if you're not sure that you're complying with this.
* No need for a `public static void main(){}` or `[System.in](http://System.in)` or `System.out` ... all behavior can (and should) be tested using unit tests.
* No examples should involve Animals, Plants, Cars, Colors, Shapes, Collections, Bank Accounts, Employees, or other cliches.



## Requirement checks

    * Interface
    * Abstraction - comment referencing
    * Encapsulation - comment referencing
    * Polymorphism - comment referencing
    * Inheritance - comment referencing
        - two examples: one extending a concrete class and one extending an abstract class
        - ensure that having the parent class be that way is necessary for the example to make sense.
    * TDD only