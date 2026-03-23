# PlayerCameraDemoActivateCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.camera | Extends: AbstractTargetPlayerCommand

public class PlayerCameraDemoActivateCommand extends AbstractTargetPlayerCommand

## Fields

- @Nonnull private static final Message MESSAGE_COMMANDS_CAMERA_DEMO_ENABLED

## Constructors

- public PlayerCameraDemoActivateCommand()

## Methods

- @Override protected void execute(@Nonnull CommandContext context,
        @Nullable Ref<EntityStore> sourceRef,
        @Nonnull Ref<EntityStore> ref,
        @Nonnull PlayerRef playerRef,
        @Nonnull World world,
        @Nonnull Store<EntityStore> store)` |

Also in this package: CameraDemo, PlayerCameraDemoDeactivateCommand, PlayerCameraDemoSubCommand, PlayerCameraResetCommand, PlayerCameraSideScrollerCommand, PlayerCameraSubCommand, PlayerCameraTopdownCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_CAMERA_DEMO_ENABLED
