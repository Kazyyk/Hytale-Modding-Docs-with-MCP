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
