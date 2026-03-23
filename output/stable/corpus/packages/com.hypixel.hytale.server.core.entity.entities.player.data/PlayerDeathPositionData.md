# PlayerDeathPositionData

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.data

public final class PlayerDeathPositionData

Provides PlayerDeathPositionData functionality within the data subsystem.

## Constants

- @Nonnull public static final ArrayCodec<PlayerDeathPositionData> ARRAY_CODEC

## Fields

- private String markerId
- private Transform transform
- private int day

## Methods

- private PlayerDeathPositionData()
- public PlayerDeathPositionData(@Nonnull String markerId, @Nonnull Transform transform, int day)
- public String getMarkerId()
- public Transform getTransform()
- public int getDay()

Also in this package: PlayerConfigData, PlayerRespawnPointData, PlayerWorldData, UniqueItemUsagesComponent

Complete API:
  public String getMarkerId()
  public Transform getTransform()
  public int getDay()

Fields:
public static final BuilderCodec<PlayerDeathPositionData> CODEC
public static final ArrayCodec<PlayerDeathPositionData> ARRAY_CODEC
private String markerId
private Transform transform
private int day
