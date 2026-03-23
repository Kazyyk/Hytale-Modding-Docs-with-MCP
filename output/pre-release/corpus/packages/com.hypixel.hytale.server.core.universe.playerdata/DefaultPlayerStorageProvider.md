# DefaultPlayerStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.playerdata | Implements: PlayerStorageProvider

public class DefaultPlayerStorageProvider implements PlayerStorageProvider

Implementation of `PlayerStorageProvider`.

## Fields

- ID | String | Static final String field.

## Methods

- getPlayerStorage() | PlayerStorage | public method.
- toString() | String | public method.

Also in this package: DiskPlayerStorage, DiskPlayerStorageProvider, PlayerStorage, PlayerStorageProvider

Complete API:
  public PlayerStorage getPlayerStorage()
  public String toString()

Fields:
public static final DefaultPlayerStorageProvider INSTANCE
public static final String ID
public static final BuilderCodec<DefaultPlayerStorageProvider> CODEC
public static final DiskPlayerStorageProvider DEFAULT
