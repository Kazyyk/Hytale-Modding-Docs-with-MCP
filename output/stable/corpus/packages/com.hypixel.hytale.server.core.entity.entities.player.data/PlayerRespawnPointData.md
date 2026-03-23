# PlayerRespawnPointData

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.data

public final class PlayerRespawnPointData

Provides PlayerRespawnPointData functionality within the data subsystem.

## Fields

- private Vector3i blockPosition
- private Vector3d respawnPosition
- private String name

## Methods

- public PlayerRespawnPointData(@Nonnull Vector3i blockPosition, @Nonnull Vector3d respawnPosition, @Nonnull String name)
- private PlayerRespawnPointData()
- public Vector3i getBlockPosition()
- public Vector3d getRespawnPosition()
- public String getName()
- public void setName(@Nonnull String name)

Also in this package: PlayerConfigData, PlayerDeathPositionData, PlayerWorldData, UniqueItemUsagesComponent

Complete API:
  public Vector3i getBlockPosition()
  public Vector3d getRespawnPosition()
  public String getName()
  public void setName(String name)

Fields:
public static final BuilderCodec<PlayerRespawnPointData> CODEC
private Vector3i blockPosition
private Vector3d respawnPosition
private String name
