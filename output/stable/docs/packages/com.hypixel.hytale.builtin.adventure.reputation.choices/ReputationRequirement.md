---
title: "ReputationRequirement"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.reputation.choices"
fqcn: "com.hypixel.hytale.builtin.adventure.reputation.choices.ReputationRequirement"
api_surface: false
extends: "ChoiceRequirement"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "reputation"
  - "choices"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.reputation.choices`

```java
public class ReputationRequirement extends ChoiceRequirement
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ReputationRequirement>` | `CODEC` |
| `protected` | `String` | `reputationGroupId` |
| `protected` | `String` | `minRequiredRankId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `canFulfillRequirement(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef)` |
| `@Nonnull @Override public` | `String` | `toString()` |
