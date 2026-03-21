---
title: "DamageMemory"
kind: "class"
package: "com.hypixel.hytale.builtin.npccombatactionevaluator.memory"
fqcn: "com.hypixel.hytale.builtin.npccombatactionevaluator.memory.DamageMemory"
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
public class DamageMemory implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `float` | `recentDamage` |
| `private` | `float` | `totalCombatDamage` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, DamageMemory>` | `getComponentType()` |
| `public` | `float` | `getRecentDamage()` |
| `public` | `float` | `getTotalCombatDamage()` |
| `public` | `void` | `addDamage(float damage)` |
| `public` | `void` | `clearRecentDamage()` |
| `public` | `void` | `clearTotalDamage()` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
| `@Nonnull @Override public` | `String` | `toString()` |
