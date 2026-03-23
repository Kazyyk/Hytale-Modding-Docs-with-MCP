# WorldPathData

Type: class | Package: com.hypixel.hytale.builtin.path | Implements: Resource<EntityStore>

public class WorldPathData implements Resource<EntityStore>

ECS resource holding all prefab path data for a world. Organizes paths into `PrefabPathCollection` instances keyed by worldgen ID. Provides nearest-path queries, path construction, waypoint management, and bulk retrieval.

## Methods

- public static ResourceType<EntityStore, WorldPathData> getResourceType()
- @Nullable public IPrefabPath getNearestPrefabPath(int worldgenId, int nameIndex, @Nonnull Vector3d position, Set<UUID> disallowedPaths, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nullable public IPrefabPath getNearestPrefabPath(int worldgenId, @Nonnull Vector3d position, Set<UUID> disallowedPaths, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public IPrefabPath getOrConstructPrefabPath(int worldgenId, @Nonnull UUID id, @Nonnull String name, @Nonnull IntBiObjFunction<UUID, String, IPrefabPath> pathGenerator)
- public void removePrefabPathWaypoint(int worldgenId, UUID id, int index)
- public void unloadPrefabPathWaypoint(int worldgenId, UUID id, int index)
- public void removePrefabPath(int worldgenId, UUID id)
- @Nullable public IPrefabPath getPrefabPath(int worldgenId, UUID id, boolean ignoreLoadState)
- public void compactPrefabPath(int worldgenId, UUID id)
- @Nonnull public List<IPrefabPath> getAllPrefabPaths()
- @Nonnull public PrefabPathCollection getPrefabPathCollection(int worldgenId)
