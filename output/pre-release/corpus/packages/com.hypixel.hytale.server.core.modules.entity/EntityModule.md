# EntityModule

Type: class | Package: com.hypixel.hytale.server.core.modules.entity | Extends: JavaPlugin

public class EntityModule extends JavaPlugin

Core plugin module registering all entity-related ECS components, systems, and resources. Handles registration of transform, model, bounding box, inventory, physics, damage, interaction, tracking, movement, player, item, condition, effect, and teleport components and systems. One of the largest modules in the server; depends on `Universe` and `CollisionModule`.

## Static Methods

- public static EntityModule get()

## Key Component Type Accessors

Returns `ComponentType` instances for:
- Inventory components (Armor, Backpack, Hotbar, Storage, Tool, Utility, Combined)
- Transform, Model, BoundingBox, HeadRotation, SnapshotBuffer
- NetworkId, UUIDComponent, Entity, Player, Frozen
- CachedStatsComponent, and many more

## Relationships

- Extends `JavaPlugin`
- Depends on `Universe`, `CollisionModule`
- Registers InventorySystems and condition codecs
