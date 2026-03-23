---
title: "Pipe.One"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.pipe"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.pipe.Pipe$One"
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
public interface One<Input>
```

Functional interface for a single-input pipe callback. Receives one input value and a [Control](Control.md) for signaling early termination.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `accept` | `void` | `@Nonnull Input var1, @Nonnull Control var2` |
