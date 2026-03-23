# TeleportTopCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.teleport | Extends: AbstractPlayerCommand

public class TeleportTopCommand extends AbstractPlayerCommand

## Fields

- private static final Message MESSAGE_COMMANDS_TELEPORT_TOP_CHUNK_NOT_LOADED_AT_POS
- private static final Message MESSAGE_COMMANDS_TELEPORT_TELEPORTED_TO_TOP
- private static final String TELEPORT_HISTORY_KEY
- TransformComponent transformComponent
- Vector3d position
- WorldChunk worldChunk
- HeadRotation headRotationComponent
- Vector3f headRotation
- int height

## Constructors

- public TeleportTopCommand()

## Methods

- protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)

Also in this package: SpawnCommand, SpawnOtherCommand, SpawnSetCommand, SpawnSetDefaultCommand, TeleportAllCommand, TeleportBackCommand, TeleportCommand, TeleportForwardCommand, TeleportHistoryCommand, TeleportHomeCommand, TeleportWorldCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_TELEPORT_TOP_CHUNK_NOT_LOADED_AT_POS
private static final Message MESSAGE_COMMANDS_TELEPORT_TELEPORTED_TO_TOP
private static final String TELEPORT_HISTORY_KEY
