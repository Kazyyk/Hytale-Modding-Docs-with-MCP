# LegacyEntityTrackerSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.tracker

public class LegacyEntityTrackerSystems

Container class for legacy entity tracker ECS systems that handle network synchronization of visual properties (models, skins, equipment) and visibility filtering (hiding, LOD culling). These systems operate on the `Visible` component from EntityTrackerSystems and queue updates to viewers via the `EntityViewer.queueUpdate()` method.

All inner ticking systems run in `EntityTrackerSystems.QUEUE_UPDATE_GROUP` or `EntityTrackerSystems.FIND_VISIBLE_ENTITIES_GROUP` and support parallel execution.

## Static Methods


@Deprecated
public static boolean clear(@Nonnull Player player, @Nonnull Holder<EntityStore> holder)

Deprecated method to clear a player's tracked entity state. If the player's world is available and the current thread is the world thread, delegates to `EntityTrackerSystems.clear()`. Otherwise, directly clears the `EntityViewer.sent` map from the holder.

## Inner Classes

### LegacyEntityModel


public static class LegacyEntityModel extends EntityTickingSystem<EntityStore>

Per-tick system that sends model and scale updates to viewers. Runs in `EntityTrackerSystems.QUEUE_UPDATE_GROUP`.

When the `ModelComponent` or `EntityScaleComponent` is marked as network-outdated, queues a `ModelUpdate` packet to all current viewers. For newly visible viewers, always sends the current model state. If the entity has a `PropComponent`, also queues a `PropUpdate`.

Queries for entities matching both `Visible` and `ModelComponent`.

### LegacyEntitySkin


public static class LegacyEntitySkin extends EntityTickingSystem<EntityStore>

Per-tick system that sends player skin updates to viewers. Runs in `EntityTrackerSystems.QUEUE_UPDATE_GROUP`.

When the `PlayerSkinComponent` is marked as network-outdated, queues a `PlayerSkinUpdate` packet to all current viewers. For newly visible viewers, always sends the current skin.

Queries for entities matching both `Visible` and `PlayerSkinComponent`.

### LegacyEquipment


public static class LegacyEquipment extends EntityTickingSystem<EntityStore>

Per-tick system that sends equipment updates (armor and held items) to viewers. Runs in `EntityTrackerSystems.QUEUE_UPDATE_GROUP`.

When a living entity's equipment is marked as network-outdated, constructs an `EquipmentUpdate` packet containing:
- Armor slot item IDs from the entity's inventory, with visibility filtering based on `PlayerSettings` and the world's `PlayerConfig.ArmorVisibilityOption` (helmet, cuirass, gauntlets, pants can be individually hidden).
- Right-hand item ID from the inventory's item-in-hand slot.
- Left-hand item ID from the utility item slot.

For newly visible viewers, always sends the current equipment state.

Queries for entities matching both `Visible` and `AllLegacyLivingEntityTypesQuery`.

### LegacyHideFromEntity


public static class LegacyHideFromEntity extends EntityTickingSystem<EntityStore>

Per-tick system that removes hidden entities from viewers' visible sets. Runs in `EntityTrackerSystems.FIND_VISIBLE_ENTITIES_GROUP`, after `CollectVisible`.

For each entity in the viewer's visible set, checks `Entity.isHiddenFromLivingEntity()`. If the entity is hidden and the hiding rules allow it (currently only hides `Player` instances when entity markers are disabled in `PlayerSettings`), removes the entity from the visible set and increments `hiddenCount`.

Queries for entities matching both `EntityViewer` and `AllLegacyLivingEntityTypesQuery`.

### LegacyLODCull


public static class LegacyLODCull extends EntityTickingSystem<EntityStore>

Per-tick system that removes distant small entities from viewers' visible sets based on a level-of-detail ratio. Runs in `EntityTrackerSystems.FIND_VISIBLE_ENTITIES_GROUP`, after `CollectVisible`.

For each entity in the viewer's visible set, computes the squared distance between the viewer and the entity. If the entity's maximum bounding box thickness is less than `ENTITY_LOD_RATIO * distanceSquared`, the entity is culled from the visible set and `lodExcludedCount` is incremented.

Queries for entities matching both `EntityViewer` and `TransformComponent`.

#### Constants


public static final double ENTITY_LOD_RATIO_DEFAULT = 3.5E-5

Default LOD ratio threshold.


public static double ENTITY_LOD_RATIO = 3.5E-5

Mutable LOD ratio threshold. Can be adjusted at runtime.

## Related Types

- EntityTrackerSystems -- core visibility and packet systems that these legacy systems build upon
- EntityTrackerSystems.Visible -- the visibility component all inner systems read
- EntityTrackerSystems.EntityViewer -- the viewer component used for update queuing
- NetworkId -- network identifier assigned to tracked entities
- `ModelComponent` -- model data component read by `LegacyEntityModel`
- `PlayerSkinComponent` -- skin data component read by `LegacyEntitySkin`
- `PlayerSettings` -- player settings controlling equipment visibility and entity marker display
- `BoundingBox` -- bounding box component used by `LegacyLODCull` for size-based culling
