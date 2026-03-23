---
title: "Registry"
kind: "class"
package: "com.hypixel.hytale.registry"
fqcn: "com.hypixel.hytale.registry.Registry"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "registry"
  - "class"
---

**Package:** `com.hypixel.hytale.registry`

```java
public abstract class Registry<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `BooleanSupplier` | `precondition` |
| `private final` | `String` | `preconditionMessage` |
| `private final` | `Registry.RegistrationWrapFunction<T>` | `wrappingFunction` |
| `private final` | `List<BooleanConsumer>` | `registrations` |
| `private final` | `List<BooleanConsumer>` | `unmodifiableRegistrations` |
| `private` | `boolean` | `enabled` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `void` | `checkPrecondition()` |
| `public` | `boolean` | `isEnabled()` |
| `public` | `void` | `enable()` |
| `public` | `void` | `shutdown()` |
| `public` | `void` | `shutdownAndCleanup(boolean shutdown)` |
| `public` | `T` | `register(T registration)` |
| `@Nonnull public` | `List<BooleanConsumer>` | `getRegistrations()` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `Registry.RegistrationWrapFunction`
