---
title: "ReusableList"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.ReusableList"
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
public class ReusableList<T>
```

List wrapper with soft-size tracking that reuses existing slots before expanding, reducing allocation pressure.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `expandAndSet(T element)` |
| `public` | `T` | `expandAndGet()` |
| `public` | `int` | `getSoftSize()` |
| `public` | `int` | `getHardSize()` |
| `public` | `boolean` | `isAtHardCapacity()` |
| `public` | `T` | `get(int index)` |
| `public` | `void` | `clear()` |
