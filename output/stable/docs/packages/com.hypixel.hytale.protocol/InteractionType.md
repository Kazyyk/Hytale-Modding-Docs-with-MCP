---
title: "InteractionType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionType"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum InteractionType
```

Identifies the trigger type for an interaction, covering primary/secondary attacks, abilities, item use, collisions, projectile events, wielding, and equipment changes.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Primary` | 0 | Left-click / primary attack. |
| `Secondary` | 1 | Right-click / secondary action. |
| `Ability1` | 2 | First ability slot. |
| `Ability2` | 3 | Second ability slot. |
| `Ability3` | 4 | Third ability slot. |
| `Use` | 5 | Generic use action on a block or entity. |
| `Pick` | 6 | Middle-click / block picking. |
| `Pickup` | 7 | Item pickup trigger. |
| `CollisionEnter` | 8 | Fired when entity enters a collision volume. |
| `CollisionLeave` | 9 | Fired when entity exits a collision volume. |
| `Collision` | 10 | Fired while entity remains in a collision volume. |
| `EntityStatEffect` | 11 | Triggered by an entity stat threshold. |
| `SwapTo` | 12 | Triggered when this item is selected in the hotbar. |
| `SwapFrom` | 13 | Triggered when this item is deselected from the hotbar. |
| `Death` | 14 | Triggered on entity death. |
| `Wielding` | 15 | Idle/wielding loop while item is held. |
| `ProjectileSpawn` | 16 | Triggered when a projectile is spawned. |
| `ProjectileHit` | 17 | Triggered when a projectile hits a target. |
| `ProjectileMiss` | 18 | Triggered when a projectile misses. |
| `ProjectileBounce` | 19 | Triggered when a projectile bounces. |
| `Held` | 20 | Triggered while the item is held in the main hand. |
| `HeldOffhand` | 21 | Triggered while the item is held in the off hand. |
| `Equipped` | 22 | Triggered when the item is equipped as armor. |
| `Dodge` | 23 | Triggered by a dodge action. |
| `GameModeSwap` | 24 | Triggered on game mode change. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `InteractionType` constant.

```java
public static InteractionType fromValue(int value)
```

Returns the `InteractionType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`24`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [InteractionRules](InteractionRules.md)
- [InteractionConfiguration](InteractionConfiguration.md)
- [AbilityEffects](AbilityEffects.md)
- [InteractionsUpdate](InteractionsUpdate.md)
