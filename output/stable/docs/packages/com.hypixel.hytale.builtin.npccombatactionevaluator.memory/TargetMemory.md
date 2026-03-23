---
title: "TargetMemory"
kind: "class"
package: "com.hypixel.hytale.builtin.npccombatactionevaluator.memory"
fqcn: "com.hypixel.hytale.builtin.npccombatactionevaluator.memory.TargetMemory"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "npccombatactionevaluator"
  - "memory"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.npccombatactionevaluator.memory`

```java
public class TargetMemory implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Int2FloatOpenHashMap` | `knownFriendlies` |
| `@Nonnull private final` | `List<Ref<EntityStore>>` | `knownFriendliesList` |
| `@Nonnull private final` | `Int2FloatOpenHashMap` | `knownHostiles` |
| `@Nonnull private final` | `List<Ref<EntityStore>>` | `knownHostilesList` |
| `private final` | `float` | `rememberFor` |
| `@Nullable private` | `Ref<EntityStore>` | `closestHostile` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TargetMemory(float rememberFor)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, TargetMemory>` | `getComponentType()` |
| `@Nonnull public` | `Int2FloatOpenHashMap` | `getKnownFriendlies()` |
| `@Nonnull public` | `List<Ref<EntityStore>>` | `getKnownFriendliesList()` |
| `@Nonnull public` | `Int2FloatOpenHashMap` | `getKnownHostiles()` |
| `@Nonnull public` | `List<Ref<EntityStore>>` | `getKnownHostilesList()` |
| `public` | `float` | `getRememberFor()` |
| `@Nullable public` | `Ref<EntityStore>` | `getClosestHostile()` |
| `public` | `void` | `setClosestHostile(@Nullable Ref<EntityStore> ref)` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
