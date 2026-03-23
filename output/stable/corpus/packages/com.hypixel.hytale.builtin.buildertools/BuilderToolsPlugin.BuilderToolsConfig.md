# BuilderToolsPlugin.BuilderToolsConfig

Type: class | Package: com.hypixel.hytale.builtin.buildertools

public static class BuilderToolsConfig

Configuration class for the builder tools plugin, loaded from the `"BuilderToolsModule"` config file. Serialized via `BuilderCodec`.

## Codec


public static final BuilderCodec<BuilderToolsPlugin.BuilderToolsConfig> CODEC

Defines two configuration fields:

- HistoryCount | int | 50 | None | The number of builder tool edit operations to keep in the undo/redo history.
- ToolExpireTime | long | 3600 | >= 0 | The minimum time (in seconds) that a user's builder tool data will be persisted for after they disconnect from the server. If set to zero the player's data is removed immediately on disconnect.

## Fields


private int historyCount = 50


private long toolExpireTime = 3600L

## Related Types

- BuilderToolsPlugin -- loads and applies this configuration during `start()`
- BuilderToolsPlugin.BuilderState -- uses `historyCount` to limit undo/redo queue size
