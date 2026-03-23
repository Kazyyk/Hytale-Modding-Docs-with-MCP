# PlayerCameraTopdownCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.camera | Extends: AbstractTargetPlayerCommand

public class PlayerCameraTopdownCommand extends AbstractTargetPlayerCommand

## Fields

- @Nonnull private static final Message MESSAGE_COMMANDS_CAMERA_TOPDOWN_SUCCESS

## Constructors

- public PlayerCameraTopdownCommand()

## Methods

- @Override protected void execute(@Nonnull CommandContext context,
        @Nullable Ref<EntityStore> sourceRef,
        @Nonnull Ref<EntityStore> ref,
        @Nonnull PlayerRef playerRef,
        @Nonnull World world,
        @Nonnull Store<EntityStore> store)` |

Also in this package: CameraDemo, PlayerCameraDemoActivateCommand, PlayerCameraDemoDeactivateCommand, PlayerCameraDemoSubCommand, PlayerCameraResetCommand, PlayerCameraSideScrollerCommand, PlayerCameraSubCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_CAMERA_TOPDOWN_SUCCESS
