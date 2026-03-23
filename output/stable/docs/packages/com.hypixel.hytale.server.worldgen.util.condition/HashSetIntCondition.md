---
title: "HashSetIntCondition"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.condition"
fqcn: "com.hypixel.hytale.server.worldgen.util.condition.HashSetIntCondition"
api_surface: false
extends: null
implements: ["IIntCondition"]
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
public class HashSetIntCondition implements IIntCondition
```

Condition evaluating HashSetInt criteria.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `IntSet` | `set` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `HashSetIntCondition(IntSet set)` |
| `public` | `IntSet` | `getSet()` |
| `@Override public` | `boolean` | `eval(int i)` |
| `@Nonnull @Override public` | `String` | `toString()` |
