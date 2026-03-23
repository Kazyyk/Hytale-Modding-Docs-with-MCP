# PrefabPathCollection

Type: class | Package: com.hypixel.hytale.builtin.path

public class PrefabPathCollection

Collection of prefab paths within a single worldgen context. Stores paths by UUID and by friendly name index, supporting nearest-path lookup by position with optional exclusion sets.

## Methods

- @Nullable public IPrefabPath getNearestPrefabPath(int nameIndex, @Nonnull Vector3d position, Set<UUID> disallowedPaths, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public IPrefabPath getPath(UUID id)
- public IPrefabPath getOrConstructPath(@Nonnull UUID id, @Nonnull String name, @Nonnull IntBiObjFunction<UUID, String, IPrefabPath> pathGenerator)
- @Nullable public IPrefabPath getNearestPrefabPath(@Nonnull Vector3d position, @Nullable Set<UUID> disallowedPaths, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void removePathWaypoint(UUID id, int index)
- public void unloadPathWaypoint(UUID id, int index)
- public void removePath(UUID id)
- public boolean isEmpty()
- public void forEach(BiConsumer<UUID, IPrefabPath> consumer)

Also in this package: AddOrRemove, AddedFromWorldGen, NameplateHolderSystem, NameplateRefChangeSystem, PathPlugin, PathSet, PathSpatialSystem, PrefabPasteEventSystem, PrefabPathSystems, PrefabPlaceEntityEventSystem, WorldGenChangeSystem, WorldPathBuilder, WorldPathData

Complete API:
  public IPrefabPath getNearestPrefabPath(int nameIndex, Vector3d position, Set<UUID> disallowedPaths, ComponentAccessor<EntityStore> componentAccessor)
  public IPrefabPath getPath(UUID id)
  public IPrefabPath getOrConstructPath(UUID id, String name, IntBiObjFunction<UUID,String,IPrefabPath> pathGenerator)
  public IPrefabPath getNearestPrefabPath(Vector3d position, Set<UUID> disallowedPaths, ComponentAccessor<EntityStore> componentAccessor)
  public void removePathWaypoint(UUID id, int index)
  public void unloadPathWaypoint(UUID id, int index)
  private void removePathWaypoint(UUID id, int index, boolean unload)
  public void removePath(UUID id)
  public boolean isEmpty()
  public void forEach(BiConsumer<UUID,IPrefabPath> consumer)

Fields:
private static final HytaleLogger LOGGER
private final int worldgenId
private final Map<UUID,IPrefabPath> paths
private final Int2ObjectMap<PrefabPathCollection.PathSet> pathsByFriendlyName
