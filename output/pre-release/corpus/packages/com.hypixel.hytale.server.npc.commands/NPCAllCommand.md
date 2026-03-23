# NPCAllCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractPlayerCommand

public class NPCAllCommand extends AbstractPlayerCommand

Implements `/npc all`. Spawns one instance of every spawnable NPC role in a grid pattern centered on the player's position. Each spawned NPC receives a `Nameplate` showing its role name and is immediately frozen via the `Frozen` component.

Requires confirmation (`requiresConfirmation = true`).

## Arguments

- distance | Double | no | 4.0 | Spacing between NPCs in the grid (must be > 0)

## Behavior

1. Retrieves all spawnable role template names from `NPCPlugin.getRoleTemplateNames(true)`, sorted case-insensitively.
2. Arranges NPCs in a square grid with `ceil(sqrt(count))` columns, centered on the player.
3. For each role, computes the spawn Y coordinate using `NPCPhysicsMath.heightOverGround()` to place NPCs on the ground surface.
4. Spawns each NPC via `NPCPlugin.spawnEntity()`, adds a `Nameplate` with the role name, and applies the `Frozen` component.
5. Logs warnings for roles that fail to spawn.

## Constructor


public NPCAllCommand()

Registers as sub-command `"all"` with translation key `"server.commands.npc.all.desc"`.

## Related Types

- NPCCommand -- parent command collection
- NPCSpawnCommand -- spawns individual NPC roles with more options
- NPCCleanCommand -- removes all NPCs from a world

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand, NPCDumpCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_NPC_ALL_NO_ROLES_TO_SPAWN
private final OptionalArg<Double> distanceArg
