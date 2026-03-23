# NPCRunTestsCommand.NPCTestData

Type: class | Package: com.hypixel.hytale.server.npc.commands | Implements: Component<EntityStore>

public static class NPCRunTestsCommand.NPCTestData implements Component<EntityStore>

Inner class of NPCRunTestsCommand. An ECS component attached to the player entity during an NPC test session to track test state. Stores the list of NPC roles being tested, flock sizes, the current test index, the set of failed roles, and the UUID of the currently spawned test NPC.

The component type is registered by `NPCPlugin` and retrieved via `NPCPlugin.get().getNpcTestDataComponentType()`.

## Fields


private final IntList npcRoles

List of role indices to test.


private final IntList flockSizes

Flock size for each role (parallel to `npcRoles`).


private final IntSet failedRoles

Set of role indices that have been marked as failed.


private int index

Current position in the test sequence.


private UUID targetUUID

UUID of the currently spawned test NPC entity.

## Methods


public static ComponentType<EntityStore, NPCRunTestsCommand.NPCTestData> getComponentType()

Returns the component type, delegating to `NPCPlugin.get().getNpcTestDataComponentType()`.


@Nonnull
@Override
public Component<EntityStore> clone()

Creates a deep copy of the test data, copying the roles list, index, and failed roles set.

## Related Types

- NPCRunTestsCommand -- parent command using this component

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  public static ComponentType<EntityStore,NPCRunTestsCommand.NPCTestData> getComponentType()
  public Component<EntityStore> clone()

Fields:
private final IntList npcRoles
private final IntList flockSizes
private final IntSet failedRoles
private int index
private UUID targetUUID
