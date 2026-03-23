---
title: "DamageSystems.FilterUnkillable"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.FilterUnkillable"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "filter"
  - "invulnerable"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.FilterUnkillable extends DamageEventSystem
```

Cancels damage to entities that cannot be killed. Part of the filter damage group. Cancels damage if any of the following conditions are true: the entity has an invulnerable entity effect, the entity is already dead (has `DeathComponent`), the entity has the `Invulnerable` component, the entity has the `Intangible` component, or the `CAUSE_DESYNC` debug flag is active.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CAUSE_DESYNC` | `boolean` | Debug flag toggled by the [DesyncDamageCommand](DesyncDamageCommand.md). When `true`, all damage is cancelled. |

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DeathComponent](DeathComponent.md) -- checked to determine if entity is already dead
- [DesyncDamageCommand](DesyncDamageCommand.md) -- toggles the `CAUSE_DESYNC` flag
- [DamageEventSystem](DamageEventSystem.md) -- base class
