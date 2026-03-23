# PrefabSelectionInteraction

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor | Extends: SimpleInstantInteraction

public class PrefabSelectionInteraction extends SimpleInstantInteraction

Interaction handler for the prefab selection tool. On primary click, ray-traces from the player to find a target block or entity within a prefab bounding box and selects that prefab. On secondary click, selects the nearest prefab by horizontal distance to the player. Reports errors if the player is not in an edit session or no prefab is found at the target.

## Constants

- ENTITY_TARGET_RADIUS | float | 50.0F | Maximum entity targeting distance.

## Methods

- firstRun(InteractionType, InteractionContext, CooldownHandler) | void | Handles primary (ray-trace) and secondary (nearest) selection.

## See Also

- PrefabEditSession
- `PrefabSetAnchorInteraction`

Also in this package: BlockBreakDirtySystem, BlockPlaceDirtySystem, LoadingError, Phase, PrefabAnchor, PrefabDirtySystems, PrefabEditSession, PrefabEditSessionManager, PrefabEditingMetadata, PrefabEditorCreationContext, PrefabEditorCreationSettings, PrefabLoadingState, PrefabMarkerProvider, Tri

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  private static Vector3i getTargetLocation(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_SELECT_ERROR_NO_TARGET_FOUND
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_SELECT_ERROR_NO_PREFAB_FOUND
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_NOT_IN_EDIT_SESSION
private static final float ENTITY_TARGET_RADIUS
public static final BuilderCodec<PrefabSelectionInteraction> CODEC
