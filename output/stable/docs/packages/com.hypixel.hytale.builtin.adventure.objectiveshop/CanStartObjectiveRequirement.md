---
title: "CanStartObjectiveRequirement"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectiveshop"
fqcn: "com.hypixel.hytale.builtin.adventure.objectiveshop.CanStartObjectiveRequirement"
api_surface: false
extends: "ChoiceRequirement"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectiveshop"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectiveshop`

```java
public class CanStartObjectiveRequirement extends ChoiceRequirement
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<CanStartObjectiveRequirement>` | `CODEC` |
| `protected` | `String` | `objectiveId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `canFulfillRequirement(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef)` |
| `@Nonnull @Override public` | `String` | `toString()` |
