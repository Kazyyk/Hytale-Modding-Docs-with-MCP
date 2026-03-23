# NPCMultiSelectCommandBase

Type: abstract class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public abstract class NPCMultiSelectCommandBase extends NPCWorldCommandBase

Abstract base class for NPC commands that can operate on multiple NPCs simultaneously. Extends NPCWorldCommandBase with spatial selection capabilities: cone-based selection from the player's view direction, sphere-based selection around the player, ray-based selection (single entity in crosshair), and role-based filtering.

If an explicit entity argument is provided, operates on that single NPC. Otherwise, uses the player's position and view direction to find NPCs within a configurable cone/sphere. Supports preset selection modes and a nearest-only flag.

## Constants


protected static final float DEFAULT_CONE_ANGLE = 30.0F


protected static final float DEFAULT_RANGE = 8.0F


protected static final float RANGE_MIN = 0.0F


protected static final float RANGE_MAX = 2048.0F


protected static final float CONE_ANGLE_MIN = 0.0F


protected static final float CONE_ANGLE_MAX = 180.0F

## Fields


@Nonnull
protected final OptionalArg<Float> coneAngleArg

Optional cone half-angle in degrees (0--180). Default: 30.


@Nonnull
protected final OptionalArg<Float> rangeArg

Optional selection range in blocks (0--2048). Default: 8.

## Selection Presets

- --cone | 30 | yes | Nearest NPC in a 30-degree cone
- --coneAll | 30 | no | All NPCs in a 30-degree cone
- --sphere | 180 | no | All NPCs in a sphere
- --ray | 0 (raycast) | yes | Single NPC in crosshair

The `--roles` argument accepts a comma-separated list of role names to filter results. The `--nearest` flag restricts to the closest matching NPC.

## Constructors


public NPCMultiSelectCommandBase(@Nonnull String name, @Nonnull String description)


public NPCMultiSelectCommandBase(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)


public NPCMultiSelectCommandBase(@Nonnull String description)

## Methods


@Override
protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)

Performs spatial NPC selection and delegates to `execute` for each matched NPC, or to `processEntityList` for batch processing.


protected void processEntityList(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store, @Nonnull List<Ref<EntityStore>> refs)

Iterates over the selected entity references and calls `execute` for each NPC. Subclasses may override for custom batch behavior.

## Known Subclasses

- NPCDebugCommand.ShowCommand
- NPCDebugCommand.SetCommand
- NPCDebugCommand.ToggleCommand
- NPCDebugCommand.DefaultsCommand
- NPCDebugCommand.ClearCommand

## Related Types

- NPCWorldCommandBase -- parent base class for single-NPC commands
- NPCDebugCommand -- primary user of this base class

Known subclasses: ClearCommand, DefaultsCommand, SetCommand, ShowCommand, ToggleCommand

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
  protected void processEntityList(CommandContext context, World world, Store<EntityStore> store, List<Ref<EntityStore>> refs)

Fields:
protected static final float DEFAULT_CONE_ANGLE
protected static final float DEFAULT_RANGE
protected static final float RANGE_MIN
protected static final float RANGE_MAX
protected static final float CONE_ANGLE_MIN
protected static final float CONE_ANGLE_MAX
protected final OptionalArg<Float> coneAngleArg
protected final OptionalArg<Float> rangeArg
private final OptionalArg<String> rolesArg
private final FlagArg nearestArg
private final FlagArg presetCone30
private final FlagArg presetCone30all
private final FlagArg presetSphere
private final FlagArg presetRay
