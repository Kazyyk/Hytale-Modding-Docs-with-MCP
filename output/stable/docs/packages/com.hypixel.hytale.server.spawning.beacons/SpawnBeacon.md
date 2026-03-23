---
title: "SpawnBeacon"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.SpawnBeacon"
api_surface: false
extends: "Entity"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "spawning"
  - "beacons"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.spawning.beacons`

```java
public class SpawnBeacon extends Entity
```

The current-generation spawn beacon entity. A simplified, stateless version of [LegacySpawnBeaconEntity](LegacySpawnBeaconEntity.md) that supports manual triggering via `manualTrigger`. Non-collidable and hidden from non-Creative players. Tracks a set of unspawnable roles and self-removes when all roles become unspawnable.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public static` | `ComponentType<EntityStore, SpawnBeacon>` | `getComponentType()` |
| `public` | `BeaconSpawnWrapper` | `getSpawnWrapper()` |
| `public` | `void` | `setSpawnWrapper(@Nonnull BeaconSpawnWrapper spawnWrapper)` |
| `public` | `String` | `getSpawnConfigId()` |
| `public` | `boolean` | `manualTrigger(@Nonnull Ref<EntityStore> ref, @Nonnull FloodFillPositionSelector positionSelector, @Nonnull Ref<EntityStore> targetRef, @Nonnull Store<EntityStore> store)` |
| `protected` | `void` | `markUnspawnable(Ref<EntityStore> ref, int index, ComponentAccessor<EntityStore> componentAccessor)` |
| `protected static` | `void` | `postSpawn(@Nonnull NPCEntity npc, @Nonnull Ref<EntityStore> selfRef, @Nonnull BeaconNPCSpawn spawn, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)` |
