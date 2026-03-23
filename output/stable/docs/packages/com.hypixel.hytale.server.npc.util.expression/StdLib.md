---
title: "StdLib"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression"
fqcn: "com.hypixel.hytale.server.npc.util.expression.StdLib"
api_surface: false
extends: "com.hypixel.hytale.server.npc.util.expression.StdScope"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "expression"
  - "scripting"
---

**Package:** `com.hypixel.hytale.server.npc.util.expression`

```java
public class StdLib extends StdScope
```

Singleton standard library scope that serves as the root parent for all NPC expression scopes. Registers built-in constants and functions used in NPC role JSON expressions.

## Built-in Constants

| Name | Type | Value |
|---|---|---|
| `true` | `BOOLEAN` | `true` |
| `false` | `BOOLEAN` | `false` |
| `PI` | `NUMBER` | `3.1415927` (float-precision Math.PI) |

## Built-in Functions

| Name | Signature | Variant | Description |
|---|---|---|---|
| `max` | `max(NUMBER, NUMBER) -> NUMBER` | invariant | Returns the larger of two numbers. |
| `min` | `min(NUMBER, NUMBER) -> NUMBER` | invariant | Returns the smaller of two numbers. |
| `isEmpty` | `isEmpty(STRING) -> BOOLEAN` | invariant | Returns true if the string is null or empty. |
| `isEmptyStringArray` | `isEmptyStringArray(STRING_ARRAY) -> BOOLEAN` | invariant | Returns true if the string array has length 0. |
| `isEmptyNumberArray` | `isEmptyNumberArray(NUMBER_ARRAY) -> BOOLEAN` | invariant | Returns true if the number array has length 0. |
| `random` | `random() -> NUMBER` | variant | Returns a random double in [0, 1). |
| `randomInRange` | `randomInRange(NUMBER, NUMBER) -> NUMBER` | variant | Returns a random double in [min, max). |
| `makeRange` | `makeRange(NUMBER) -> NUMBER_ARRAY` | invariant | Creates a two-element array `[v, v]` from a single value. |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | [StdScope](StdScope.md) | `getInstance()` |

## Related Types

- [StdScope](StdScope.md) -- parent class providing the symbol table
- [Expression](Expression.md) -- uses this as the root scope for NPC expressions
