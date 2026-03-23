# BlockMountAPI.BlockMountResult

Type: sealed interface | Package: com.hypixel.hytale.builtin.mounts

public sealed interface BlockMountResult permits BlockMountAPI.Mounted, BlockMountAPI.DidNotMount

Sealed result type returned by BlockMountAPI.mountOnBlock(). Permits exactly two implementations:

- Mounted -- successful mount
- DidNotMount -- failure with a specific reason

## Related Types

- BlockMountAPI -- enclosing class
