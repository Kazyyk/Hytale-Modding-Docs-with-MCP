---
title: "SmallerThanCondition"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.conditions"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.conditions.SmallerThanCondition"
api_surface: false
extends: null
implements: ["Condition"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "materialproviders"
  - "spaceanddepth"
  - "conditions"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.conditions`

```java
public class SmallerThanCondition implements Condition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `threshold` |
| `private final` | `ConditionParameter` | `parameter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `qualifies(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling)` |
