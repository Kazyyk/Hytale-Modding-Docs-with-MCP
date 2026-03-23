---
title: "Pipe.Two"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.pipe"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.pipe.Pipe$Two"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "pipe"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.pipe`

```java
@FunctionalInterface
public interface Two<InputA, InputB>
```

Functional interface for a dual-input pipe callback. Receives two input values and a [Control](Control.md) for signaling early termination.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `accept` | `void` | `@Nonnull InputA var1, @Nonnull InputB var2, @Nonnull Control var3` |
