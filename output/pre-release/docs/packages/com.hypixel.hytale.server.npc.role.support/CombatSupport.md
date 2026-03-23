---
title: "CombatSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.CombatSupport"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "combat"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public class CombatSupport
```

Manages NPC combat state including active attack chains, friendly fire toggles, damage group filtering, and attack sequence overrides. Uses asset registry tags to categorize attacks (melee, ranged, block).

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `ATTACK_TAG` | `"Attack"` |
| `public static final` | `int` | `ATTACK_TAG_INDEX` | (tag registry index) |
| `public static final` | `String` | `AIMING_REFERENCE_TAG` | `"AimingReference"` |
| `public static final` | `int` | `AIMING_REFERENCE_TAG_INDEX` | (tag registry index) |
| `public static final` | `String` | `MELEE_TAG` | `"Attack=Melee"` |
| `public static final` | `int` | `MELEE_TAG_INDEX` | (tag registry index) |
| `public static final` | `String` | `RANGED_TAG` | `"Attack=Ranged"` |
| `public static final` | `int` | `RANGED_TAG_INDEX` | (tag registry index) |
| `public static final` | `String` | `BLOCK_TAG` | `"Attack=Block"` |
| `public static final` | `int` | `BLOCK_TAG_INDEX` | (tag registry index) |

## Constructors

| Signature |
|---|
| `public CombatSupport(NPCEntity parent, @Nonnull BuilderRole builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isDealingFriendlyDamage()` |
| `public` | `int[]` | `getDisableDamageGroups()` |
| `public` | `boolean` | `isExecutingAttack()` |
| `public` | `void` | `tick(double dt)` |
| `public` | `boolean` | `getCanCauseDamage(@Nonnull Ref<EntityStore> attackerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `setExecutingAttack(InteractionChain chain, boolean damageFriendlies, double attackPause)` |
| `public` | `void` | `addAttackOverride(String attackSequence)` |
| `public` | `void` | `clearAttackOverrides()` |
| `@Nullable public` | `String` | `getNextAttackOverride()` |

## Behavior

`getCanCauseDamage` checks whether the NPC can deal damage to a given attacker entity. It first checks flock membership (if `disableDamageFlock` is set, flock members cannot damage each other), then checks damage group membership via [WorldSupport](WorldSupport.md)`.isGroupMember()`. Friendly fire is allowed when the attacking NPC's combat support has `dealFriendlyDamage` set to true.

Attack overrides cycle through a list of attack sequence names, wrapping to index 0 after the last entry.

## Related Types

- [WorldSupport](WorldSupport.md) -- group membership checks
