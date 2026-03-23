---
title: "Damage.SoundEffect"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.Damage.SoundEffect"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "sound"
  - "audio"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class Damage.SoundEffect
```

Wraps a sound event index for impact sound effects attached to a [Damage](Damage.md) event. Used by both `Damage.IMPACT_SOUND_EFFECT` and `Damage.PLAYER_IMPACT_SOUND_EFFECT` meta keys.

## Constructor

```java
public SoundEffect(int soundEventIndex)
```

Creates a sound effect wrapper with the given sound event asset index.

## Methods

```java
public int getSoundEventIndex()
```

Returns the sound event asset index.

```java
public void setSoundEventIndex(int soundEventIndex)
```

Sets the sound event asset index.

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `soundEventIndex` | `int` | `private` | Index into the sound event asset map. |

## Related Types

- [Damage](Damage.md) -- the damage event that carries sound effects via meta store
- [DamageSystems.ApplySoundEffects](DamageSystems.ApplySoundEffects.md) -- system that plays these sounds
