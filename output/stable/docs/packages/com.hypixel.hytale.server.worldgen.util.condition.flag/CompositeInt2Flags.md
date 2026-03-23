---
title: "CompositeInt2Flags"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.condition.flag"
fqcn: "com.hypixel.hytale.server.worldgen.util.condition.flag.CompositeInt2Flags"
api_surface: false
extends: null
implements: ["Int2FlagsCondition"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "condition"
  - "flag"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.condition.flag`

```java
public class CompositeInt2Flags implements Int2FlagsCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `CompositeInt2Flags.FlagCondition[]` | `flags` |
| `private final` | `int` | `defaultResult` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `eval(int input)` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `CompositeInt2Flags.FlagCondition`
