# SpawnCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.teleport | Extends: AbstractPlayerCommand

public class SpawnCommand extends AbstractPlayerCommand

## Fields

- private final OptionalArg<Integer> spawnIndexArg
- Transform spawnTransform
- TransformComponent transformComponent
- HeadRotation headRotationComponent
- Vector3d previousPos
- Vector3f previousRotation
- TeleportHistory teleportHistoryComponent
- Teleport teleportComponent
- Vector3d position
- ISpawnProvider spawnProvider
- int spawnIndex
- Transform[] spawnPoints
- int maxIndex
- private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
- private final RequiredArg<PlayerRef> playerArg
- private final OptionalArg<Integer> spawnIndexArg
- PlayerRef targetPlayerRef
- Ref<EntityStore> ref
- Store<EntityStore> store
- World world
- Player playerComponent
- PlayerRef playerRefComponent
- Transform spawn

## Constructors

- public SpawnCommand()

## Methods

- protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)
- private static Transform resolveSpawn(@Nonnull CommandContext context, @Nonnull World world, @Nonnull PlayerRef playerRef, @Nonnull OptionalArg<Integer> spawnIndexArg)
- throw new GeneralCommandException(Message.translation("server.commands.errors.spawnIndexOutOfRange")
- protected void executeSync(@Nonnull CommandContext context)

## Inner Types

- `SpawnCommand.SpawnOtherCommand`

## Related Types

- SpawnSetCommand
- SpawnSetDefaultCommand
