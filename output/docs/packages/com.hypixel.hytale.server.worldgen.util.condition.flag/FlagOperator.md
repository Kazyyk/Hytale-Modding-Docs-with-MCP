---
title: "FlagOperator"
kind: "enum"
package: "com.hypixel.hytale.server.worldgen.util.condition.flag"
fqcn: "com.hypixel.hytale.server.worldgen.util.condition.flag.FlagOperator"
api_surface: false
extends: null
implements: ["IntBinaryOperator"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "condition"
  - "flag"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.condition.flag`

```java
public enum FlagOperator implements IntBinaryOperator
```

Enumerates FlagOperator values: `A`, `O`, `X`.

## Enum Constants

| Constant |
|---|
| `A` |
| `O` |
| `X` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `int` | `apply(int var1, int var2)` |
| `@Override public` | `int` | `applyAsInt(int left, int right)` |
