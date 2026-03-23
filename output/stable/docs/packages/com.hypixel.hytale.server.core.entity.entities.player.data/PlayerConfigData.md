---
title: "PlayerConfigData"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.data"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.data.PlayerConfigData"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.data`

```java
public final class PlayerConfigData
```

Provides PlayerConfigData functionality within the data subsystem.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final transient` | `AtomicBoolean` | `hasChanged` | `new AtomicBoolean()` |
| `private` | `int` | `blockIdVersion` | `1` |
| `private` | `String` | `world` |  |
| `private` | `String` | `preset` |  |
| `@Nonnull private` | `Set<String>` | `knownRecipes` | `new HashSet<>()` |
| `@Nonnull private` | `Set<String>` | `unmodifiableKnownRecipes` | `Collections.unmodifiableSet(this.knownRecipes)` |
| `private` | `Map<String, PlayerWorldData>` | `perWorldData` | `new ConcurrentHashMap<>()` |
| `@Nonnull private` | `Map<String, PlayerWorldData>` | `unmodifiablePerWorldData` | `Collections.unmodifiableMap(this.perWorldData)` |
| `@Nonnull private` | `Set<String>` | `discoveredZones` | `new HashSet<>()` |
| `@Nonnull private` | `Set<String>` | `unmodifiableDiscoveredZones` | `Collections.unmodifiableSet(this.discoveredZones)` |
| `@Nonnull private` | `Set<UUID>` | `discoveredInstances` | `new HashSet<>()` |
| `@Nonnull private` | `Set<UUID>` | `unmodifiableDiscoveredInstances` | `Collections.unmodifiableSet(this.discoveredInstances)` |
| `private` | `Object2IntMap<String>` | `reputationData` | `new Object2IntOpenHashMap()` |
| `@Nonnull private` | `Object2IntMap<String>` | `unmodifiableReputationData` | `Object2IntMaps.unmodifiable(this.reputationData)` |
| `@Nonnull private` | `Set<UUID>` | `activeObjectiveUUIDs` | `ConcurrentHashMap.newKeySet()` |
| `@Nonnull private` | `Set<UUID>` | `unmodifiableActiveObjectiveUUIDs` | `Collections.unmodifiableSet(this.activeObjectiveUUIDs)` |
| `public final` | `Vector3d` | `lastSavedPosition` | `new Vector3d()` |
| `public final` | `Vector3f` | `lastSavedRotation` | `new Vector3f()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getBlockIdVersion()` |
| `public` | `void` | `setBlockIdVersion(int blockIdVersion)` |
| `public` | `String` | `getWorld()` |
| `public` | `void` | `setWorld(@Nonnull String world)` |
| `public` | `String` | `getPreset()` |
| `public` | `void` | `setPreset(@Nonnull String preset)` |
| `@Nonnull public` | `Set<String>` | `getKnownRecipes()` |
| `public` | `void` | `setKnownRecipes(@Nonnull Set<String> knownRecipes)` |
| `@Nonnull public` | `Map<String, PlayerWorldData>` | `getPerWorldData()` |
| `@Nonnull public` | `PlayerWorldData` | `getPerWorldData(@Nonnull String worldName)` |
| `public` | `void` | `setPerWorldData(@Nonnull Map<String, PlayerWorldData> perWorldData)` |
| `@Nonnull public` | `Set<String>` | `getDiscoveredZones()` |
| `public` | `void` | `setDiscoveredZones(@Nonnull Set<String> discoveredZones)` |
| `@Nonnull public` | `Set<UUID>` | `getDiscoveredInstances()` |
| `public` | `void` | `setDiscoveredInstances(@Nonnull Set<UUID> discoveredInstances)` |
| `@Nonnull public` | `Object2IntMap<String>` | `getReputationData()` |
| `public` | `void` | `setReputationData(@Nonnull Object2IntMap<String> reputationData)` |
| `@Nonnull public` | `Set<UUID>` | `getActiveObjectiveUUIDs()` |
| `public` | `void` | `setActiveObjectiveUUIDs(@Nonnull Set<UUID> activeObjectiveUUIDs)` |
| `public` | `void` | `markChanged()` |
| `public` | `boolean` | `consumeHasChanged()` |
| `public` | `void` | `cleanup(@Nonnull Universe universe)` |
