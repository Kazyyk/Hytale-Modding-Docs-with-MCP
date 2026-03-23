# PrefabPathSystems

Type: class | Package: com.hypixel.hytale.builtin.path

public class PrefabPathSystems

Container for ECS systems that manage prefab patrol paths. Handles path marker entity lifecycle, world-gen integration, nameplate display, and prefab paste operations.

## Inner Systems

### AddOrRemove

`HolderSystem<EntityStore>` that registers/unregisters path marker entities with the `WorldPathData` resource when they are added or removed from the store.

### AddedFromWorldGen

`HolderSystem<EntityStore>` that assigns `WorldGenId` to path markers spawned via world generation.

### NameplateHolderSystem

`HolderSystem<EntityStore>` that creates display name and nameplate components for path markers.

### NameplateRefChangeSystem

`RefChangeSystem<EntityStore, DisplayNameComponent>` that syncs nameplate text when display names change on path markers.

### PrefabPlaceEntityEventSystem

`WorldEventSystem<EntityStore, PrefabPlaceEntityEvent>` that assigns new path UUIDs when path markers are placed via prefab paste.

### WorldGenChangeSystem

`RefChangeSystem<EntityStore, WorldGenId>` that updates display names when the worldgen ID changes on path markers.
