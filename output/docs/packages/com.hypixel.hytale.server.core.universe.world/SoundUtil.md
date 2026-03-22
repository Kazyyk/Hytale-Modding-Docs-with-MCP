---
title: "SoundUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.SoundUtil"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "sound"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class SoundUtil
```

Static utilities for playing sound events in the world. Supports 2D (non-positional), 3D (positional with distance attenuation), and entity-attached sound playback. Sound events are looked up by index from the `SoundEvent` asset map. 3D sounds use spatial player collection to send packets only to players within the event's maximum distance.

## Key Methods

| Method | Description |
|---|---|
| `playItemSoundEvent(Ref, Store, Item, ItemSoundEvent)` | Plays an item sound event as a 2D UI sound to the player. |
| `playSoundEventEntity(int, int, float, float, ComponentAccessor)` | Broadcasts an entity-attached sound event to all players. |
| `playSoundEvent2dToPlayer(PlayerRef, int, SoundCategory)` | Plays a 2D sound event to a single player. |
| `playSoundEvent2d(int, SoundCategory, ComponentAccessor)` | Broadcasts a 2D sound event to all players. |
| `playSoundEvent3d(int, SoundCategory, double, double, double, ComponentAccessor)` | Plays a 3D positional sound to nearby players. |
| `playSoundEvent3d(Ref, int, Vector3d, boolean, ComponentAccessor)` | Plays a 3D sound with source entity exclusion and visibility checks. |
| `playSoundEvent3dToPlayer(Ref, int, SoundCategory, double, double, double, ComponentAccessor)` | Plays a 3D sound to a single player if within range. |
