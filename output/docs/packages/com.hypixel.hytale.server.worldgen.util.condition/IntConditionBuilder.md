---
title: "IntConditionBuilder"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.condition"
fqcn: "com.hypixel.hytale.server.worldgen.util.condition.IntConditionBuilder"
api_surface: false
extends: null
implements: ["IntConsumer"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "condition"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.condition`

```java
public class IntConditionBuilder implements IntConsumer
```

Implements `IntConsumer` to provide IntConditionBuilder functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private final` | `Supplier<IntSet>` | `setSupplier` |  |
| `private final` | `int` | `nullValue` |  |
| `private` | `int` | `first` |  |
| `@Nullable private` | `IntSet` | `set` | `null` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `IntConditionBuilder(Supplier<IntSet> setSupplier, int nullValue)` |
| `public` | `void` | `accept(int value)` |
| `public` | `boolean` | `add(int value)` |
| `public` | `IIntCondition` | `buildOrDefault(IIntCondition defaultCondition)` |
