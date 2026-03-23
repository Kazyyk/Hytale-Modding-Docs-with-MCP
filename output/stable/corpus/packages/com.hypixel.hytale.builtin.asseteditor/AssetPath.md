# AssetPath

Type: record | Package: com.hypixel.hytale.builtin.asseteditor

public record AssetPath(@Nonnull String packId, @Nonnull Path path)

Immutable pair of an asset pack identifier and a file path within that pack. Used throughout the asset editor system to uniquely identify an asset.

## Fields

- packId | String | Asset pack identifier
- path | Path | Relative file path within the pack

## Constants

- EMPTY_PATH | Sentinel value with empty pack ID and empty path

## Constructors


public AssetPath(@Nonnull String packId, @Nonnull Path path)


public AssetPath(com.hypixel.hytale.protocol.packets.asseteditor.AssetPath assetPath)

Converts from the protocol packet representation.

## Methods

- AssetPath toPacket() | Converts to the protocol packet representation with Unix-style path separators
