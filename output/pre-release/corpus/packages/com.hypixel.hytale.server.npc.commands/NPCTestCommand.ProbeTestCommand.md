# NPCTestCommand.ProbeTestCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractPlayerCommand

public static class NPCTestCommand.ProbeTestCommand extends AbstractPlayerCommand

Inner class of NPCTestCommand. Tests NPC spawn position validity at the player's current location. Runs three probes and a collision validation:

1. **Air probe** (`PositionProbeAir`): checks if the position is valid for air-based NPCs.
2. **Water probe** (`PositionProbeWater`): checks if the position is valid for aquatic NPCs, using the player model's eye height.
3. **Collision validation** (`CollisionModule.validatePosition()`): checks for block collisions at the position with material type 4.

Displays results to the player and logs them to the NPC plugin logger, including the Y position, bounding box, and chunk height at the player's location.

## Constructor


public ProbeTestCommand()

Registers as sub-command `"probe"` with translation key `"server.commands.npc.test.probe.desc"`.

## Related Types

- NPCTestCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
