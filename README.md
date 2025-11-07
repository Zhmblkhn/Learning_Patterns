# Design Patterns in Java

> A small collection of Java examples demonstrating classic **Software Design Patterns**, implemented for learning and practice.

---

## Overview

This repository contains simple and clean implementations of the most common **Gang of Four (GoF)** design patterns.  
Each pattern is organized into its own package and includes:
- **Source code**
- **Comments explaining the logic**
- **A runnable `Main` class** for quick testing

---

## Implemented Patterns

| Pattern | Type | Description |
|----------|------|-------------|
| **Builder** | Creational | Step-by-step object construction (e.g. `Pizza`, `Car`) |
| **Factory Method** | Creational | Creates objects via subclasses rather than direct instantiation |
| **Abstract Factory** | Creational | Creates families of related objects without specifying their concrete classes |
| **Adapter** | Structural | Converts one interface into another that clients expect |
| *(coming soon)* | — | More patterns will be added during study sessions |

---

## Example — Adapter Pattern

```java
// Interface expected by the client
public interface PaymentProcessor {
    void pay(double amount);
}

// Existing incompatible class
public class PayPal {
    void makePayment(double amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}

// Adapter class
public class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal = new PayPal();

    @Override
    public void pay(double amount) {
        payPal.makePayment(amount);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter();
        processor.pay(1500);
    }
}
```

## Contributors

<a href="https://github.com/Yessenchik">
  <img src="https://avatars.githubusercontent.com/u/177350878?v=4" width="80" alt="Yessen"/>
</a>
<a href="https://github.com/dzha11">
  <img src="https://avatars.githubusercontent.com/u/191315109?v=4" width="80" alt="Bakdaulet"/>
</a>
