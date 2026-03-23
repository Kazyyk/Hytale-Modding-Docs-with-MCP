---
title: "PlayerSkinComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSkinComponent"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "component"
  - "skin"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerSkinComponent implements Component<EntityStore>
```

An ECS component that holds the player's skin data. Tracks whether the skin has been updated since the last network sync via the `isNetworkOutdated` flag.

## Static Methods

```java
@Nonnull
public static ComponentType<EntityStore, PlayerSkinComponent> getComponentType()
```

Returns the component type from `EntityModule.get().getPlayerSkinComponentType()`.

## Constructors

```java
public PlayerSkinComponent(@Nonnull PlayerSkin playerSkin)
```

Creates the component with the given skin data.

## Methods

```java
public boolean consumeNetworkOutdated()
```

Returns `true` if the skin needs to be re-sent to clients, and clears the flag.

```java
@Nonnull
public PlayerSkin getPlayerSkin()
```

Returns the `PlayerSkin` data.

```java
public void setNetworkOutdated()
```

Marks the skin as needing network synchronization.

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns a new `PlayerSkinComponent` wrapping the same `PlayerSkin`.

## Related Types

- [ApplyRandomSkinPersistedComponent](ApplyRandomSkinPersistedComponent.md) -- flags for random skin assignment
- [PlayerSystems.PlayerSpawnedSystem](PlayerSystems.PlayerSpawnedSystem.md) -- includes skin in player self update
