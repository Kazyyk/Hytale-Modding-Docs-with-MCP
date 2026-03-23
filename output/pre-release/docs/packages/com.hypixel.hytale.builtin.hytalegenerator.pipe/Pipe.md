---
title: "Pipe"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.pipe"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.pipe.Pipe"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "pipe"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.pipe`

```java
public class Pipe
```

Provides functional callback interfaces for the world-generation pipeline with [Control](Control.md)-based flow control. Contains singleton no-op instances (`EMPTY_ONE`, `EMPTY_TWO`) and factory methods for type-safe empty pipe retrieval.

## Inner Types

| Type | Kind |
|---|---|
| [Pipe.One](Pipe.One.md) | interface |
| [Pipe.Two](Pipe.Two.md) | interface |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Pipe.One<?>` | `EMPTY_ONE` |
| `public static final` | `Pipe.Two<?, ?>` | `EMPTY_TWO` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static <Input>` | `Pipe.One<Input>` | `getEmptyOne()` |
| `public static <InputA, InputB>` | `Pipe.Two<InputA, InputB>` | `getEmptyTwo()` |
