# WorldPathBuilder

Type: class | Package: com.hypixel.hytale.builtin.path | Implements: Component<EntityStore>

public class WorldPathBuilder implements Component<EntityStore>

ECS component that holds a `WorldPath` being constructed or edited. Used during interactive path building operations.

## Methods

- public static ComponentType<EntityStore, WorldPathBuilder> getComponentType()
- public WorldPath getPath()
- public void setPath(WorldPath path)
- @Nonnull @Override public Component<EntityStore> clone()

Also in this package: AddOrRemove, AddedFromWorldGen, NameplateHolderSystem, NameplateRefChangeSystem, PathPlugin, PathSet, PathSpatialSystem, PrefabPasteEventSystem, PrefabPathCollection, PrefabPathSystems, PrefabPlaceEntityEventSystem, WorldGenChangeSystem, WorldPathData

Complete API:
  public static ComponentType<EntityStore,WorldPathBuilder> getComponentType()
  public WorldPath getPath()
  public void setPath(WorldPath path)
  public Component<EntityStore> clone()

Fields:
private WorldPath path
