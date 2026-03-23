# PrefabEditSession

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor | Implements: Resource

public class PrefabEditSession implements Resource<EntityStore>

Represents an active prefab editing session, stored as an ECS resource. Tracks the editor world name, the world the player arrived from (for return teleportation), all loaded prefab metadata, per-player selected prefab state, and the spawn point. Serialized via `BuilderCodec` for persistence. On deserialization, repopulates the session manager and schedules anchor entity recreation.

## Fields

- worldName | String | Name of the editor world.
- worldArrivedFrom | UUID | UUID of the world the player teleported from.
- transformArrivedFrom | Transform | Position/rotation to return the player to.
- worldCreator | UUID | UUID of the player who created the session.
- loadedPrefabMetadata | Map<UUID, PrefabEditingMetadata> | All loaded prefabs, indexed by UUID.
- selectedPrefab | Map<UUID, UUID> | Per-player selected prefab UUID.
- spawnPoint | Vector3i | Spawn point within the editor world.

## Key Methods

- getResourceType() | ResourceType<EntityStore, PrefabEditSession> | Returns the resource type from `BuilderToolsPlugin`.
- addPrefab(Path, Vector3i, Vector3i, Vector3i, Vector3i) | void | Adds a prefab to the session with its bounding box and anchor.
- updatePrefabBounds(UUID, Vector3i, Vector3i) | PrefabEditingMetadata | Updates a prefab's min/max bounds and marks it dirty.
- setSelectedPrefab(Ref, PrefabEditingMetadata, ComponentAccessor) | void | Selects a prefab for the player, highlighting its anchor and creating a selection.
- clearSelectedPrefab(Ref, ComponentAccessor) | boolean | Deselects the current prefab.
- getSelectedPrefab(UUID) | PrefabEditingMetadata | Returns the selected prefab for a player.
- hidePrefabAnchors(PacketHandler) | void | Sends a packet to hide all anchor markers.
- getLoadedPrefabMetadata() | Map<UUID, PrefabEditingMetadata> | Returns all loaded prefab metadata.
- getWorldName() | String | Returns the editor world name.
- getWorldCreator() | UUID | Returns the session creator UUID.

## See Also

- PrefabEditSessionManager
- PrefabEditingMetadata

Also in this package: BlockBreakDirtySystem, BlockPlaceDirtySystem, LoadingError, Phase, PrefabAnchor, PrefabDirtySystems, PrefabEditSessionManager, PrefabEditingMetadata, PrefabEditorCreationContext, PrefabEditorCreationSettings, PrefabLoadingState, PrefabMarkerProvider, PrefabSelectionInteraction, PrefabSetAnchorInteraction, Tri

Complete API:
  public static ResourceType<EntityStore,PrefabEditSession> getResourceType()
  public void addPrefab(Path prefabPath, Vector3i minPoint, Vector3i maxPoint, Vector3i anchorPoint, Vector3i pastePosition)
  public PrefabEditingMetadata updatePrefabBounds(UUID prefab, Vector3i newMin, Vector3i newMax)
  public void setSelectedPrefab(Ref<EntityStore> ref, PrefabEditingMetadata prefabEditingMetadata, ComponentAccessor<EntityStore> componentAccessor)
  public void hidePrefabAnchors(PacketHandler packetHandler)
  public PrefabEditingMetadata getSelectedPrefab(UUID playerUuid)
  public boolean clearSelectedPrefab(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public String getWorldName()
  public UUID getWorldArrivedFrom()
  public Transform getTransformArrivedFrom()
  public UUID getWorldCreator()
  public Vector3i getSpawnPoint()
  public Map<UUID,PrefabEditingMetadata> getLoadedPrefabMetadata()
  public void markPrefabsDirtyAtPosition(Vector3i position)
  public void markPrefabsDirtyInBounds(Vector3i min, Vector3i max)
  private static boolean boundsIntersect(Vector3i aMin, Vector3i aMax, Vector3i bMin, Vector3i bMax)
  public MapMarker[] createPrefabMarkers()
  public static MapMarker createPrefabMarker(PrefabEditingMetadata metadata)
  public PrefabEditSession clone()

Fields:
public static final BuilderCodec<PrefabEditSession> CODEC
private String worldName
private UUID worldArrivedFrom
private Transform transformArrivedFrom
private UUID worldCreator
private final Map<UUID,PrefabEditingMetadata> loadedPrefabMetadata
private final Map<UUID,UUID> selectedPrefab
private Vector3i spawnPoint
