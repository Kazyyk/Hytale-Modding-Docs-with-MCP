# TeleportWorldCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.teleport | Extends: AbstractPlayerCommand

public class TeleportWorldCommand extends AbstractPlayerCommand

## Fields

- private final RequiredArg<String> worldNameArg
- String worldName
- World targetWorld
- Transform spawnPoint
- TransformComponent transformComponent
- HeadRotation headRotationComponent
- Vector3d previousPos
- Vector3f previousRotation
- TeleportHistory teleportHistoryComponent
- Teleport teleportComponent
- Vector3d spawnPos

## Constructors

- public TeleportWorldCommand()

## Methods

- protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)
