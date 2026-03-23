# BuilderToolsPacketHandler

Type: class | Package: com.hypixel.hytale.builtin.buildertools | Implements: SubPacketHandler

public class BuilderToolsPacketHandler implements SubPacketHandler

Handles all client-to-server packets for the builder tools system. Registered as a sub-packet handler via `ServerManager.registerSubPacketHandlers()` during BuilderToolsPlugin setup. If the plugin is disabled at registration time, all builder tool packet IDs are registered as no-op handlers.

## Permission Model

All handlers require the base permission `hytale.editor.builderTools`. Some handlers require additional sub-permissions:

- hytale.editor.builderTools | Entity actions, entity transforms, entity scale, transformation mode, prefab unselect, entity pickup, entity light, NPC debug, entity collision
- hytale.editor.brush.config | Tool argument updates
- hytale.editor.brush.use | On-use interaction (brush click), line action
- hytale.editor.selection.use | Selection update
- hytale.editor.selection.modify | Extrude action
- hytale.editor.selection.clipboard | Rotate clipboard, paste clipboard, ask for clipboard, selection transform, stack area
- hytale.editor.history | Undo/redo (via general action handler)

When permission is denied, the player receives the `server.builderTools.usageDenied` translation message.

## Constructor


public BuilderToolsPacketHandler(@Nonnull IPacketHandler packetHandler)

## Packet Handlers

### registerHandlers


@Override
public void registerHandlers()

Registers all packet handlers with the parent `IPacketHandler`. When the plugin is disabled, registers no-op handlers for packet IDs 400, 401, 412, 409, 403, 406, 407, 413, 414, 417.

### Tool Argument Update (ID 400)


public void handleBuilderToolArgUpdate(
    @Nonnull BuilderToolArgUpdate packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)

Delegates to `BuilderToolsPlugin.onToolArgUpdate()` to update a builder tool's argument value for the player.

### Entity Action (ID 401)


public void handleBuilderToolEntityAction(
    @Nonnull BuilderToolEntityAction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)

Handles Freeze, Clone, and Remove entity actions. Prevents targeting players. Freeze delegates to `npc freeze --toggle` command, Clone to `EntityCloneCommand.cloneEntity()`, and Remove to `EntityRemoveCommand.removeEntity()`.

### General Action (ID 412)


public void handleBuilderToolGeneralAction(
    @Nonnull BuilderToolGeneralAction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)

Dispatches general builder tool actions: `HistoryUndo`, `HistoryRedo`, `SelectionCopy`, `SelectionPosition1`, `SelectionPosition2`, `ActivateToolMode`, and `DeactivateToolMode`. Each action checks its own sub-permission before executing.

### Selection Update (ID 409)


public void handleBuilderToolSelectionUpdate(
    @Nonnull BuilderToolSelectionUpdate packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)

Updates the player's selection bounds from the packet's min/max coordinates.

### Brush On-Use Interaction (ID 413)


public void handleBuilderToolOnUseInteraction(
    @Nonnull BuilderToolOnUseInteraction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)

Queues a brush edit operation on the player's builder state.

### Extrude Action (ID 403)


public void handleBuilderToolExtrudeAction(
    @Nonnull BuilderToolExtrudeAction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)

Handles the Extrude tool, reading `ExtrudeDepth`, `ExtrudeRadius`, and `ExtrudeMaterial` from the active builder tool's arguments.

### Line Action (ID 414)


public void handleBuilderToolLineAction(
    @Nonnull BuilderToolLineAction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)

Draws a line of blocks between start and end coordinates using the Line tool's parameters: width, height, shape, origin, wall thickness, spacing, density, and material.

### Clipboard Operations

- **Rotate Clipboard (ID 406):** Rotates the player's clipboard by the specified axis and angle.
- **Paste Clipboard (ID 407):** Pastes the clipboard at the given coordinates.
- **Ask for Clipboard (ID 410):** Sends clipboard block, fluid, and entity data back to the client for preview rendering.
- **Selection Transform (ID 405):** Applies a rotation and translation transform to the selection, with optional cut of the original. Handles large selections (over 20,000 blocks) with warning messages.
- **Stack Area (ID 404):** Stacks the selected area in a normal direction for a given number of repetitions.

