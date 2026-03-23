# PrefabEditingMetadata

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor

public class PrefabEditingMetadata

Tracks metadata for a single prefab within an edit session: file path, bounding box (min/max points), anchor position, paste position, dirty state, and the associated anchor entity. Serialized via `BuilderCodec` for persistence across server restarts. Handles anchor entity lifecycle (creation, repositioning, recreation). Determines read-only status based on whether the prefab file resides in a non-default filesystem (e.g., inside a JAR).

## Fields

- uuid | UUID | Unique identifier for this metadata entry.
- prefabPath | Path | Path to the prefab file.
- minPoint | Vector3i | Minimum corner of the prefab bounding box.
- maxPoint | Vector3i | Maximum corner of the prefab bounding box.
- anchorPoint | Vector3i | Current anchor point in world coordinates.
- pastePosition | Vector3i | Position where the prefab was pasted.
- anchorEntityUuid | UUID | UUID of the anchor marker entity, or null.
- anchorEntityPosition | Vector3i | World position of the anchor entity.
- originalFileAnchor | Vector3i | Original file anchor offset (anchorPoint - pastePosition).
- dirty | boolean | Whether the prefab has unsaved modifications.

## Constructor


public PrefabEditingMetadata(@Nonnull Path prefabPath, @Nonnull Vector3i minPoint, @Nonnull Vector3i maxPoint, @Nonnull Vector3i anchorPoint, @Nonnull Vector3i pastePosition, @Nonnull World world)

## Key Methods

- setPrefabPath(Path) | void | Updates the prefab file path.
- setAnchorPoint(Vector3i, World) | void | Repositions the anchor, updating the delta and recreating the anchor entity.
- recreateAnchorEntity(World) | void | Recreates the anchor marker entity at its current position.
- sendAnchorHighlightingPacket(PacketHandler) | void | Sends a `BuilderToolShowAnchor` packet to highlight the anchor.
- isLocationWithinPrefabBoundingBox(Vector3i) | boolean | Checks whether a position falls within the prefab bounds.
- getUuid() | UUID | Returns the metadata UUID.
- getPrefabPath() | Path | Returns the prefab file path.
- getMinPoint() | Vector3i | Returns the minimum bounding box corner.
- getMaxPoint() | Vector3i | Returns the maximum bounding box corner.
- getAnchorPoint() | Vector3i | Returns the anchor position.
- getPastePosition() | Vector3i | Returns the paste position.
- getOriginalFileAnchor() | Vector3i | Returns the original file anchor offset.
- isDirty() | boolean | Whether the prefab has unsaved changes.
- setDirty(boolean) | void | Sets the dirty flag.
- isReadOnly() | boolean | Whether the prefab is from a non-default filesystem (read-only).

## See Also

- PrefabEditSession
- PrefabAnchor
