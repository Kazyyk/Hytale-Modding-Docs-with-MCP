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
