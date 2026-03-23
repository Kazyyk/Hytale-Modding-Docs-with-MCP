# PrefabSetAnchorInteraction

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor | Extends: SimpleInstantInteraction

public class PrefabSetAnchorInteraction extends SimpleInstantInteraction

Interaction handler for setting a prefab's anchor point. On primary or secondary click, determines the targeted block position, finds the containing prefab, selects it, and moves the anchor entity to the target position. Reports errors if no target block, no containing prefab, or no active edit session is found.

## Methods

- firstRun(InteractionType, InteractionContext, CooldownHandler) | void | Sets the anchor of the prefab containing the target block.

## See Also

- PrefabSelectionInteraction
- PrefabEditingMetadata

Also in this package: BlockBreakDirtySystem, BlockPlaceDirtySystem, LoadingError, Phase, PrefabAnchor, PrefabDirtySystems, PrefabEditSession, PrefabEditSessionManager, PrefabEditingMetadata, PrefabEditorCreationContext, PrefabEditorCreationSettings, PrefabLoadingState, PrefabMarkerProvider, PrefabSelectionInteraction, Tri

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)

Fields:
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_NOT_IN_EDIT_SESSION
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_ANCHOR_ERROR_NO_ANCHOR_FOUND
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_SELECT_ERROR_NO_PREFAB_FOUND
private static final Message MESSAGE_COMMANDS_EDIT_PREFAB_ANCHOR_SUCCESS
public static final BuilderCodec<PrefabSetAnchorInteraction> CODEC
