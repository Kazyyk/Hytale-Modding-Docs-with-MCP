---
title: "EntityModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.EntityModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:13:02Z"
tags:
  - "entity"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity`

```java
public class EntityModule extends JavaPlugin
```

The core server plugin that bootstraps the entire entity system. Registers all entity-related ECS components, systems, spatial resources, and asset stores onto the `EntityStore` component registry. This is the central wiring point for entity lifecycle management, physics, tracking, networking, player systems, items, teleportation, damage data, and model rendering.

Accessed as a singleton via `EntityModule.get()`. Depends on `Universe` and `CollisionModule`.

## Constants

```java
public static final PluginManifest MANIFEST
```

Plugin manifest declaring `EntityModule` as a core plugin with dependencies on `Universe` and `CollisionModule`.

```java
public static final String[] LEGACY_ENTITY_CLASS_NAMES = new String[]{
    "SpawnSuppressor", "Block", "LegacySpawnBeacon", "PatrolPathMarker", "Player", "SpawnBeacon", "SpawnMarker"
}
```

Array of legacy entity class names recognized by the system.

```java
public static final String MOUNT_MOVEMENT_SETTINGS_ASSET_ID = "Mount"
```

Asset identifier for mount movement configuration.

## Singleton Access

```java
public static EntityModule get()
```

Returns the singleton instance, set during construction.

## Constructor

```java
public EntityModule(@Nonnull JavaPluginInit init)
```

Constructs the module and assigns the singleton instance. Called by the server framework.

## Lifecycle

### setup()

```java
@Override
protected void setup()
```

Registers all entity ECS infrastructure. This is the largest registration method in the codebase. Key registrations include:

**Core components:** `Velocity`, `PhysicsValues`, `BoundingBox`, `EntityScaleComponent`, `TransformComponent`, `HeadRotation`, `UUIDComponent`, `CollisionResultComponent`, `NetworkId`, `RotateObjectComponent`, `EffectControllerComponent`, `Interactable`, `Intangible`, `PreventPickup`, `Invulnerable`, `RespondToHit`, `AudioComponent`, `MovementAudioComponent`, `PositionDataComponent`, `ActiveAnimationComponent`, `NewSpawnComponent`.

**Entity components:** `BlockEntity`, `ProjectileComponent`, `Player`, `Frozen`, `MovementManager`, `CameraManager`, `ModelComponent`, `PersistentModel`, `PropComponent`, `NPCMarkerComponent`, `PlayerSkinComponent`, `DisplayNameComponent`, `EntityGroup`, `DamageDataComponent`, `KnockbackComponent`, `DespawnComponent`, `Nameplate`, `HitboxCollision`, `Repulsion`, `Teleport`, `PendingTeleport`, `TeleportRecord`.

**Item components:** `ItemComponent`, `PickupItemComponent`, `PreventItemMerging`, `ItemPhysicsComponent`, `DynamicLight`, `PersistentDynamicLight`, `PrefabCopyableComponent`.

**Spatial resources:** Player, entity, item, and network-sendable KD-tree spatial indices.

**Systems:** Block entity systems, legacy projectile systems, despawn system, player systems (spawn, input, movement, camera, chunk tracking, saving, inventory), entity tracker systems, snapshot systems, transform/UUID migration, teleport, model, audio, damage data, knockback prediction, repulsion, hitbox collision, velocity, physics values, item merge/pickup/physics, dynamic lighting, nameplate, interactable/intangible/invulnerable/respond-to-hit tracker, and more.

**Asset stores:** `HitboxCollisionConfig`, `RepulsionConfig`, `MovementConfig`.

Also registers a global event listener for `LivingEntityInventoryChangeEvent` to handle creative mode hotbar saving.

### start()

```java
@Override
protected void start()
```

Initializes the static `DamageCause` constants (`PHYSICAL`, `PROJECTILE`, `COMMAND`, `DROWNING`, `ENVIRONMENT`, `FALL`, `OUT_OF_WORLD`, `SUFFOCATION`) from the asset map. Throws `IllegalStateException` if any default cause is missing.

## Entity Registration

```java
@Nullable
public <T extends Entity> EntityRegistration registerEntity(
    @Nonnull String id, @Nonnull Class<T> clazz, Function<World, T> entityConstructor, @Nullable DirectDecodeCodec<T> codec
)
```

Registers a new entity type with the given string identifier, class, constructor function, and optional codec. Creates a `ComponentType` on the entity store, registers legacy holder and ref systems, and returns an [EntityRegistration](EntityRegistration.md) handle. Returns `null` if the module is disabled.

```java
@Nullable
public <T extends Entity> Function<World, T> getConstructor(@Nullable Class<T> entityClass)
```

Returns the constructor function for the given entity class, or `null` if not registered or module is disabled.

```java
@Nullable
public <T extends Entity> DirectDecodeCodec<T> getCodec(@Nullable Class<T> entityClass)
```

Returns the deserialization codec for the given entity class, or `null` if not registered or module is disabled.

```java
@Nullable
public Class<? extends Entity> getClass(@Nullable String name)
```

Returns the entity class for the given string identifier, or `null` if not found or module is disabled.

```java
@Nullable
public String getIdentifier(@Nullable Class<? extends Entity> entityClass)
```

Returns the string identifier for the given entity class, or `null` if not found or module is disabled.

```java
@Nullable
public <T extends Entity> ComponentType<EntityStore, T> getComponentType(@Nullable Class<T> entityClass)
```

Returns the ECS component type for the given entity class. Throws `IllegalArgumentException` if called with `Player.class` -- use `getPlayerComponentType()` instead.

```java
public boolean isKnown(@Nullable Entity entity)
```

Returns `true` if the given entity's class has a registered constructor.

## Component Type Accessors

The module exposes component types for all registered components. Each accessor returns the `ComponentType` registered during `setup()`.

| Accessor | Component |
|---|---|
| `getPlayerComponentType()` | `Player` |
| `getFrozenComponentType()` | `Frozen` |
| `getChunkTrackerComponentType()` | `ChunkTracker` |
| `getPlayerSkinComponentType()` | `PlayerSkinComponent` |
| `getDisplayNameComponentType()` | `DisplayNameComponent` |
| `getApplyRandomSkinPersistedComponent()` | `ApplyRandomSkinPersistedComponent` |
| `getEntityGroupComponentType()` | `EntityGroup` |
| `getCollisionResultComponentType()` | `CollisionResultComponent` |
| `getEntityViewerComponentType()` | `EntityTrackerSystems.EntityViewer` |
| `getVisibleComponentType()` | `EntityTrackerSystems.Visible` |
| `getDamageDataComponentType()` | `DamageDataComponent` |
| `getKnockbackComponentType()` | `KnockbackComponent` |
| `getDespawnComponentType()` | `DespawnComponent` |
| `getSnapshotWorldInfoResourceType()` | `SnapshotSystems.SnapshotWorldInfo` |
| `getSnapshotBufferComponentType()` | `SnapshotBuffer` |
| `getInteractableComponentType()` | `Interactable` |
| `getIntangibleComponentType()` | `Intangible` |
| `getPreventPickupComponentType()` | `PreventPickup` |
| `getInvulnerableComponentType()` | `Invulnerable` |
| `getRespondToHitComponentType()` | `RespondToHit` |
| `getHiddenFromAdventurePlayerComponentType()` | `HiddenFromAdventurePlayers` |
| `getFromPrefabComponentType()` | `FromPrefab` |
| `getFromWorldGenComponentType()` | `FromWorldGen` |
| `getWorldGenIdComponentType()` | `WorldGenId` |
| `getMovementManagerComponentType()` | `MovementManager` |
| `getNameplateComponentType()` | `Nameplate` |
| `getPersistentRefCountComponentType()` | `PersistentRefCount` |
| `getTransformComponentType()` | `TransformComponent` |
| `getHeadRotationComponentType()` | `HeadRotation` |
| `getNetworkIdComponentType()` | `NetworkId` |
| `getEffectControllerComponentType()` | `EffectControllerComponent` |
| `getMovementStatesComponentType()` | `MovementStatesComponent` |
| `getBlockEntityComponentType()` | `BlockEntity` |
| `getEntityScaleComponentType()` | `EntityScaleComponent` |
| `getCameraManagerComponentType()` | `CameraManager` |
| `getUuidComponentType()` | `UUIDComponent` |
| `getPlayerInputComponentType()` | `PlayerInput` |
| `getKnockbackSimulationComponentType()` | `KnockbackSimulation` |
| `getTeleportComponentType()` | `Teleport` |
| `getProjectileComponentType()` | `ProjectileComponent` |
| `getPendingTeleportComponentType()` | `PendingTeleport` |
| `getTeleportRecordComponentType()` | `TeleportRecord` |
| `getModelComponentType()` | `ModelComponent` |
| `getPersistentModelComponentType()` | `PersistentModel` |
| `getPropComponentType()` | `PropComponent` |
| `getNPCMarkerComponentType()` | `NPCMarkerComponent` |
| `getBoundingBoxComponentType()` | `BoundingBox` |
| `getHitboxCollisionComponentType()` | `HitboxCollision` |
| `getVelocityComponentType()` | `Velocity` |
| `getPhysicsValuesComponentType()` | `PhysicsValues` |
| `getRepulsionComponentType()` | `Repulsion` |
| `getItemComponentType()` | `ItemComponent` |
| `getPickupItemComponentType()` | `PickupItemComponent` |
| `getPreventItemMergingType()` | `PreventItemMerging` |
| `getItemPhysicsComponentType()` | `ItemPhysicsComponent` |
| `getDynamicLightComponentType()` | `DynamicLight` |
| `getPersistentDynamicLightComponentType()` | `PersistentDynamicLight` |
| `getPrefabCopyableComponentType()` | `PrefabCopyableComponent` |
| `getRotateObjectComponentType()` | `RotateObjectComponent` |
| `getNewSpawnComponentType()` | `NewSpawnComponent` |
| `getAudioComponentType()` | `AudioComponent` |
| `getMovementAudioComponentType()` | `MovementAudioComponent` |
| `getPositionDataComponentType()` | `PositionDataComponent` |
| `getPlayerSettingsComponentType()` | `PlayerSettings` |
| `getUniqueItemUsagesComponentType()` | `UniqueItemUsagesComponent` |
| `getActiveAnimationComponentType()` | `ActiveAnimationComponent` |

## Resource Type Accessors

| Accessor | Resource |
|---|---|
| `getPlayerSpatialResourceType()` | Player KD-tree spatial index |
| `getEntitySpatialResourceType()` | Entity KD-tree spatial index |
| `getItemSpatialResourceType()` | Item KD-tree spatial index |
| `getNetworkSendableSpatialResourceType()` | Network-sendable KD-tree spatial index |
| `getInteractableQueueResourceType()` | Interactable queue resource |
| `getIntangibleQueueResourceType()` | Intangible queue resource |
| `getInvulnerableQueueResourceType()` | Invulnerable queue resource |
| `getRespondToHitQueueResourceType()` | Respond-to-hit queue resource |

## System Accessors

```java
public SystemType<EntityStore, EntityModule.MigrationSystem> getMigrationSystemType()
```

Returns the system type for migration systems.

```java
public SystemType<EntityStore, ? extends ISystem<EntityStore>> getVelocityModifyingSystemType()
```

Returns the system type for velocity-modifying systems.

```java
public SystemGroup<EntityStore> getPreClearMarkersGroup()
```

Returns the system group that runs before marker components are cleared.

## Inner Classes

### MigrationSystem

```java
public abstract static class MigrationSystem extends HolderSystem<EntityStore>
```

Abstract base class for migration systems that adapt legacy entity data to the current ECS format.

### LegacyEntityHolderSystem

```java
public static class LegacyEntityHolderSystem<T extends Entity> extends HolderSystem<EntityStore>
```

Holder system that bridges legacy `Entity` objects with the ECS. On entity add, calls `loadIntoWorld()`, assigns a `NetworkId`, and sets the display name. On entity remove, calls `remove()` and `unloadFromWorld()` for `REMOVE` reason, or `unloadFromWorld()` and `clearReference()` for `UNLOAD` reason. Runs with `RootDependency.first()` priority.

### LegacyEntityRefSystem

```java
public static class LegacyEntityRefSystem<T extends Entity> extends RefSystem<EntityStore>
```

Ref system that sets the ECS reference on legacy entity objects after they are added to the store. Runs with `RootDependency.first()` priority.

### LegacyTransformSystem

```java
public static class LegacyTransformSystem extends EntityModule.MigrationSystem
```

Migration system that wires `TransformComponent` to legacy entity objects via `Entity.setTransformComponent()`. Queries via [AllLegacyEntityTypesQuery](AllLegacyEntityTypesQuery.md).

### LegacyUUIDSystem

```java
public static class LegacyUUIDSystem extends EntityModule.MigrationSystem
```

Migration system that synchronizes UUIDs between `UUIDComponent` and legacy entity objects. If the component is missing but the entity has a UUID, adds the component. If the component exists, sets the entity's legacy UUID. Runs before `EntityStore.UUIDSystem`.

### LegacyUUIDUpdateSystem

```java
public static class LegacyUUIDUpdateSystem extends RefChangeSystem<EntityStore, UUIDComponent>
```

Ref change system that keeps legacy entity UUIDs in sync when the `UUIDComponent` is added, set, or removed. Queries via [AllLegacyEntityTypesQuery](AllLegacyEntityTypesQuery.md).

### HiddenFromPlayerMigrationSystem

```java
@Deprecated(forRemoval = true)
public static class HiddenFromPlayerMigrationSystem extends EntityModule.MigrationSystem
```

Deprecated migration system that ensures entities matching a given query have the `HiddenFromAdventurePlayers` component.

### TangibleMigrationSystem

```java
@Deprecated(forRemoval = true)
public static class TangibleMigrationSystem extends EntityModule.MigrationSystem
```

Deprecated migration system that ensures entities matching a given query (currently projectiles) have the `Intangible` component.

### Type (enum)

```java
public static enum Type {
    PLAYERS,
    ALL;
}
```

Enum distinguishing between player-only and all-entity scopes.

## Related Types

- [EntityRegistry](EntityRegistry.md) -- plugin-scoped registry for entity registration
- [EntityRegistration](EntityRegistration.md) -- registration handle returned by `registerEntity()`
- [DespawnComponent](DespawnComponent.md) -- component registered by this module
- [DespawnSystem](DespawnSystem.md) -- system registered by this module
- [BlockEntitySystems](BlockEntitySystems.md) -- block entity systems registered by this module
- [LegacyProjectileSystems](LegacyProjectileSystems.md) -- projectile systems registered by this module
- [AllLegacyEntityTypesQuery](AllLegacyEntityTypesQuery.md) -- query used by migration systems
- [AllLegacyLivingEntityTypesQuery](AllLegacyLivingEntityTypesQuery.md) -- query for living entities
- `JavaPlugin` -- base class providing plugin lifecycle