### Entity Manipulation

- **Set Entity Transform (ID 402):** Updates entity position, look orientation, and body orientation.
- **Set Entity Scale (ID 420):** Sets the scale of a prop entity via `EntityScaleComponent`.
- **Set Entity Pickup Enabled (ID 421):** Toggles the pickup interaction on a prop entity by adding/removing `Interactable`, `Interactions`, and `PreventPickup` components.
- **Set Entity Light (ID 422):** Adds or removes `DynamicLight` and `PersistentDynamicLight` components on an entity.
- **Set NPC Debug (ID 423):** Toggles NPC debug display via the `npc debug` command.
- **Set Entity Collision (ID 425):** Sets or removes `HitboxCollision` component on prop/NPC entities.

### Hotbar Management

- **Load Hotbar (ID 106):** Loads a saved hotbar row.
- **Save Hotbar (ID 107):** Saves the current hotbar row.

### Prefab Unselect (ID 417)


public void handlePrefabUnselectPrefab(
    @Nonnull PrefabUnselectPrefab packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)

Clears the selected prefab in the player's active prefab editing session.

### Utility


@Nonnull
public Vector3i fromBlockPosition(@Nonnull BlockPosition position)

Converts a protocol `BlockPosition` to a `Vector3i`.

## Related Types

- BuilderToolsPlugin -- registers this handler during setup
- BuilderToolsPlugin.BuilderState -- per-player state that most handlers operate on
- PrototypePlayerBuilderToolSettings -- per-player settings for transformation mode and brush state
- EditOperation -- tracks block changes for brush operations

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)

Complete API:
  private static boolean hasPermission(PlayerRef playerRef)
  private static boolean hasPermission(PlayerRef playerRef, String additionalPermission)
  public void registerHandlers()
  public void handleBuilderToolSetTransformationModeState(BuilderToolSetTransformationModeState packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolArgUpdate(BuilderToolArgUpdate packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleLoadHotbar(LoadHotbar packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleSaveHotbar(SaveHotbar packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolEntityAction(BuilderToolEntityAction packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolGeneralAction(BuilderToolGeneralAction packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolSelectionUpdate(BuilderToolSelectionUpdate packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolSelectionToolAskForClipboard(BuilderToolSelectionToolAskForClipboard packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  private void handleBuilderToolSelectionTransform(BuilderToolSelectionTransform packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolExtrudeAction(BuilderToolExtrudeAction packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolStackArea(BuilderToolStackArea packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public Vector3i fromBlockPosition(BlockPosition position)
  public void handleBuilderToolRotateClipboard(BuilderToolRotateClipboard packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolPasteClipboard(BuilderToolPasteClipboard packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolLineAction(BuilderToolLineAction packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolOnUseInteraction(BuilderToolOnUseInteraction packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolSetEntityTransform(BuilderToolSetEntityTransform packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handlePrefabUnselectPrefab(PrefabUnselectPrefab packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolSetEntityScale(BuilderToolSetEntityScale packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolSetEntityPickupEnabled(BuilderToolSetEntityPickupEnabled packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolSetEntityLight(BuilderToolSetEntityLight packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolSetNPCDebug(BuilderToolSetNPCDebug packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void handleBuilderToolSetEntityCollision(BuilderToolSetEntityCollision packet, PlayerRef playerRef, Ref<EntityStore> ref, World world, Store<EntityStore> store)

Fields:
private static final HytaleLogger LOGGER
private static final String BUILDER_TOOL_ID_EXTRUDE
private static final String BUILDER_TOOL_ID_SELECTION
private static final String BUILDER_TOOL_ID_LINE
private static final Message MESSAGE_BUILDER_TOOLS_USAGE_DENIED
private final IPacketHandler packetHandler
