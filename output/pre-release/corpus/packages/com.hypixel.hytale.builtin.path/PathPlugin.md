# PathPlugin

Type: class | Package: com.hypixel.hytale.builtin.path | Extends: JavaPlugin

public class PathPlugin extends JavaPlugin

Plugin providing the path and patrol system. Registers entity types for path markers, ECS systems for managing prefab paths and world paths, and commands for path manipulation. Manages spatial indexing of path markers using KDTree.

## Methods

- public static PathPlugin get()
- public ResourceType<EntityStore, WorldPathData> getWorldPathDataResourceType()
- public ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> getPrefabPathSpatialResource()
- public ComponentType<EntityStore, WorldPathBuilder> getWorldPathBuilderComponentType()
- public Model getPathMarkerModel()

## Constants

- public static final KeyedCodec<String> PATH_MARKER_MODEL
- public static final String DEFAULT_PATH_MARKER_MODEL

Also in this package: AddOrRemove, AddedFromWorldGen, NameplateHolderSystem, NameplateRefChangeSystem, PathSet, PathSpatialSystem, PrefabPasteEventSystem, PrefabPathCollection, PrefabPathSystems, PrefabPlaceEntityEventSystem, WorldGenChangeSystem, WorldPathBuilder, WorldPathData

Complete API:
  public static PathPlugin get()
  protected void setup()
  protected void start()
  public ResourceType<EntityStore,WorldPathData> getWorldPathDataResourceType()
  public ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> getPrefabPathSpatialResource()
  public ComponentType<EntityStore,WorldPathBuilder> getWorldPathBuilderComponentType()
  public Model getPathMarkerModel()
  protected void onModelsChanged(LoadedAssetsEvent<String,ModelAsset,DefaultAssetMap<String,ModelAsset>> event)

Fields:
public static final KeyedCodec<String> PATH_MARKER_MODEL
public static final String DEFAULT_PATH_MARKER_MODEL
private static PathPlugin instance
private ResourceType<EntityStore,WorldPathData> worldPathDataResourceType
private ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> prefabPathSpatialResource
private ComponentType<EntityStore,WorldPathBuilder> worldPathBuilderComponentType
private Model pathMarkerModel
