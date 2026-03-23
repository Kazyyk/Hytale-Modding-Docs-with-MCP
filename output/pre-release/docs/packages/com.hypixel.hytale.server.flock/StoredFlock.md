---
title: "StoredFlock"
kind: "class"
package: "com.hypixel.hytale.server.flock"
fqcn: "com.hypixel.hytale.server.flock.StoredFlock"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "spawning"
---

**Package:** `com.hypixel.hytale.server.flock`

```java
public class StoredFlock
```

Serializable container for persisting flock NPC entities when a spawn marker deactivates. Stores NPCs as `Holder<EntityStore>` arrays. Used by the spawning system's `SpawnMarkerEntity` to save/restore NPCs when players leave the deactivation range.

## Methods

```java
public void storeNPCs(@Nonnull List<Ref<EntityStore>> refs, @Nonnull Store<EntityStore> store)
```

Removes entities from the store (with `UNLOAD` reason) and saves their serializable data as holders.

```java
public boolean hasStoredNPCs()
```

Returns `true` if this container has stored entity data.

```java
public void restoreNPCs(@Nonnull List<Ref<EntityStore>> output, @Nonnull Store<EntityStore> store)
```

Re-adds stored entities to the store (with `LOAD` reason) and appends the new refs to the output list.

```java
public void clear()
```

Releases stored holder data.

```java
@Nonnull
public StoredFlock clone()
```

```java
@Nonnull
public StoredFlock cloneSerializable()
```

## Related Types

- [FlockPlugin](FlockPlugin.md) -- the flock system
- `SpawnMarkerEntity` -- uses StoredFlock for deactivation persistence
