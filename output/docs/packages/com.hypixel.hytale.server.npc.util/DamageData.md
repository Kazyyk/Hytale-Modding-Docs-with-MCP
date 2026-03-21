---
title: "DamageData"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.DamageData"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class DamageData
```

Tracks NPC damage statistics including kills, damage inflicted per target, damage suffered per attacker, and damage by cause. Identifies the most persistent attacker and most damaged victim.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `reset()` |
| `public` | `void` | `onInflictedDamage(Ref<EntityStore> target, double amount)` |
| `public` | `void` | `onSufferedDamage(CommandBuffer<EntityStore> commandBuffer, Damage damage)` |
| `public` | `void` | `onKill(Ref<EntityStore> victim, Vector3d position)` |
| `public` | `boolean` | `haveKill()` |
| `public` | `boolean` | `haveKilled(Ref<EntityStore> entity)` |
| `public` | `Ref<EntityStore>` | `getAnyKilled()` |
| `public` | `Vector3d` | `getKillPosition(Ref<EntityStore> entity)` |
| `public` | `double` | `getMaxDamageInflicted()` |
| `public` | `double` | `getMaxDamageSuffered()` |
| `public` | `double` | `getDamage(DamageCause cause)` |
| `public` | `boolean` | `hasSufferedDamage(DamageCause cause)` |
| `public` | `Ref<EntityStore>` | `getMostDamagedVictim()` |
| `public` | `Ref<EntityStore>` | `getMostDamagingAttacker()` |
| `public` | `Ref<EntityStore>` | `getAnyAttacker()` |
| `public` | `DamageData` | `clone()` |
| `public` | `String` | `toString()` |
