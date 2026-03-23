# CameraDemo

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.camera

public class CameraDemo

## Fields

- public static final CameraDemo INSTANCE
- private final EventRegistry eventRegistry
- private final ServerCameraSettings cameraSettings
- private boolean isActive

## Methods

- public void activate()
- public void deactivate()
- private void onAddNewPlayer(@Nonnull PlayerRef player)
- private void onPlayerMouseButton(@Nonnull PlayerMouseButtonEvent event)
- @Nonnull private static ServerCameraSettings createServerCameraSettings()

Also in this package: PlayerCameraDemoActivateCommand, PlayerCameraDemoDeactivateCommand, PlayerCameraDemoSubCommand, PlayerCameraResetCommand, PlayerCameraSideScrollerCommand, PlayerCameraSubCommand, PlayerCameraTopdownCommand

Complete API:
  public void activate()
  public void deactivate()
  private void onAddNewPlayer(PlayerRef player)
  private void onPlayerMouseButton(PlayerMouseButtonEvent event)
  private static ServerCameraSettings createServerCameraSettings()

Fields:
public static final CameraDemo INSTANCE
private final EventRegistry eventRegistry
private final ServerCameraSettings cameraSettings
private boolean isActive
