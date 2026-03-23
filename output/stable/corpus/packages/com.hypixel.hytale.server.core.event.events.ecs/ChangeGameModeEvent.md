# ChangeGameModeEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.ecs | Extends: CancellableEcsEvent

public class ChangeGameModeEvent extends CancellableEcsEvent

A cancellable ECS event fired when the corresponding ChangeGameMode action occurs.

## Fields

- @Nonnull private GameMode gameMode

## Methods

- public ChangeGameModeEvent(@Nonnull GameMode gameMode)
- @Nonnull public GameMode getGameMode()
- public void setGameMode(@Nonnull GameMode gameMode)
