# TeleportHomeCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.teleport | Extends: AbstractPlayerCommand

public class TeleportHomeCommand extends AbstractPlayerCommand

## Fields

- private static final Message MESSAGE_COMMANDS_TELEPORT_TELEPORTED_SELF_HOME
- TransformComponent transformComponent
- HeadRotation headRotationComponent
- Vector3d previousPos
- Vector3f previousHeadRotation
- TeleportHistory teleportHistoryComponent
- Teleport teleportComponent

## Constructors

- public TeleportHomeCommand()

## Methods

- protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)
