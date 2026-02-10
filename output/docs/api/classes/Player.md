---
title: "Player"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities"
api_surface: "public"
extends:
  - "LivingEntity"
implements:
  - "CommandSender"
  - "PermissionHolder"
  - "MetricProvider"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:45:00Z"
tags:
  - "entity"
  - "player"
  - "class"
---

> Package: `com.hypixel.hytale.server.core.entity.entities`

```java
public class Player extends LivingEntity implements CommandSender, PermissionHolder, MetricProvider
```

The core player entity class. Represents a connected human player in the game world. Extends [LivingEntity](LivingEntity.md) with player-specific functionality: UI managers, game mode control, spawn protection, permissions, and command sending.

`Player` implements three interfaces:
- [CommandSender](CommandSender.md) -- can execute commands and receive messages
- `PermissionHolder` -- has a permission set that can be queried
- `MetricProvider` -- exposes performance metrics for monitoring

## Constants

```java
public static final int DEFAULT_VIEW_RADIUS_CHUNKS = 6
```

Default client view radius in chunks. Controls how far the server sends chunk data to the client.

```java
public static final long RESPAWN_INVULNERABILITY_TIME_NANOS = TimeUnit.MILLISECONDS.toNanos(3000L)
```

Duration of spawn protection after respawning, in nanoseconds. During this window, `hasSpawnProtection()` returns `true` and the player is immune to damage.

```java
public static final long MAX_TELEPORT_INVULNERABILITY_MILLIS = 10_000L  // 10000ms
```

Maximum duration of invulnerability after a teleport, in milliseconds. Prevents damage during the brief period where the client is loading the new location.

## Serialization

`Player` has a `BuilderCodec` CODEC that extends `LivingEntity.CODEC` with player-specific fields (game mode, view radius, spawn state, configuration data).

## Methods

### Component Type

```java
@Nonnull
public static ComponentType<EntityStore, Player> getComponentType()
```

Returns the ECS [ComponentType](ComponentType.md) for `Player`. Used to access the `Player` component on an entity ref via [Store.getComponent()](Store.md).

### Initialization

```java
public void init(@Nonnull UUID uuid, @Nonnull PlayerRef playerRef)
```

Initializes the player with the given UUID and player reference. Called when a player connection is established and the player entity is created. Sets up the player's identity and binds the network connection.

### Configuration

```java
@Nonnull
public PlayerConfigData getPlayerConfigData()
```

Returns the player's persistent configuration data. `PlayerConfigData` stores per-player settings that persist across sessions.

### UI Managers

`Player` owns several manager objects that control different aspects of the player's client-side UI.

```java
@Nonnull
public WorldMapTracker getWorldMapTracker()
```

Returns the world map tracker. Manages the player's world map state and exploration data.

```java
@Nonnull
public WindowManager getWindowManager()
```

Returns the window manager. Controls server-driven UI windows (inventories, crafting tables, NPC dialogs).

```java
@Nonnull
public PageManager getPageManager()
```

Returns the page manager. Manages multi-page UI content.

```java
@Nonnull
public HudManager getHudManager()
```

Returns the HUD manager. Controls the player's heads-up display elements.

```java
@Nonnull
public HotbarManager getHotbarManager()
```

Returns the hotbar manager. Manages hotbar slot selection and content.

```java
public void resetManagers(@Nonnull Holder<EntityStore> holder)
```

Resets all UI managers to their default state. Called during respawn or world transfer to ensure a clean UI state.

### Spawn State

```java
public boolean isFirstSpawn()
```

Returns `true` if this is the player's first time spawning in this world (i.e., they have never joined before).

```java
public void setFirstSpawn(boolean firstSpawn)
```

Sets the first-spawn flag. Cleared after the player's initial spawn sequence completes.

```java
public boolean hasSpawnProtection()
```

Returns `true` if the player is currently within the spawn protection window (`RESPAWN_INVULNERABILITY_TIME_NANOS` after their last respawn). During this window, the player is immune to damage.

### Respawn

