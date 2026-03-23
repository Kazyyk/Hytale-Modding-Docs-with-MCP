---
title: "DamageDataComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.damage"
fqcn: "com.hypixel.hytale.server.core.entity.damage.DamageDataComponent"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "damage"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.damage`

```java
public class DamageDataComponent implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Instant` | `lastCombatAction` |
| `private` | `Instant` | `lastDamageTime` |
| `private` | `WieldingInteraction` | `currentWielding` |
| `private` | `Instant` | `lastChargeTime` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ComponentType<EntityStore,DamageDataComponent>` | `getComponentType()` |
| `@Nonnull public` | `Instant` | `getLastCombatAction()` |
| `public` | `void` | `setLastCombatAction(Instant lastCombatAction)` |
| `@Nonnull public` | `Instant` | `getLastDamageTime()` |
| `public` | `void` | `setLastDamageTime(Instant lastDamageTime)` |
| `@Nullable public` | `Instant` | `getLastChargeTime()` |
| `public` | `void` | `setLastChargeTime(Instant lastChargeTime)` |
| `@Nullable public` | `WieldingInteraction` | `getCurrentWielding()` |
| `public` | `void` | `setCurrentWielding(WieldingInteraction currentWielding)` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
