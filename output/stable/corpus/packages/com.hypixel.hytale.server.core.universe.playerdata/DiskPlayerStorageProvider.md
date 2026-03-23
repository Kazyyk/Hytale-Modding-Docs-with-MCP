# DiskPlayerStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.playerdata | Implements: PlayerStorageProvider

public class DiskPlayerStorageProvider implements PlayerStorageProvider

Implementation of `PlayerStorageProvider`.

## Fields

- ID | String | Static final String field.

## Methods

- getPath() | Path | public method.
- getPlayerStorage() | PlayerStorage | public method.
- toString() | String | public method.

Also in this package: DefaultPlayerStorageProvider, DiskPlayerStorage, PlayerStorage, PlayerStorageProvider

Complete API:
  public Path getPath()
  public PlayerStorage getPlayerStorage()
  public String toString()

Fields:
public static final String ID
public static final BuilderCodec<DiskPlayerStorageProvider> CODEC
private Path path
