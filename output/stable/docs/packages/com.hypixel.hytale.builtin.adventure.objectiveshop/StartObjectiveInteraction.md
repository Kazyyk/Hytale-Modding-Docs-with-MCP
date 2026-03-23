---
title: "StartObjectiveInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectiveshop"
fqcn: "com.hypixel.hytale.builtin.adventure.objectiveshop.StartObjectiveInteraction"
api_surface: false
extends: "ChoiceInteraction"
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
public class StartObjectiveInteraction extends ChoiceInteraction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<StartObjectiveInteraction>` | `CODEC` |
| `protected` | `String` | `objectiveId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getObjectiveId()` |
| `@Override public` | `void` | `run(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef)` |
| `@Nonnull @Override public` | `String` | `toString()` |
