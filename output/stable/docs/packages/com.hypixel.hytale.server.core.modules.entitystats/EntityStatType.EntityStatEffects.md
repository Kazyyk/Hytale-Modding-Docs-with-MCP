---
title: "EntityStatType.EntityStatEffects"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.EntityStatType.EntityStatEffects"
api_surface: true
implements:
  - "NetworkSerializable<EntityStatEffects>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "assets"
  - "effects"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset`

```java
public static class EntityStatType.EntityStatEffects implements NetworkSerializable<EntityStatEffects>
```

Configures effects triggered when an entity stat reaches its minimum or maximum value. Can play a sound event, spawn particles, and trigger interaction chains.

## Fields

| Field | Type | JSON Key | Description |
|---|---|---|---|
| `triggerAtZero` | `boolean` | `TriggerAtZero` | If true, effects trigger at zero crossing instead of at the bound value. |
| `soundEventId` | `String` | `SoundEventId` | Sound event to play. Resolved to index on decode. |
| `particles` | `ModelParticle[]` | `Particles` | Particle effects to spawn. |
| `interactions` | `String` | `Interactions` | Root interaction chain to execute. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getSoundEventId()` | `String` | Returns the sound event identifier. |
| `getSoundEventIndex()` | `int` | Returns the resolved sound event index. |
| `getParticles()` | `ModelParticle[]` | Returns particle configurations. |
| `getInteractions()` | `String` | Returns the interaction chain identifier. |
| `triggerAtZero()` | `boolean` | Whether to trigger at zero crossing. |
| `toPacket()` | `EntityStatEffects` (protocol) | Converts to network packet format. |
