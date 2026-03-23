# PrefabEditorCreationContext

Type: interface | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor

public interface PrefabEditorCreationContext

Provides the parameters needed to create a prefab editing session. Implemented by `PrefabEditorCreationSettings` after processing user input.

## Methods

- getEditor() | Player | Returns the player initiating the session.
- getEditorRef() | PlayerRef | Returns the player ref for the editor.
- getPrefabPaths() | List<Path> | Returns resolved paths to prefab files.
- getBlocksBetweenEachPrefab() | int | Spacing between pasted prefabs.
- getPasteLevelGoal() | int | Target Y level for pasting.
- loadChildPrefabs() | boolean | Whether to recursively load child prefabs.
- shouldLoadEntities() | boolean | Whether to load entities from prefab files.
- getStackingAxis() | PrefabStackingAxis | Axis along which prefabs are stacked.
- getWorldGenType() | WorldGenType | Type of world generation for the editor world.
- getBlocksAboveSurface() | int | Blocks of air above the surface.
- getAlignment() | PrefabAlignment | Alignment method for prefab placement.
- getPrefabRootDirectory() | PrefabRootDirectory | Root directory for resolving prefab paths.
- isWorldTickingEnabled() | boolean | Whether the editor world should tick.
- getRowSplitMode() | PrefabRowSplitMode | How prefabs are split into rows.
- getUnprocessedPrefabPaths() | List<String> | Raw user-entered path strings.
- getEnvironment() | String | Environment asset ID for the editor world.
- getGrassTint() | String | Hex color for grass tint.

## See Also

- PrefabEditorCreationSettings

Known implementors: PrefabEditorCreationSettings

Also in this package: BlockBreakDirtySystem, BlockPlaceDirtySystem, LoadingError, Phase, PrefabAnchor, PrefabDirtySystems, PrefabEditSession, PrefabEditSessionManager, PrefabEditingMetadata, PrefabEditorCreationSettings, PrefabLoadingState, PrefabMarkerProvider, PrefabSelectionInteraction, Tri

Complete API:
  Player getEditor()
  PlayerRef getEditorRef()
  List<Path> getPrefabPaths()
  int getBlocksBetweenEachPrefab()
  int getPasteLevelGoal()
  boolean loadChildPrefabs()
  boolean shouldLoadEntities()
  PrefabStackingAxis getStackingAxis()
  WorldGenType getWorldGenType()
  int getBlocksAboveSurface()
  PrefabAlignment getAlignment()
  PrefabRootDirectory getPrefabRootDirectory()
  boolean isWorldTickingEnabled()
  PrefabRowSplitMode getRowSplitMode()
  List<String> getUnprocessedPrefabPaths()
  String getEnvironment()
  String getGrassTint()