```java
@Nonnull
public static CompletableFuture<Transform> getRespawnPosition(@Nonnull Ref<EntityStore> ref, @Nonnull String worldName, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Resolves the player's respawn position in the named world. Returns a `CompletableFuture` because respawn position resolution may require asynchronous operations (loading spawn chunks, checking for valid spawn locations, collision checking). The returned `Transform` includes position and orientation.

### Game Mode

```java
public GameMode getGameMode()
```

Returns the player's current game mode.

```java
public static void setGameMode(@Nonnull Ref<EntityStore> playerRef, @Nonnull GameMode gameMode, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Sets the player's game mode. Dispatches a `ChangeGameModeEvent` so that systems and plugins can react to the mode change. Static because it operates on the ref and component accessor directly.

```java
public static void initGameMode(@Nonnull Ref<EntityStore> playerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Initializes the player's game mode during entity setup. Applies the default game mode without dispatching a change event.

### View Radius

```java
public int getClientViewRadius()
```

Returns the client-side view radius in chunks. This is the radius the client has requested or been configured with.

```java
public int getViewRadius()
```

Returns the effective server-side view radius in chunks. May differ from the client view radius due to server-side caps or per-player overrides.

### Block Placement

```java
public boolean isOverrideBlockPlacementRestrictions()
```

Returns whether block placement restrictions are overridden for this player. When `true`, the player can place blocks in locations that would normally be restricted (e.g., overlapping entities, protected regions).

```java
public void setOverrideBlockPlacementRestrictions(@Nonnull Ref<EntityStore> ref, boolean overrideBlockPlacementRestrictions, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Sets whether block placement restrictions are overridden for this player.

### Item Pickup

```java
public void notifyPickupItem(@Nonnull Ref<EntityStore> ref, @Nonnull ItemStack itemStack, @Nullable Vector3d position, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Notifies the player that they have picked up an item. Sends the appropriate client notification (pickup animation, inventory update). The `position` parameter specifies where the item was in the world, or `null` if the pickup has no spatial origin (e.g., given via command).

### CommandSender Implementation

```java
@Override
public void sendMessage(@Nonnull Message message)
```

Sends a formatted message to the player's chat. Implementation of `CommandSender.sendMessage()`.

```java
@Override
public String getDisplayName()
```

Returns the player's display name (their username). Implementation of `CommandSender.getDisplayName()`.

### PermissionHolder Implementation

```java
@Override
public boolean hasPermission(@Nonnull String id)
```

Returns whether the player has the named permission. Returns `false` if the permission is not set.

```java
@Override
public boolean hasPermission(@Nonnull String id, boolean def)
```

Returns whether the player has the named permission, returning `def` if the permission is not explicitly set.

### Persistence

```java
@Nonnull
public CompletableFuture<Void> saveConfig(@Nonnull World world, @Nonnull Holder<EntityStore> holder)
```

Saves the player's configuration data to persistent storage. Returns a `CompletableFuture` that completes when the save is finished. Called during world save, player disconnect, and periodic auto-save.

## Related Types

- [LivingEntity](LivingEntity.md) -- parent class providing inventory, stat modifiers, and fall damage
- [Entity](Entity.md) -- root entity class providing identity, lifecycle, and world membership
- [CommandSender](CommandSender.md) -- interface for command execution and message receiving
- [Store](Store.md) -- the `EntityStore` containing player component data
- [Ref](Ref.md) -- entity reference used in most player operations
- [ComponentType](ComponentType.md) -- type key returned by `getComponentType()`
- `PermissionHolder` -- interface for permission checks
- `MetricProvider` -- interface for performance metric exposure
- `GameMode` -- enum of available game modes
- `ChangeGameModeEvent` -- event dispatched when game mode changes via `setGameMode()`
- `HotbarManager` -- manages hotbar slot state
- `WindowManager` -- manages server-driven UI windows
- `PageManager` -- manages multi-page UI content
- `HudManager` -- manages HUD elements
- `WorldMapTracker` -- manages world map exploration state
- `CameraManager` -- manages camera behavior (not exposed via public getter)
- `MovementManager` -- manages movement state (not exposed via public getter)
- `PlayerConfigData` -- persistent per-player configuration
- `PlayerRef` -- network-level player reference
- `Transform` -- position and orientation, returned by `getRespawnPosition()`
- `World` -- the world the player inhabits
- `ItemStack` -- item data for pickup notifications
