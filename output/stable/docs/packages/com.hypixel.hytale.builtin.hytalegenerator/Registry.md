---
title: "Registry"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.Registry"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator`

```java
public class Registry<T>
```

Generic bidirectional registry mapping objects to sequential integer IDs.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getIdOrRegister(T object)` |
| `public` | `T` | `getObject(int id)` |
| `public` | `int` | `size()` |
| `public` | `List<T>` | `getAllValues()` |
| `public` | `void` | `forEach(@Nonnull BiConsumer<Integer, T> consumer)` |
