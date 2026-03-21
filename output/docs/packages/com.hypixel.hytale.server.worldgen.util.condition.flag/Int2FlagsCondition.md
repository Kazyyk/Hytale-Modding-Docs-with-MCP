---
title: "Int2FlagsCondition"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.util.condition.flag"
fqcn: "com.hypixel.hytale.server.worldgen.util.condition.flag.Int2FlagsCondition"
api_surface: true
extends: null
implements: ["IntUnaryOperator"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "condition"
  - "flag"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.condition.flag`

```java
@FunctionalInterface public interface Int2FlagsCondition extends IntUnaryOperator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `int` | `eval(int var1)` |
| `@Override default` | `int` | `applyAsInt(int operand)` |
